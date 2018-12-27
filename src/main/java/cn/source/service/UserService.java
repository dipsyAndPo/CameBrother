package cn.source.service;


import cn.source.pojo.Users;

public interface UserService {
	//��¼
	public Users userLogin(String uname,String upwd);
	//ע��
	public int insertUser(Users users);
	//�ж��û����Ƿ����
	public Users ixExists(String uname);
}
