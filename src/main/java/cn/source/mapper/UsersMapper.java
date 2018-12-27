package cn.source.mapper;

import cn.source.pojo.Users;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface UsersMapper {
	//登陆
	@Select("select * from users where uname=#{0} and upwd=#{1}")
	Users userLogin(String uname,String upwd);
	
	//查询用户名
	@Select("select * from users where uname=#{uname}")
	Users ixExists(String uname);
	
	//添加用户
    @Insert("insert into users(uname,upwd,uphone) values(#{uname},#{upwd},#{uphone})")
    int insert(Users record);

    //根据uid查询用户
    @Select("select * from users where uId=#{uid}")
    Users selectByPrimaryKey(Integer uid);

}