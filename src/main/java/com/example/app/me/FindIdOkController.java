package com.example.app.me;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.dao.MemberDAO;
import com.example.app.dto.MemberDTO;

public class FindIdOkController implements Execute{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		MemberDAO memberDAO = new MemberDAO();
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setUserName(request.getParameter("userName"));
		memberDTO.setUserEmail(request.getParameter("userEmail"));
		
		request.setCharacterEncoding("UTF-8");
		

		request.setAttribute("member", memberDAO.findId(memberDTO));
		System.out.println(memberDTO.getUserName());
		System.out.println(memberDTO.getUserId());
		System.out.println(memberDTO.getUserEmail());
		System.out.println(memberDTO.getUserNickname());
		
		
		
		request.getRequestDispatcher("/login/findId/findId.jsp").forward(request, response);
		
	}
	
	
}
