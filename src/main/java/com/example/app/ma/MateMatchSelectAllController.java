package com.example.app.ma;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.dao.MateDAO;

public class MateMatchSelectAllController implements Execute {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		MateDAO mateDAO = new MateDAO();
		
		request.setAttribute("mateList", mateDAO.selectAll());
		request.getRequestDispatcher("/mateMatch/mateMatchList/mateMatchList.jsp").forward(request, response);
		
	}

		
}
