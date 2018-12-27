package cn.source.mapper;

import cn.source.pojo.Users;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface UsersMapper {
	//��¼
	@Select("select * from users where uname=#{0} and upwd=#{1}")
	Users userLogin(String uname,String upwd);
	
	//�ж��û����Ƿ����
	@Select("select * from users where uname=#{uname}")
	Users ixExists(String uname);
	
    int deleteByPrimaryKey(Integer uid);

    @Insert("insert into users(uname,upwd,uphone) values(#{uname},#{upwd},#{uphone})")
    int insert(Users record);

    int insertSelective(Users record);
    
    List<Users> selectByExample();

    @Select("select * from users where uId=#{uid}")
    Users selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}