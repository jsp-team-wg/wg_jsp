package com.example.app.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.example.app.dto.FreeBoardDTO;
import com.example.app.dto.MateDTO;
import com.example.app.dto.QnaDTO;
import com.example.app.vo.FreeBoardVO;
import com.example.app.vo.QnaViewDetailVo;
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
	   public int update(FreeBoardDTO freeboardDTO) {
	       return sqlSession.update("freeboard.edit", freeboardDTO);
	   }
	
	//자유게시판 글 수정 불러오기
	public FreeBoardDTO selectWrite(int freeboardNum) {
		Map<String, Integer> params = new HashMap<>();
		params.put("freeboardNum", freeboardNum);
		return sqlSession.selectOne("freeboard.selectWrite", params);
	}
	
	//자유게시판 글 삭제
	public void delete(int freeboardNum) {
		Map<String, Integer> params = new HashMap<>();
		params.put("freeboardNum", freeboardNum);
		sqlSession.delete("freeboard.delete", params);
	}
	
	//자유게시판 글 상세보기
	public FreeBoardVO selectOne(int freeboardNum) {
		Map<String, Integer> params = new HashMap<>();
		params.put("freeboardNum", freeboardNum);
		return sqlSession.selectOne("freeboard.selectOne", params);
	}
		
	//자유게시판 글 리스트 불러오기
	public List<FreeBoardDTO> selectAll(){
		return sqlSession.selectList("freeboard.selectAll");
	}


		public int countFreeboardNum(){
			return sqlSession.selectOne("freeboard.countFreeboardNum");
		}
		
		public int countFreeboardCommentNum(){
			return sqlSession.selectOne("freeboard.countFreeboardCommentNum");
		}
		
		public List<FreeBoardDTO> bringFreeboardList(int firstList) {
			List<FreeBoardDTO> list = new ArrayList<>();
			list = sqlSession.selectList("freeboard.bringFreeboardList",firstList);
			return list;
		}
		
		
		public FreeBoardDTO getPrevView(int listNum) {
			return sqlSession.selectOne("freeboard.getPrevView",listNum);
		}
		
		public void addViewCnt(FreeBoardDTO freeboardDTO) {
			sqlSession.update("freeboard.addViewCnt",freeboardDTO);
		}
		
			
		public FreeBoardDTO bringContent(int listNum) {
			return sqlSession.selectOne("freeboard.bringContent",listNum);
		}
		
	
}

	

