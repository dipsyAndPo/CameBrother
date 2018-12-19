package cn.source.mapper;

import cn.source.pojo.Star;
import cn.source.pojo.StarExample;
import java.util.List;

public interface StarMapper {
    /**
     *  根据主键删除数据库的记录,star
     *
     * @param sid
     */
    int deleteByPrimaryKey(Integer sid);

    /**
     *  新写入数据库记录,star
     *
     * @param record
     */
    int insert(Star record);

    /**
     *  动态字段,写入数据库记录,star
     *
     * @param record
     */
    int insertSelective(Star record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,star
     *
     * @param example
     */
    List<Star> selectByExample(StarExample example);

    /**
     *  根据指定主键获取一条数据库记录,star
     *
     * @param sid
     */
    Star selectByPrimaryKey(Integer sid);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,star
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Star record);

    /**
     *  根据主键来更新符合条件的数据库记录,star
     *
     * @param record
     */
    int updateByPrimaryKey(Star record);

    int insertBatchSelective(List<Star> records);

    int updateBatchByPrimaryKeySelective(List<Star> records);
}