package cn.source.mapper;

import cn.source.pojo.Star;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface StarMapper {
    int deleteByPrimaryKey(Integer sid);
    
    @Insert("insert into star(uId,mId) values(#{user.uid},#{moulds.mid})")
    int insert(Star star);

    int insertSelective(Star record);

    @Select("select * from star")
    List<Star> selectByExample();

    //是否收藏
    @Select("select * from star where mId=#{0} and uId=#{1}")
    @Results({
    	@Result(property="user",column="uId",one=@One(select="cn.source.mapper.UsersMapper.selectByPrimaryKey")),
    	@Result(property="moulds",column="mId",one=@One(select="cn.source.mapper.MouldMapper.selectMouldByMid"))
    })
    Star selectByPrimaryKey(Integer mid,int uid);
    
    //查询用户下的收藏
    @Select("select * from star where uId=#{uid}")
    @Results({
    	@Result(property="moulds",column="mId",one=@One(select="cn.source.mapper.MouldMapper.selectMouldByMid"))
    })
    List<Star> findUserStar(int uid);

    int updateByPrimaryKeySelective(Star record);

    int updateByPrimaryKey(Star record);
}