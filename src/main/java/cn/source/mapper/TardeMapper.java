package cn.source.mapper;

import cn.source.pojo.Tarde;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface TardeMapper {
	//ɾ��
	@Delete("delete from tarde where tId= #{tid}")
    int deleteByPrimaryKey(Integer tid);
	//���
    @Insert("insert into tarde(tName) values(#{tname})")
    int insert(Tarde record);
    //��ѯ������ҵ
  	@Select("select * from tarde")
    List<Tarde> selectByExample();
    //�޸�
  	@Update("update tarde set tName=#{tname} where tId=#{tid}")
    int updateByPrimaryKeySelective(Tarde record);

    int updateByPrimaryKey(Tarde record);
    int insertSelective(Tarde record);
    Tarde selectByPrimaryKey(Integer tid);
}