package cn.source.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.source.mapper.MouldMapper;
import cn.source.pojo.Mould;
import cn.source.service.MouldService;

@Service
public class MouldServiceImpl implements MouldService {
	@Autowired 
	MouldMapper mouldMapper;

	@Override
	public List<Mould> selectMouldlist(Integer tid) {
		// TODO Auto-generated method stub
		return mouldMapper.selectMouldlist(tid);
	}

	@Override
	public int updateByPrimaryKeySelectiveaa(Mould mould) {
		// TODO Auto-generated method stub
		return mouldMapper.updateByPrimaryKeySelectiveaa(mould);
	}

	@Override
	public int updateByPrimaryKeySelective2(Mould mould) {
		// TODO Auto-generated method stub
		return mouldMapper.updateByPrimaryKeySelective2(mould);
	}

	@Override
	public int updateByPrimaryKeySelective3(Mould mould) {
		// TODO Auto-generated method stub
		return mouldMapper.updateByPrimaryKeySelective3(mould);
	}

}
