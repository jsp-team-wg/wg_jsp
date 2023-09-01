package com.example.app.dao;

import org.apache.ibatis.session.SqlSession;

import com.example.app.dto.FreeBoardDTO;
import com.mybatis.config.MyBatisConfig;

public class FreeBoardDAO {
	
	public SqlSession sqlSession;
	
	public FreeBoardDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void freeWrite(FreeBoardDTO freeboardDTO) {
		sqlSession.insert("FreeBoard.freeWrite", freeboardDTO);
	}
	
	public void freeEdit(FreeBoardDTO freeboardDTO) {
		sqlSession.update("FreeBoard.freeEdit", freeboardDTO);
	}
	
	public void freeDelete(FreeBoardDTO freeboardDTO) {
		sqlSession.delete("FreeBoard.freeDelte", freeboardDTO);
	}
	
//	public freeboardDTO selectAll(){
//		return sqlSession.selectList("board.selectAll");
	}
}
