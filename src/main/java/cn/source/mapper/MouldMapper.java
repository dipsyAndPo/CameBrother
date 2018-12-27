package cn.source.mapper;

import cn.source.pojo.Mould;
import cn.source.pojo.Page;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface MouldMapper {
	@Select("select * from mould where tId=#{tid} ")
	//查询每个行业下的详情信息
	@Results({
			@Result(property="tarde",column="tid",one=@One(select="cn.source.mapper.TardeMapper.selectListmould"))
    })
	public List<Mould> selectMouldlist(Integer tid);
	@Select("select * from mould")
	@Results({
		@Result(property="tarde",column="tid",one=@One(select="cn.source.mapper.TardeMapper.selectListmould"))
	})
	public List<Mould> selectAllMould();
	//修改1.
	@Update("update mould set mname=#{mname} where mId=#{mid}")
	int updateByPrimaryKeySelectiveaa(Mould mould);
	//修改2.
	@Update("update mould set label=#{label} where mId=#{mid}")
	int updateByPrimaryKeySelective2(Mould mould);
	//修改3.
	@Update("update mould set praise=#{praise} where mId=#{mid}")
	int updateByPrimaryKeySelective3(Mould mould);
	//修改4.
	@Update("update mould set preview=#{preview} where mId=#{mid}")
	int updateByPrimaryKeySelective4(Mould mould);
	//修改5.
	@Update("update mould set download=#{download} where mId=#{mid}")
	int updateByPrimaryKeySelective5(Mould mould);
	//删除
	@Delete("delete from mould where mId= #{mid}")
    int deleteByPrimaryKey(Integer mid);
	//分页 
	public List<Mould> Pagelist(Page page);  
	public int total();  
	@Select("select * from mould where mId=#{mid}")
	public Mould selectMouldByMid(int mid);
	//点赞
	@Update("update mould set praise=praise+1 where mid=#{mid}")
	public void mouldPraise(int mid);
	//踩
	@Update("update mould set tread=tread+1 where mid=#{mid}")
	public void mouldTread(int mid);
	
	
	
    int insert(Mould record);

    int insertSelective(Mould record);
    
    //ͨ查询所有行业下的详情
    @Select("select * from mould where mId=#{mid}")
    @Results({
    	@Result(property="tarde",column="tid",one=@One(select="cn.source.mapper.TardeMapper.selectListmould"))
    })
    Mould selectByPrimaryKey(Integer mid);

   

    int updateByPrimaryKey(Mould record);
}