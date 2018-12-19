package cn.source.mapper;

import cn.source.pojo.TagCloud;
import cn.source.pojo.TagCloudExample;
import java.util.List;

public interface TagCloudMapper {
    /**
     *  根据主键删除数据库的记录,tagcloud
     *
     * @param tid
     */
    int deleteByPrimaryKey(Integer tid);

    /**
     *  新写入数据库记录,tagcloud
     *
     * @param record
     */
    int insert(TagCloud record);

    /**
     *  动态字段,写入数据库记录,tagcloud
     *
     * @param record
     */
    int insertSelective(TagCloud record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,tagcloud
     *
     * @param example
     */
    List<TagCloud> selectByExample(TagCloudExample example);

    /**
     *  根据指定主键获取一条数据库记录,tagcloud
     *
     * @param tid
     */
    TagCloud selectByPrimaryKey(Integer tid);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,tagcloud
     *
     * @param record
     */
    int updateByPrimaryKeySelective(TagCloud record);

    /**
     *  根据主键来更新符合条件的数据库记录,tagcloud
     *
     * @param record
     */
    int updateByPrimaryKey(TagCloud record);

    int insertBatchSelective(List<TagCloud> records);

    int updateBatchByPrimaryKeySelective(List<TagCloud> records);
}