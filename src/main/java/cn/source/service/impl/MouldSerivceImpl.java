package cn.source.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.source.mapper.MouldMapper;
import cn.source.pojo.Mould;
import cn.source.service.MouldService;

@Service
public class MouldSerivceImpl  implements MouldService{
	@Autowired
	MouldMapper mouldMapper;
	
	@Override
	public List<Mould> selectAllMould() {
		// TODO Auto-generated method stub
		List<Mould> mouldList = mouldMapper.selectAllMould();
		return mouldList;
	}

	@Override
	public Mould findMouldById(int mid) {
		// TODO Auto-generated method stub
		Mould moulds = mouldMapper.selectByPrimaryKey(mid);
		return moulds;
	}

}
