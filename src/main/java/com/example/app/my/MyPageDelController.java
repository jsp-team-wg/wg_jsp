package com.example.app.my;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.dao.MyPageDAO;
import com.example.app.dto.MemberDTO;

public class MyPageDelController implements Execute{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		MyPageDAO myPageDAO = new MyPageDAO();
		MemberDTO memberDTO = new MemberDTO();
		
		myPageDAO.myPageDel(memberDTO);
		response.sendRedirect("/myPage/mateMemberEditMyPage/MyPageEdit.my");
		
		
	}

}
