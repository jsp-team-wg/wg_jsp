package com.example.app.dao;

import org.apache.ibatis.session.SqlSession;

import com.example.app.dto.MateCommentDTO;
import com.mybatis.config.MyBatisConfig;

public class MateCommentDAO {
	
	public SqlSession sqlSession;

	public MateCommentDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	public void wirte(MateCommentDTO mateCommentDTO) {
		sqlSession.insert("mateComment.write");
	}
}
