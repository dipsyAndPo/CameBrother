package cn.source.service;

import java.util.List;

import cn.source.pojo.Mould;
import cn.source.pojo.Page;

public interface MouldService {
	public List<Mould> selectAllMould();
	public Mould findMouldById(int mid);
	List<Mould> selectMouldlist(Integer tid);
	int deleteByPrimaryKey(Integer mid);
	int updateByPrimaryKeySelectiveaa(Mould mould);
	int updateByPrimaryKeySelective2(Mould mould);
	int updateByPrimaryKeySelective3(Mould mould);
	int updateByPrimaryKeySelective4(Mould mould);
	int updateByPrimaryKeySelective5(Mould mould);
	public List<Mould> Pagelist(Page page);  
	
	//点赞
	public void mouldPraise(int mid);
	//踩
	public void mouldTread(int mid);
	public int total();  

}
