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
import cn.source.pojo.Users;
import cn.source.service.UserService;

@Controller
public class UsersController {
	@Autowired
	UserService userService;
	private String jsons;
	ModelAndView mav;
	//登陆
	@RequestMapping(value="userLogin",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String userLogin(String uname,String upwd,HttpSession session) {
		Users users = userService.userLogin(uname, upwd);
		session.setAttribute("users", users);
		jsons=JSON.toJSONString(users);
		return jsons;
		
	}
	
	//通过ID查询用户
		@RequestMapping(value="selectUsersById",produces="text/html;charset=UTF-8")
		@ResponseBody
		public String selectUsersById(HttpSession session) {
			Users users = (Users) session.getAttribute("users");
			if(users==null) {
				return "";
			}else {
				Integer id = users.getUid();
				Users uJson = userService.selectByPrimaryKey(id);
				if(uJson!=null) {
					jsons=JSON.toJSONString(uJson);
				}else {
					jsons="null";
				}
			}
			
			return jsons;
		}
	
	//注册
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
	
	@RequestMapping(value="userEsc",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String userEsc(HttpSession session) {
		session.setAttribute("users", null);
		jsons="成功";
		return jsons;
	}
	
	public void setJsons(String jsons) {
		this.jsons = jsons;
	}
	
	

}
