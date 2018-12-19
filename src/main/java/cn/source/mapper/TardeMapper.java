package cn.source.mapper;

import cn.source.pojo.Tarde;
import cn.source.pojo.TardeExample;
import java.util.List;

public interface TardeMapper {
    /**
     *  根据主键删除数据库的记录,tarde
     *
     * @param tid
     */
    int deleteByPrimaryKey(Integer tid);

    /**
     *  新写入数据库记录,tarde
     *
     * @param record
     */
    int insert(Tarde record);

    /**
     *  动态字段,写入数据库记录,tarde
     *
     * @param record
     */
    int insertSelective(Tarde record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,tarde
     *
     * @param example
     */
    List<Tarde> selectByExample(TardeExample example);

    /**
     *  根据指定主键获取一条数据库记录,tarde
     *
     * @param tid
     */
    Tarde selectByPrimaryKey(Integer tid);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,tarde
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Tarde record);

    /**
     *  根据主键来更新符合条件的数据库记录,tarde
     *
     * @param record
     */
    int updateByPrimaryKey(Tarde record);

    int insertBatchSelective(List<Tarde> records);

    int updateBatchByPrimaryKeySelective(List<Tarde> records);
}