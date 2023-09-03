package com.example.app.my;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.app.Execute;
import com.example.app.dao.MyPageDAO;
import com.example.app.dto.MemberDTO;

public class MyPageDelController implements Execute{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		MyPageDAO myPageDAO = new MyPageDAO();
		MemberDTO memberDTO = new MemberDTO();
		
		HttpSession session = request.getSession();
		
		Integer userNum = (Integer)session.getAttribute("userNum");
		memberDTO.setUserNum(userNum);
		System.out.println("세션" + userNum);
		
		myPageDAO.myPageDel(memberDTO);
		request.getRequestDispatcher("/login/signIn/signOutOk.me").forward(request, response);
		
	}

}
