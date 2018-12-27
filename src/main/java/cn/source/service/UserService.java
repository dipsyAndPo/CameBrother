package cn.source.service;


import cn.source.pojo.Users;

public interface UserService {
	//登陆
	public Users userLogin(String uname,String upwd);
	//注册
	public int insertUser(Users users);
	//查询用户名
	public Users ixExists(String uname);
}
