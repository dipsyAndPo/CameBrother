package cn.source.service;

import java.util.List;

import cn.source.pojo.Mould;

public interface MouldService {
	//查询所有模板
	public List<Mould> selectAllMould();
	//通过ID查询模板
	public Mould findMouldById(int mid);

}
