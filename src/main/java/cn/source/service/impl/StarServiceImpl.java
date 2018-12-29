package cn.source.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.source.mapper.StarMapper;
import cn.source.pojo.Star;
import cn.source.service.StarService;

@Service
public class StarServiceImpl implements StarService{
	@Autowired
	StarMapper starMapper;
	
	@Override
	public int insert(Star star) {
		// TODO Auto-generated method stub
		int i = starMapper.insert(star);
		return i;
	}

	@Override
	public Star selectByPrimaryKey(int mid,int uid) {
		// TODO Auto-generated method stub
		Star star = starMapper.selectByPrimaryKey(mid,uid);
		return star;
	}

	@Override
	public List<Star> findUserStar(int uid) {
		// TODO Auto-generated method stub
		List<Star> userStars = starMapper.findUserStar(uid);
		return userStars;
	}

}
