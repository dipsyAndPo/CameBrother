package cn.source.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.source.mapper.CaoMapper;
import cn.source.pojo.Cao;
import cn.source.util.IndustrySMS;

@Controller
@ResponseBody
public class SMSController {
	
	
	
	@RequestMapping(value="postSMS",produces="text/html;charset=utf-8",method=RequestMethod.POST)
	@ResponseBody
	public String postSMS(String phone,HttpSession session) {
		IndustrySMS in=new IndustrySMS();
		String validate =in.execute(phone,suijiint());
		String result = in.getResult();
		String yzm="{\"validate\":\""+validate+"\",\"result\":"+result+"}";
		return yzm;
	}
	
	
	public String suijiint() {
		//随机1000-9999 作为验证码
		int validate=(int)(Math.random()*(9999-1000+1)+1000) ;
		return ""+validate; 
	}
	
	@Autowired CaoMapper cao;
	public String suijici() {
		//随机一句骚话作为验证码
		Cao selectone = cao.selectone();
		return selectone.getCao();
	}
}
