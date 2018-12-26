package cn.source.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
		star.setUser(users);
		int i = starService.insert(star);
		jsons="1";
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
}
