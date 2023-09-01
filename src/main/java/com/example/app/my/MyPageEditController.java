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
		System.out.println(userNum);

		request.setCharacterEncoding("UTF-8");
		

		myPageDAO.myPageEdit(memberDTO);
		request.setAttribute("myPageEdit", myPageDAO.myPageEdit(memberDTO));
		request.getRequestDispatcher("/myPage/mateMemberEditMyPage/mateMemberEditMyPage.jsp").forward(request, response);
//		response.sendRedirect("/wg_jsp/myPage/mateMemberEditMyPage/MyPageEdit.my");
		
	}

}
