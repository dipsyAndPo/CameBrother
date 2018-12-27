package cn.source.mapper;

import cn.source.pojo.Notice;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface NoticeMapper {
	//删除
	@Delete("delete from notice where nId= #{nid}")
    int deleteNotice(Integer nid);
	
	
	
    //增加
	@Insert("insert into notice(title,context,img,logoimg) values(#{title},#{context},#{img},#{logoimg})")
    int insertNotice(Notice notice);
    //查询所有
    @Select("select * from notice")
    List<Notice> selectNotice();
    //查询前五条公告
    @Select("select * from notice ORDER BY dateLine desc  limit 5")
    List<Notice> selectNoticeBy5();
    

    //修改1
    @Update("update notice set title=#{title} where nId=#{nid}")
    int updateNotice1(Notice notice);
    //修改2
    @Update("update notice set context=#{context} where nId=#{nid}")
    int updateNotice2(Notice notice);


    int updateByPrimaryKey(Notice record);
}