package com.example.app.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.example.app.dto.QnaDTO;
import com.example.app.vo.QnaViewDetailVo;
import com.mybatis.config.MyBatisConfig;

public class QnaDAO {
	
	public SqlSession sqlSession;
	
	public QnaDAO(){
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public int countQnaNum(){
	return sqlSession.selectOne("qna.countQnaNum");
	}
	
	public int countQnaCommentNum(){
		return sqlSession.selectOne("qnaComment.countQnaCommentNum");
	}
	
	public List<QnaDTO> bringQnaList(int firstList) {
		List<QnaDTO> list = new ArrayList<>();
		list = sqlSession.selectList("qna.bringQnaList",firstList);
		return list;
	}
	
	
	public QnaDTO getPrevView(int listNum) {
		return sqlSession.selectOne("qna.getPrevView",listNum);
	}
	
	public void addViewCnt(QnaDTO qnaDTO) {
		sqlSession.update("qna.addViewCnt",qnaDTO);
	}
	
	public QnaViewDetailVo qnaViewDetail(int listNum){
		return  sqlSession.selectOne("qna.qnaViewDetail",listNum);
	}
	
	
	public void qnaWrite(QnaDTO qnaDTO) {
		sqlSession.insert("qna.qnaWrite",qnaDTO);
	}
		
	public QnaDTO bringContent(int listNum) {
		return sqlSession.selectOne("qna.bringContent",listNum);
	}
	
	public void qnaEdit(QnaDTO qnaDTO) {
		sqlSession.update("qna.qnaEdit",qnaDTO);
	}
//	public boolean checkId(String id) {
//		   //selectOne()의 반환타입은  Object타입이기 때문에 비교를 하기위해선 Integer타입으로 형변환 해야함 
//		   return (Integer)sqlSession.selectOne("member.checkId",id)<=0;
//	}
}
