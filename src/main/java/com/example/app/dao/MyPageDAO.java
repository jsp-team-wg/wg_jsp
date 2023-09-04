package com.example.app.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.example.app.dto.MateDTO;
import com.example.app.dto.MemberDTO;
import com.example.app.dto.QnaDTO;
import com.mybatis.config.MyBatisConfig;

public class MyPageDAO {
	public SqlSession sqlSession;
	
	public MyPageDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public MemberDTO myPageEdit(MemberDTO memberDTO) {
	    return sqlSession.selectOne("member.myPageEdit", memberDTO);
	}
	public void myPageEditOk(MemberDTO memberDTO) {
		sqlSession.update("member.myPageEditOk", memberDTO);
	}
	public void myPageDel(MemberDTO memberDTO) {
		sqlSession.delete("member.myPageDel", memberDTO);
	}
	
	public List<MateDTO> selectMateAllMe(){
		return sqlSession.selectList("mate.selectAllMe");
	}
	public List<QnaDTO> selectQnaAllMe(){
		return sqlSession.selectList("qna.selectAllMe");
	}


}
