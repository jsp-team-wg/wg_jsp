package com.example.app.me;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.dao.MemberDAO;
import com.example.app.dto.MemberDTO;

public class SignUpOkController implements Execute{
	
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		MemberDAO memberDAO = new MemberDAO();
		MemberDTO memberDTO = new MemberDTO();
		Date date = new Date();
		
		memberDTO.setUserId(request.getParameter("userId"));
		memberDTO.setUserNickname(request.getParameter("userNickname"));
		memberDTO.setUserPassword(request.getParameter("userPassword"));
		memberDTO.setUserEmail(request.getParameter("userEmail"));
		memberDTO.setUserName(request.getParameter("userName"));
		memberDTO.setUserGender(request.getParameter("userGender"));
		memberDTO.setUserExp(Integer.parseInt(request.getParameter("userExp")));
		memberDTO.setUserNtrp(Double.parseDouble(request.getParameter("userNtrp")));
		memberDTO.setUserJoindate(date);
		
		System.out.println(memberDTO);
		
		memberDAO.signUp(memberDTO);
		response.sendRedirect("/wg_jsp/login/signIn/signIn.me");
		
	}
}
