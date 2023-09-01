package com.example.app.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.example.app.dto.MateDTO;
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
	public MateDTO selectOne() {
		return sqlSession.selectOne("mate.selectOne");
	}
	//메이트 글 리스트 불러오기
	public List<MateDTO> selectAll(){
		return sqlSession.selectList("mate.selectAll");
	}
	
	//메이트 글 삭제
	public void delete(int mateNum) {
		sqlSession.delete("mate.delete", mateNum);
	}
	
}
