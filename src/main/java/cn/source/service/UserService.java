package cn.source.service;

import cn.source.pojo.Users;

public interface UserService {
	//登录
	public Users userLogin(String uname,String upwd);
	//注册
	public int insertUser(Users users);
	//判断用户名是否存在
	public Users ixExists(String uname);

}
