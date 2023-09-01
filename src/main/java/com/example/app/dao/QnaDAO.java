package com.example.app.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.example.app.dto.MemberDTO;
import com.mybatis.config.MyBatisConfig;

public class QnaDAO {
	
	public SqlSession sqlSession;
	
	public QnaDAO(){
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	
	public int countQnaNum(){
	return sqlSession.selectOne("qna.countQnaNum");
	}
	
	public List<MemberDTO> bringQnaLIst(int firstList) {
		List<MemberDTO> list = new ArrayList<>();
		list = sqlSession.selectList("qna.bringQnaLIst",firstList);
		return list;
		
	}
//	public boolean checkId(String id) {
//		   //selectOne()의 반환타입은  Object타입이기 때문에 비교를 하기위해선 Integer타입으로 형변환 해야함 
//		   return (Integer)sqlSession.selectOne("member.checkId",id)<=0;
//	}
}
