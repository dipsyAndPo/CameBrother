package cn.source.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.source.mapper.NoticeMapper;
import cn.source.pojo.Notice;
import cn.source.service.NoticeService;

@Service
public class NoticeServiceImpl implements NoticeService {
	@Autowired
	NoticeMapper noticeMapper;

	@Override
	public List<Notice> selectNotice() {
		// TODO Auto-generated method stub
		return noticeMapper.selectNotice();
	}

	@Override
	public int deleteNotice(Integer nid) {
		// TODO Auto-generated method stub
		return noticeMapper.deleteNotice(nid);
	}

	@Override
	public int updateNotice1(Notice notice) {
		// TODO Auto-generated method stub
		return noticeMapper.updateNotice1(notice);
	}

	@Override
	public int updateNotice2(Notice notice) {
		// TODO Auto-generated method stub
		return noticeMapper.updateNotice2(notice);
	}

	@Override
	public int insertNotice(Notice notice) {
		// TODO Auto-generated method stub
		return noticeMapper.insertNotice(notice);
	}
	

}
