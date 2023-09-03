package com.example.app.dao;

import org.apache.ibatis.session.SqlSession;

import com.example.app.dto.AdminDTO;
import com.example.app.dto.MemberDTO;
import com.mybatis.config.MyBatisConfig;

public class AdminDAO {

	public SqlSession sqlSession;
	
	public AdminDAO(){
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	
	public AdminDTO signIn(AdminDTO adminDTO) {
		sqlSession.selectOne("admin.signIn", adminDTO);
		return adminDTO;
		
	}
}
