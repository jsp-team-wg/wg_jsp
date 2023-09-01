package com.example.app.me;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.app.Execute;
import com.example.app.dao.MemberDAO;
import com.example.app.dto.MemberDTO;

public class LoginOkController implements Execute{
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		MemberDAO memberDAO = new MemberDAO();
		MemberDTO memberDTO = new MemberDTO();
		
		
		memberDTO.setUserId(request.getParameter("userId"));
		memberDTO.setUserPassword(request.getParameter("userPassword"));
		
		
		
		System.out.println(memberDTO.getUserName());
		System.out.println(memberDTO.getUserNum());
		System.out.println(memberDTO.getUserNickname());
		
		
		//회원의 번호, 이름 세션에 저장
		HttpSession session = request.getSession();
		session.setAttribute("userNum",memberDTO.getUserNum());
		session.setAttribute("userName",memberDTO.getUserName());
		session.setAttribute("userNickname",memberDTO.getUserNickname());
		
		System.out.println(session.getAttribute("userNum"));
		System.out.println(session.getAttribute("userName"));
		System.out.println(session.getAttribute("userNickname"));
		
		response.sendRedirect("/wg_jsp/index.jsp");

		
		
	}
	
}
