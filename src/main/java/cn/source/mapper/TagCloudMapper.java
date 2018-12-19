package cn.source.mapper;

import cn.source.pojo.TagCloud;
import java.util.List;

public interface TagCloudMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(TagCloud record);

    int insertSelective(TagCloud record);

    List<TagCloud> selectByExample();

    TagCloud selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(TagCloud record);

    int updateByPrimaryKey(TagCloud record);
}