package com.example.app.fr;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.dao.FreeBoardDAO;
import com.example.app.vo.FreeBoardVO;

public class FreeboardEditController implements Execute{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		FreeBoardDAO freeboardDAO = new FreeBoardDAO();
		
		System.out.println(request.getParameter("freeboardNum"));
		int freeboardNum = Integer.parseInt(request.getParameter("freeboardNum"));
		
		request.setAttribute("freeboard", freeboardDAO.selectWrite(freeboardNum));
		request.getRequestDispatcher("/community/freeboard/freeboardEdit/freeboardEdit.jsp?freeboardNum=" +freeboardNum).forward(request, response);
	}

}
