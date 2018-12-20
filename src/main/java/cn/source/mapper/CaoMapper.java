package cn.source.mapper;

import org.apache.ibatis.annotations.Select;

import cn.source.pojo.Cao;

public interface CaoMapper {
	
	@Select("SELECT * FROM cao ORDER BY RAND() LIMIT 1")
	public Cao selectone();

}
