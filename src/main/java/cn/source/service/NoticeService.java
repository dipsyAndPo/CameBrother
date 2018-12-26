package cn.source.service;

import java.util.List;

import cn.source.pojo.Notice;

public interface NoticeService {
	//查询所有
	List<Notice> selectNotice();
	//删除
	int deleteNotice(Integer nid);
	//修改1
	int updateNotice1(Notice notice);
	//修改2
	int updateNotice2(Notice notice);
	//添加
	int insertNotice(Notice notice);

}
