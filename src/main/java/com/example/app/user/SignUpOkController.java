package com.example.app.user;

import java.io.IOException;
import java.rmi.ServerException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.Result;
import com.example.app.dao.UserDAO;
import com.example.app.dto.UserDTO;

public class SignUpOkController implements Execute{
	
	public Result execute(HttpServletRequest request, HttpServletResponse response) throws IOException,ServerException{
		UserDAO userDAO = new UserDAO();
		UserDTO userDTO = new UserDTO();
		Result result = new Result();
		Date date = new Date();
		
		userDTO.setUserId(request.getParameter("userId"));
		userDTO.setUserNickname(request.getParameter("userNickname"));
		userDTO.setUserPassword(request.getParameter("userPassword"));
		userDTO.setUserEmail(request.getParameter("userEmail"));
		userDTO.setUserName(request.getParameter("userName"));
		userDTO.setUserGender(request.getParameter("userGender"));
		userDTO.setUserExp(Integer.parseInt(request.getParameter("userExp")));
		userDTO.setUserNtrp(Double.parseDouble(request.getParameter("userNtrp")));
		userDTO.setUserJoindate(date);
		
		System.out.println(userDTO);
		
		userDAO.signUp(userDTO);
		
		result.setRedirect(true);
		result.setPath(request.getContextPath());;
		
		return result;
	}
}
