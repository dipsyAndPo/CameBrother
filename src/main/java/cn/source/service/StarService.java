package cn.source.service;


import java.util.List;

import cn.source.pojo.Star;

public interface StarService {
	//收藏
	int insert(Star star);
	//是否收藏
	Star selectByPrimaryKey(int mid,int uid);
	//查询用户下的收藏
	List<Star> findUserStar(int uid);
}
