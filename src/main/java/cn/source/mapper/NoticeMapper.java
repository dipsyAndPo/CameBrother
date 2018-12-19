package cn.source.mapper;

import cn.source.pojo.Notice;
import cn.source.pojo.NoticeExample;
import java.util.List;

public interface NoticeMapper {
    /**
     *  根据主键删除数据库的记录,notice
     *
     * @param nid
     */
    int deleteByPrimaryKey(Integer nid);

    /**
     *  新写入数据库记录,notice
     *
     * @param record
     */
    int insert(Notice record);

    /**
     *  动态字段,写入数据库记录,notice
     *
     * @param record
     */
    int insertSelective(Notice record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,notice
     *
     * @param example
     */
    List<Notice> selectByExample(NoticeExample example);

    /**
     *  根据指定主键获取一条数据库记录,notice
     *
     * @param nid
     */
    Notice selectByPrimaryKey(Integer nid);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,notice
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Notice record);

    /**
     *  根据主键来更新符合条件的数据库记录,notice
     *
     * @param record
     */
    int updateByPrimaryKey(Notice record);

    int insertBatchSelective(List<Notice> records);

    int updateBatchByPrimaryKeySelective(List<Notice> records);
}