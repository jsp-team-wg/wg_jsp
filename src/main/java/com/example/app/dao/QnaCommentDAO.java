package com.example.app.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.example.app.dto.QnaCommentDTO;
import com.example.app.vo.QnaCommentVO;
import com.mybatis.config.MyBatisConfig;

public class QnaCommentDAO {
	
	public SqlSession sqlSession;
	
	public QnaCommentDAO(){
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<QnaCommentVO> bringQnaCommentList(int firstList) {
		List<QnaCommentVO> list = new ArrayList<>();
		list = sqlSession.selectList("qnaComment.bringQnaCommentList",firstList);
		return list;
	}
	
	public void commentWrite(QnaCommentDTO qnaCommentDTO){
		sqlSession.insert("qnaComment.commentWrite", qnaCommentDTO);
	}

	//댓글삭제
	public void deleteReview(int reviewNum) {
		sqlSession.delete("qnaComment.deleteReview", reviewNum);
	}
}
