package com.example.app.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class FreeBoardDAO {
	
	public SqlSession sqlSession;
	
	public FreeBoardDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	

}
