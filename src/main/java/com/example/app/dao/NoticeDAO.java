package com.example.app.dao;

import java.util.ArrayList;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.example.app.dto.MateDTO;
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

	
	//공지사항 글쓰기
	public void write(NoticeDTO NoticeDTO) {
		sqlSession.insert("notice.write",NoticeDTO);
	}
	
	//공지사항 글 수정
	public void update(NoticeDTO NoticeDTO) {
		sqlSession.update("notice.update", NoticeDTO);
	}
	
	//공지사항 글 상세보기
	public NoticeDTO selectOne(int noticeNum) {
	    return sqlSession.selectOne("notice.selectOne", noticeNum);
	}
	//공지사항 글 리스트 불러오기
	public List<NoticeDTO> selectAll(){
		return sqlSession.selectList("notice.selectAll");
	}
	
	//공지사항 글 삭제
	public void delete(NoticeDTO noticeDTO) {
		sqlSession.delete("notice.delete", noticeDTO);
	}

	
}
