package cn.source.mapper;

import cn.source.pojo.Users;
import cn.source.pojo.UsersExample;
import java.util.List;

public interface UsersMapper {
    /**
     *  根据主键删除数据库的记录,users
     *
     * @param uid
     */
    int deleteByPrimaryKey(Integer uid);

    /**
     *  新写入数据库记录,users
     *
     * @param record
     */
    int insert(Users record);

    /**
     *  动态字段,写入数据库记录,users
     *
     * @param record
     */
    int insertSelective(Users record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,users
     *
     * @param example
     */
    List<Users> selectByExample(UsersExample example);

    /**
     *  根据指定主键获取一条数据库记录,users
     *
     * @param uid
     */
    Users selectByPrimaryKey(Integer uid);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,users
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Users record);

    /**
     *  根据主键来更新符合条件的数据库记录,users
     *
     * @param record
     */
    int updateByPrimaryKey(Users record);

    int insertBatchSelective(List<Users> records);

    int updateBatchByPrimaryKeySelective(List<Users> records);
}