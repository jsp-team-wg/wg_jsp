package com.example.app.dao;

import org.apache.ibatis.session.SqlSession;

import com.example.app.dto.UserDTO;
import com.mybatis.config.MyBatisConfig;

public class MyPageDAO {
	public SqlSession sqlSession;
	
	public MyPageDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public UserDTO myPageEdit(UserDTO userDTO) {
	    return sqlSession.selectOne("my.myPageEdit", userDTO);
	}
	
	public UserDTO myPageEditOk(UserDTO userDTO) {
	    return sqlSession.update("my.myPageEditOk", userDTO);
	}

}
