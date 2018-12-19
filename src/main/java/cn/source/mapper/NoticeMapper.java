package cn.source.mapper;

import cn.source.pojo.Notice;
import cn.source.pojo.NoticeExample;
import java.util.List;

public interface NoticeMapper {
    int deleteByPrimaryKey(Integer nid);

    int insert(Notice record);

    int insertSelective(Notice record);

    List<Notice> selectByExample(NoticeExample example);

    Notice selectByPrimaryKey(Integer nid);

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKey(Notice record);
}