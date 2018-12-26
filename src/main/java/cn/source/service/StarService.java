package cn.source.service;


import cn.source.pojo.Star;

public interface StarService {
	//收藏
	int insert(Star star);
	//是否收藏
	Star selectByPrimaryKey(int mid,int uid);
}
