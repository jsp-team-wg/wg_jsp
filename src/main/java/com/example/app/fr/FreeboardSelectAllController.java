package com.example.app.fr;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.dao.FreeBoardDAO;

public class FreeboardSelectAllController implements Execute{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		FreeBoardDAO freeboardDAO = new FreeBoardDAO();
		
		request.setAttribute("freeboardList", freeboardDAO.selectAll());
		request.getRequestDispatcher("/community/freeboard/freeboardList/freeboardList.jsp").forward(request, response);
		
	}

}
