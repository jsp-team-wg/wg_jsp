package com.example.app.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.example.app.dto.MateCommentDTO;
import com.mybatis.config.MyBatisConfig;

public class MateCommentDAO {
	
	public SqlSession sqlSession;

	public MateCommentDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	public void wirte(MateCommentDTO mateCommentDTO) {
		sqlSession.insert("mateComment.write", mateCommentDTO);
	}
	public List<MateCommentDTO> selectComment(int mateNum){
		Map<String, Integer> params = new HashMap<>();
	    params.put("mateNum", mateNum);
	    return sqlSession.selectList("mateComment.selectComment", params);
	}
}
