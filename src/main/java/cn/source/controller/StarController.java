package cn.source.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import cn.source.pojo.Star;
import cn.source.pojo.Users;
import cn.source.service.StarService;

@Controller
public class StarController {
	@Autowired
	StarService starService;
	String jsons;
	
	//收藏
	@RequestMapping("insertStar")
	@ResponseBody
	public String insertStar(Star star,HttpSession session) {
		Users users= (Users) session.getAttribute("users");
		if(users==null) {
			jsons="0";
		}else {
			star.setUser(users);
			int i = starService.insert(star);
			jsons="1";
		}
		
		return jsons;
	}
	
	//是否收藏
	@RequestMapping(value="isStar",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String isStar(int mid,HttpSession session) {
		Users users = (Users) session.getAttribute("users");
		Star star = starService.selectByPrimaryKey(mid,users.getUid());
		if(star!=null) {
				jsons="已收藏";
			
		}else {
			jsons="可以收藏";
		}
		return jsons;
	}
	
	//查询用户下的收藏
	@RequestMapping(value="findUserStar",produces="text/html;charset=UTF-8",method=RequestMethod.POST)
	@ResponseBody
	public String findUserStar(HttpSession session) {
		Users users = (Users) session.getAttribute("users");
		if(users==null) {
			return "";
		}
		Integer uid = users.getUid();
		List<Star> userStars = starService.findUserStar(uid);
		if(userStars.size()==0) {
			jsons="还未收藏";
		}else {
			jsons=JSON.toJSONString(userStars);
		}
		System.out.println(jsons);
		return jsons;
	}
}
