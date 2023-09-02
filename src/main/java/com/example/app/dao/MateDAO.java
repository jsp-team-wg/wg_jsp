package com.example.app.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.example.app.dto.MateDTO;
import com.example.app.vo.MateVO;
import com.mybatis.config.MyBatisConfig;

public class MateDAO {

	public SqlSession sqlSession;

	public MateDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	//메이트 글쓰기
	public void write(MateDTO mateDTO) {
		sqlSession.insert("mate.write",mateDTO);
	}
	
	//메이트 글 수정
	public void update(MateDTO mateDTO) {
		sqlSession.update("mate.update", mateDTO);
	}
	
	//메이트 글 상세보기
	public MateVO selectOne(int mateNum) {
		Map<String, Integer> params = new HashMap<>();
	    params.put("mateNum", mateNum);
	    return sqlSession.selectOne("mate.selectOne", params); 
	}
	//메이트 글 리스트 불러오기
	public List<MateDTO> selectAll(){
		return sqlSession.selectList("mate.selectAll");
	}
	
	//메이트 글 삭제
	public void delete(int mateNum) {
		Map<String, Integer> params = new HashMap<>();
	    params.put("mateNum", mateNum);
		sqlSession.delete("mate.delete", params);
	}
	
	//메이트 자기 글 전체 조회
	public void selectMyAll(int userNum) {
		sqlSession.selectList("mate.selectMyAll");
	}
	
	//메이트 글 모집완료 및 기한마감
	public void changeAt(int mateNum) {
		sqlSession.update("mate.changeAt",mateNum);
	}
	
	//메이트 글 코트장명 검색 조회
	public List<MateDTO> searchMate(String searchQuery) {
		return sqlSession.selectList("mate.searchMate",searchQuery);
	}
	
}
