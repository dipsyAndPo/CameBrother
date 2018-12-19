package cn.source.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.source.mapper.TardeMapper;
import cn.source.pojo.Tarde;
import cn.source.service.TardeService;
@Service
public class TardeServiceImpl implements TardeService {
	@Autowired
	TardeMapper tardeMapper;

	@Override
	public List<Tarde> selectByExample() {
		// TODO Auto-generated method stub
		return tardeMapper.selectByExample();
	}

	@Override
	public int deleteByPrimaryKey(Integer tid) {
		// TODO Auto-generated method stub
		return tardeMapper.deleteByPrimaryKey(tid);
	}

	@Override
	public int insert(Tarde record) {
		// TODO Auto-generated method stub
		return tardeMapper.insert(record);
	}

	@Override
	public int updateByPrimaryKeySelective(Tarde record) {
		// TODO Auto-generated method stub
		return tardeMapper.updateByPrimaryKeySelective(record);
	}
	

}
