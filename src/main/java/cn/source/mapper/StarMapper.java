package cn.source.mapper;

import cn.source.pojo.Star;
import java.util.List;

public interface StarMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Star record);

    int insertSelective(Star record);

    List<Star> selectByExample();

    Star selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Star record);

    int updateByPrimaryKey(Star record);
}