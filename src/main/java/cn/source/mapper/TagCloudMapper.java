package cn.source.mapper;

import cn.source.pojo.TagCloud;
import cn.source.pojo.TagCloudExample;
import java.util.List;

public interface TagCloudMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(TagCloud record);

    int insertSelective(TagCloud record);

    List<TagCloud> selectByExample(TagCloudExample example);

    TagCloud selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(TagCloud record);

    int updateByPrimaryKey(TagCloud record);
}