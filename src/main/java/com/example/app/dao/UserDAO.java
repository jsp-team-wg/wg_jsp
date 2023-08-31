package com.example.app.dao;

import org.apache.ibatis.session.SqlSession;

import com.example.app.dto.UserDTO;
import com.mybatis.config.MyBatisConfig;

public class UserDAO {
	
	public SqlSession sqlSession;
	
	public UserDAO(){
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void signUp(UserDTO userDTO) {
		sqlSession.insert("user.signUp",userDTO);
	}
	
	public UserDTO signIn(UserDTO userDTO) {
		UserDTO user = sqlSession.selectOne("user.signIn", userDTO);
		return user;
	}
}
