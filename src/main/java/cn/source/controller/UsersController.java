package cn.source.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion.User;

import cn.source.pojo.Users;
import cn.source.service.UserService;

@Controller
public class UsersController {
	@Autowired
	UserService userService;
	private String jsons;
	ModelAndView mav;
	//�û���¼
	@RequestMapping(value="userLogin",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String userLogin(String uname,String upwd,HttpSession session) {
		Users users = userService.userLogin(uname, upwd);
		session.setAttribute("users", users);
		jsons=JSON.toJSONString(users);
		return jsons;
		
	}
	
	//�û�ע��
	@RequestMapping(value="insertUser",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String getJsons(Users users) {
		int i = userService.insertUser(users);
		if(i>0) {
			jsons=JSON.toJSONString(users);
		}
		return jsons;
	}
	
	//�û��Ƿ����
	@RequestMapping(value="isExists",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String isExists(String uname) {
		Users isUserExists = userService.ixExists(uname);
		jsons=JSON.toJSONString(isUserExists);
		return jsons;
	}
	
	
	public void setJsons(String jsons) {
		this.jsons = jsons;
	}
	
	

}
