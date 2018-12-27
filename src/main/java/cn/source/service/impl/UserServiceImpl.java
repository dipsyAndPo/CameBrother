package cn.source.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.source.mapper.UsersMapper;
import cn.source.pojo.Users;
import cn.source.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UsersMapper usersMapper;

	@Override
	public Users userLogin(String uname, String upwd) {
		// TODO Auto-generated method stub
		Users users = usersMapper.userLogin(uname, upwd);
		return users;
	}

	@Override
	public int insertUser(Users users) {
		// TODO Auto-generated method stub
		int i = usersMapper.insert(users);
		return i;
	}

	@Override
	public Users selectByPrimaryKey(Integer uid) {
		// TODO Auto-generated method stub
		Users users = usersMapper.selectByPrimaryKey(uid);
		return users;
	}
	@Override
	public Users ixExists(String uname) {
		// TODO Auto-generated method stub
		Users isUserExists = usersMapper.ixExists(uname);
		return isUserExists;
	}


	

}
