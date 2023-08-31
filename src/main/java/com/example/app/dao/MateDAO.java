package com.example.app.dao;

import org.apache.ibatis.session.SqlSession;

import com.example.app.dto.MateDTO;
import com.mybatis.config.MyBatisConfig;

public class MateDAO {

	public SqlSession sqlSession;

	public MateDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void write(MateDTO mateDTO) {
		sqlSession.insert("mate.write",mateDTO);
	}
	
	
	
}
