package cn.source.service;

import java.util.List;

import cn.source.pojo.Tarde;

public interface TardeService {
	//查询所有行业
    List<Tarde> selectByExample();
    //删除
    int deleteByPrimaryKey(Integer tid);
    //添加
    int insert(Tarde record);
    //修改
    int updateByPrimaryKeySelective(Tarde record);
}
