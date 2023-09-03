package com.example.app.my;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.app.Execute;
import com.example.app.dao.MyPageDAO;
import com.example.app.dto.MemberDTO;

public class MyPageEditController implements Execute{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		MyPageDAO myPageDAO = new MyPageDAO();
		MemberDTO memberDTO = new MemberDTO();
		
		HttpSession session = request.getSession();
		
		Integer userNum = (Integer)session.getAttribute("userNum");
		memberDTO.setUserNum(userNum);
		System.out.println("세션" + userNum);
		
		
		request.setCharacterEncoding("UTF-8");
		

		MemberDTO myPageEdit = myPageDAO.myPageEdit(memberDTO);
		System.out.println(myPageEdit.getUserEmail());
		System.out.println(myPageEdit.getUserName());
		System.out.println(myPageEdit.getUserNickname());
		System.out.println(myPageEdit.getUserGender());
		System.out.println(myPageEdit.getUserExp());
		System.out.println(myPageEdit.getUserNtrp());
		
		
		request.setAttribute("myPageEdit", myPageEdit);
		request.getRequestDispatcher("/myPage/myPageEdit/myPageEdit.jsp").forward(request, response);
//		response.sendRedirect("/wg_jsp/myPage/mateMemberEditMyPage/MyPageEdit.my");
		
	}

}
