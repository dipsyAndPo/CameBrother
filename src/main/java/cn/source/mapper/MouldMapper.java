package cn.source.mapper;

import cn.source.pojo.Mould;
import cn.source.pojo.MouldExample;
import java.util.List;

public interface MouldMapper {
    /**
     *  根据主键删除数据库的记录,mould
     *
     * @param mid
     */
    int deleteByPrimaryKey(Integer mid);

    /**
     *  新写入数据库记录,mould
     *
     * @param record
     */
    int insert(Mould record);

    /**
     *  动态字段,写入数据库记录,mould
     *
     * @param record
     */
    int insertSelective(Mould record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,mould
     *
     * @param example
     */
    List<Mould> selectByExample(MouldExample example);

    /**
     *  根据指定主键获取一条数据库记录,mould
     *
     * @param mid
     */
    Mould selectByPrimaryKey(Integer mid);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,mould
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Mould record);

    /**
     *  根据主键来更新符合条件的数据库记录,mould
     *
     * @param record
     */
    int updateByPrimaryKey(Mould record);

    int insertBatchSelective(List<Mould> records);

    int updateBatchByPrimaryKeySelective(List<Mould> records);
}