package cn.source.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.source.mapper.MouldMapper;
import cn.source.pojo.Mould;
import cn.source.pojo.Page;
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

	@Override
	public int updateByPrimaryKeySelective4(Mould mould) {
		// TODO Auto-generated method stub
		return mouldMapper.updateByPrimaryKeySelective4(mould);
	}

	@Override
	public int updateByPrimaryKeySelective5(Mould mould) {
		// TODO Auto-generated method stub
		return mouldMapper.updateByPrimaryKeySelective5(mould);
	}
	
	@Override
	public int deleteByPrimaryKey(Integer mid) {
		// TODO Auto-generated method stub
		return mouldMapper.deleteByPrimaryKey(mid);
	}

	@Override
	public List<Mould> Pagelist(Page page) {
		// TODO Auto-generated method stub
		return mouldMapper.Pagelist(page);
	}

	@Override
	public int total() {
		// TODO Auto-generated method stub
		return mouldMapper.total();
	}

	@Override
	public void mouldPraise(int mid) {
		// TODO Auto-generated method stub
		mouldMapper.mouldPraise(mid);
		
	}

	@Override
	public void mouldTread(int mid) {
		// TODO Auto-generated method stub
		mouldMapper.mouldTread(mid);
		
	}

}
