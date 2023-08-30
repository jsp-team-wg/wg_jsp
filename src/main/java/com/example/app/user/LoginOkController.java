package com.example.app.user;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.app.Execute;
import com.example.app.Result;
import com.example.app.dao.UserDAO;
import com.example.app.dto.UserDTO;

public class LoginOkController implements Execute{
	
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response) throws IOException,ServerException{
		UserDAO UserDAO = new UserDAO();
		UserDTO UserDTO = new UserDTO();
		UserDTO result = null;
		
		UserDTO.setUserId(request.getParameter("userId"));
		UserDTO.setUserPassword(request.getParameter("userPassword"));
		
		result = UserDAO.signIn(UserDTO);
		
		System.out.println(result.getUserName());
		System.out.println(result.getUserNum());
		System.out.println(result.getUserNickname());
		
		
		//회원의 번호, 이름 세션에 저장
		HttpSession session = request.getSession();
		session.setAttribute("userNum",result.getUserNum());
		session.setAttribute("userName",result.getUserName());
		session.setAttribute("userNickname",result.getUserNickname());
		
		System.out.println(session.getAttribute("userNum"));
		System.out.println(session.getAttribute("userName"));
		System.out.println(session.getAttribute("userNickname"));
		
		response.sendRedirect(request.getContextPath());

		return null;
		
	}
	
}
