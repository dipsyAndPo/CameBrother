package cn.source.mapper;

import cn.source.pojo.Mould;
import java.util.List;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface MouldMapper {
	
	@Select("select * from mould")
	@Results({
		@Result(property="tarde",column="tid",one=@One(select="cn.source.mapper.TardeMapper.selectByExample"))
	})
	public List<Mould> selectAllMould();
	
    int deleteByPrimaryKey(Integer mid);

    int insert(Mould record);

    int insertSelective(Mould record);

    Mould selectByPrimaryKey(Integer mid);
    
    int updateByPrimaryKeySelective(Mould record);

    int updateByPrimaryKey(Mould record);
}