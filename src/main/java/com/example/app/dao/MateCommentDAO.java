package com.example.app.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.example.app.dto.MateCommentDTO;
import com.example.app.vo.MateCommentVO;
import com.mybatis.config.MyBatisConfig;

public class MateCommentDAO {
	
	public SqlSession sqlSession;

	public MateCommentDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	public void wirte(MateCommentDTO mateCommentDTO) {
		sqlSession.insert("mateComment.write", mateCommentDTO);
	}
	public List<MateCommentVO> selectComment(int mateNum){
		Map<String, Integer> params = new HashMap<>();
	    params.put("mateNum", mateNum);
	    return sqlSession.selectList("mateComment.selectComment", params);
	}
	public void deleteWriteComment(int mateNum) {
		Map<String, Integer> params = new HashMap<>();
	    params.put("mateNum", mateNum);
	    sqlSession.delete("mateComment.deleteWriteComment",params);
	}
	public void deleteComment(int commentNum) {
		Map<String, Integer> params = new HashMap<>();
	    params.put("commentNum", commentNum);
	    sqlSession.delete("mateComment.deleteComment",params);
	}
}
