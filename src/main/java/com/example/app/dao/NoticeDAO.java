package com.example.app.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.example.app.dto.NoticeDTO;
import com.mybatis.config.MyBatisConfig;

public class NoticeDAO {
public SqlSession sqlSession;
	
	public NoticeDAO(){
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public int countNoticeNum(){
	return sqlSession.selectOne("notice.countNoticeNum");
	}
	
	
	public List<NoticeDTO> bringNoticeList(int firstList) {
		List<NoticeDTO> list = new ArrayList<>();
		list = sqlSession.selectList("notice.bringNoticeList",firstList);
		return list;
	}
	
	public NoticeDTO noticeViewDetail(int listNum){
		return  sqlSession.selectOne("notice.noticeViewDetail",listNum);
	}
	
	
}
