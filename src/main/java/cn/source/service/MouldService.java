package cn.source.service;

import java.util.List;

import cn.source.pojo.Mould;

public interface MouldService {
	//ͨ�������ѯ
	List<Mould> selectMouldlist(Integer tid);
	//�޸�1.
	int updateByPrimaryKeySelectiveaa(Mould mould);
	//�޸�2.
	int updateByPrimaryKeySelective2(Mould mould);
	//�޸�3.
	int updateByPrimaryKeySelective3(Mould mould);

}
