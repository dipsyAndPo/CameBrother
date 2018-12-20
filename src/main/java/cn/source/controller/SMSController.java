package cn.source.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.source.util.IndustrySMS;

@Controller
@ResponseBody
public class SMSController {
	
	
	
	@RequestMapping(value="postSMS",produces="text/html;charset=utf-8",method=RequestMethod.POST)
	@ResponseBody
	public String postSMS(String phone,HttpSession session) {
		System.out.println(phone);
		IndustrySMS in=new IndustrySMS();
		String validate =in.execute(phone);
		String result = in.getResult();
		String yzm="{\"validate\":\""+validate+"\",\"result\":"+result+"}";
		System.out.println(yzm);
		return yzm;
	}
}
