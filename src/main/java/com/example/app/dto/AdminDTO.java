package com.example.app.dto;

import java.util.List;

public class AdminDTO {
	
	//필드
	private int adminNum;
	private String adminId;
	private String adminPw;
	
	//기본생성자
	public AdminDTO() {;}
	
	//게터, 세터
	public int getAdminNum() {
		return adminNum;
	}
	
	public void setAdminNum(int adminNum) {
		this.adminNum = adminNum;
	}
	
	public String getAdminId() {
		return adminId;
	}
	
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	
	public String getAdminPw() {
		return adminPw;
	}
	
	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}
	public List<MemberDTO> selectAll(){
		return sqlSession.selectList("member.selectAll");
	}
	
	
	
	//오버라이딩
	@Override
	public String toString() {
		return "AdminDTO [adminNum=" + adminNum + ", adminId=" + adminId + ", adminPw=" + adminPw + "]";
	}

	

}
