package com.example.app.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.example.app.dto.FreeBoardDTO;
import com.example.app.dto.MateDTO;
import com.mybatis.config.MyBatisConfig;

public class FreeBoardDAO {
	
	public SqlSession sqlSession;
	
	public FreeBoardDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	// 자유게시판 글 작성
	public void write(FreeBoardDTO freeboardDTO) {
		sqlSession.insert("freeboard.write", freeboardDTO);
	}
	
	// 자유게시판 글 수정
	public void edit(FreeBoardDTO freeboardDTO) {
		sqlSession.update("freeboard.edit", freeboardDTO);
	}
	
	//자유게시판 글 삭제
	public void delete(int freeboardNum) {
		sqlSession.delete("freeboard.delete", freeboardNum);
	}
	
	//자유게시판 글 상세보기
	public MateDTO selectOne() {
		return sqlSession.selectOne("freeboard.selectOne");
	}
		
	//자유게시판 글 리스트 불러오기
	public List<FreeBoardDTO> selectAll(){
		return sqlSession.selectList("freeboard.selectAll");
	}
		
	
}
