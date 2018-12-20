package cn.source.mapper;

import cn.source.pojo.Mould;
import java.util.List;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface MouldMapper {
	@Select("select * from mould where tId=#{tid} ")
	//多对一
	@Results({
			@Result(property="tarde",column="tid",one=@One(select="cn.source.mapper.TardeMapper.selectListmould"))
    })
	public List<Mould> selectMouldlist(Integer tid);
	@Select("select * from mould")
	@Results({
		@Result(property="tarde",column="tid",one=@One(select="cn.source.mapper.TardeMapper.selectByExample"))
	})
	public List<Mould> selectAllMould();
	//,label=#{label},praise=#{praise},tread=#{tread},img=#{img},logo=#{logo},preview=#{preview},download=#{download}
	//修改1.
	@Update("update mould set mname=#{mname} where mId=#{mid}")
	int updateByPrimaryKeySelectiveaa(Mould mould);
	//修改2.
	@Update("update mould set label=#{label} where mId=#{mid}")
	int updateByPrimaryKeySelective2(Mould mould);
	//修改3.
	@Update("update mould set praise=#{praise} where mId=#{mid}")
	int updateByPrimaryKeySelective3(Mould mould);
		
    int deleteByPrimaryKey(Integer mid);

    int insert(Mould record);

    int insertSelective(Mould record);

    Mould selectByPrimaryKey(Integer mid);

   

    int updateByPrimaryKey(Mould record);
}