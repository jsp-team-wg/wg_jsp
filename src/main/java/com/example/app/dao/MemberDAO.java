package com.example.app.dao;

import org.apache.ibatis.session.SqlSession;

import com.example.app.dto.MemberDTO;
import com.mybatis.config.MyBatisConfig;

public class MemberDAO {
	
	public SqlSession sqlSession;
	
	public MemberDAO(){
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void signUp(MemberDTO memberDTO) {
		sqlSession.insert("member.signUp",memberDTO);
	}
	
	public MemberDTO signIn(MemberDTO memberDTO) {
		MemberDTO user = sqlSession.selectOne("member.signIn", memberDTO);
		return user;
	}
	
	public MemberDTO findId(MemberDTO memberDTO) {
		return sqlSession.selectOne("member.findId", memberDTO);
	}
	public MemberDTO findPw(MemberDTO memberDTO) {
		return sqlSession.selectOne("member.findPw", memberDTO);
	}
	
	
	
//	public boolean checkId(String id) {
//		   //selectOne()의 반환타입은  Object타입이기 때문에 비교를 하기위해선 Integer타입으로 형변환 해야함 
//		   return (Integer)sqlSession.selectOne("member.checkId",id)<=0;
//	}
}
