package cn.source.service;

import java.util.List;

import cn.source.pojo.Tarde;

public interface TardeService {
	//��ѯ������ҵ
    List<Tarde> selectByExample();
    //ɾ��
    int deleteByPrimaryKey(Integer tid);
    //���
    int insert(Tarde record);
    //�޸�
    int updateByPrimaryKeySelective(Tarde record);
}
