package com.example.app.ma;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.dao.MateDAO;

public class MateMatchSelectOneController implements Execute{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		MateDAO mateDAO = new MateDAO();
		
		request.setAttribute("mate", mateDAO.selectOne());
		request.getRequestDispatcher("mateMatch/mateMatchViewDetail/mateMatchViewDetail.jsp").forward(request, response);
		
	}
	
}
