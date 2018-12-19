package cn.source.mapper;

import cn.source.pojo.Tarde;
import cn.source.pojo.TardeExample;
import java.util.List;

public interface TardeMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(Tarde record);

    int insertSelective(Tarde record);

    List<Tarde> selectByExample(TardeExample example);

    Tarde selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(Tarde record);

    int updateByPrimaryKey(Tarde record);
}