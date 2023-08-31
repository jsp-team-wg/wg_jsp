package com.example.app.fr;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.dao.FreeBoardDAO;
import com.example.app.dto.FreeBoardDTO;

public class FreeBoardWriteOk implements Execute{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		FreeBoardDTO freeboardDTO = new FreeBoardDTO();
		FreeBoardDAO freeboardDAO = new FreeBoardDAO();
		
		
//		freeboardDTO.setFreeboardNum(request.getParameter("FreeboartNum"));
		request.getRequestDispatcher("/app/board/boardList.jsp").forward(request, response);
		
	}
	

}
