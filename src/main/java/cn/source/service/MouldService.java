package cn.source.service;

import java.util.List;

import cn.source.pojo.Mould;
import cn.source.pojo.Page;

public interface MouldService {
	//查询所有模板
	public List<Mould> selectAllMould();
	//通过ID查询模板
	public Mould findMouldById(int mid);
	//通过外键查询
	List<Mould> selectMouldlist(Integer tid);
	//删除
	int deleteByPrimaryKey(Integer mid);
	//修改1.
	int updateByPrimaryKeySelectiveaa(Mould mould);
	//修改2.
	int updateByPrimaryKeySelective2(Mould mould);
	//修改3.
	int updateByPrimaryKeySelective3(Mould mould);
	//修改4.
	int updateByPrimaryKeySelective4(Mould mould);
	//修改5.
	int updateByPrimaryKeySelective5(Mould mould);
	//分页 
	public List<Mould> Pagelist(Page page);  
	public int total();  

}
