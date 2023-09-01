package com.example.app.my;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.dao.MemberDAO;
import com.example.app.dao.MyPageDAO;
import com.example.app.dto.MemberDTO;

public class MyPageEditOkController implements Execute {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		MyPageDAO myPageDAO = new MyPageDAO();
		MemberDTO memberDTO = new MemberDTO();

		request.setCharacterEncoding("UTF-8");
		
		memberDTO.setUserPassword(request.getParameter("userPassword"));
		memberDTO.setUserGender(request.getParameter("userGender"));
		memberDTO.setUserExp(Integer.parseInt(request.getParameter("userExp")));
		memberDTO.setUserNtrp(Double.parseDouble(request.getParameter("userNtrp")));

		
		myPageDAO.myPageEditOk(memberDTO);
		response.sendRedirect("/myPage/mateMemberEditMyPage/MyPageEdit.my");
		
	}
	
}
