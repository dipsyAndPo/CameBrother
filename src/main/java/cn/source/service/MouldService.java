package cn.source.service;

import java.util.List;

import cn.source.pojo.Mould;

public interface MouldService {
	//��ѯ����ģ��
	public List<Mould> selectAllMould();
	//ͨ��ID��ѯģ��
	public Mould findMouldById(int mid);

}
