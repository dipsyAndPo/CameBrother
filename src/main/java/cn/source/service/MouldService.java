package cn.source.service;

import java.util.List;

import cn.source.pojo.Mould;
import cn.source.pojo.Page;

public interface MouldService {
	//��ѯ����ģ��
	public List<Mould> selectAllMould();
	//ͨ��ID��ѯģ��
	public Mould findMouldById(int mid);
	//ͨ�������ѯ
	List<Mould> selectMouldlist(Integer tid);
	//ɾ��
	int deleteByPrimaryKey(Integer mid);
	//�޸�1.
	int updateByPrimaryKeySelectiveaa(Mould mould);
	//�޸�2.
	int updateByPrimaryKeySelective2(Mould mould);
	//�޸�3.
	int updateByPrimaryKeySelective3(Mould mould);
	//�޸�4.
	int updateByPrimaryKeySelective4(Mould mould);
	//�޸�5.
	int updateByPrimaryKeySelective5(Mould mould);
	//��ҳ 
	public List<Mould> Pagelist(Page page);  
	
	//点赞
	public void mouldPraise(int mid);
	//踩
	public void mouldTread(int mid);
	public int total();  

}
