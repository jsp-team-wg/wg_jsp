package com.example.app.my;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.app.Execute;
import com.example.app.dao.MemberDAO;
import com.example.app.dao.MyPageDAO;
import com.example.app.dto.MemberDTO;

public class MyPageEditOkController implements Execute {

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
		
		myPageEdit.setUserPassword(request.getParameter("userPassword"));
		myPageEdit.setUserGender(request.getParameter("userGender"));
		myPageEdit.setUserExp(Integer.parseInt(request.getParameter("userExp")));
		myPageEdit.setUserNtrp(Double.parseDouble(request.getParameter("userNtrp")));
		System.out.println(myPageEdit.getUserNum());
		System.out.println(myPageEdit.getUserPassword());
		System.out.println(myPageEdit.getUserExp());
		System.out.println(myPageEdit.getUserGender());
		System.out.println(myPageEdit.getUserNtrp());
		
		

		myPageDAO.myPageEditOk(myPageEdit);
//		request.getRequestDispatcher("/myPage/myPageEdit/myPageEdit.jsp").forward(request, response);
		response.sendRedirect("/wg_jsp/myPage/mateMemberEditMyPage/MyPageEdit.my");
	}
	
}
