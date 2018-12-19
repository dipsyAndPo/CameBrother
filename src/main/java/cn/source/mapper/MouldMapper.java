package cn.source.mapper;

import cn.source.pojo.Mould;
import java.util.List;

public interface MouldMapper {
	
    int deleteByPrimaryKey(Integer mid);

    int insert(Mould record);

    int insertSelective(Mould record);

    Mould selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(Mould record);

    int updateByPrimaryKey(Mould record);
}