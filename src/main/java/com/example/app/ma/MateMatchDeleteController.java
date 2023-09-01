package com.example.app.ma;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.dao.MateDAO;

public class MateMatchDeleteController implements Execute{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		MateDAO mateDAO = new MateDAO();
		int mateNum = Integer.parseInt(request.getParameter("mateNum"));
		
		mateDAO.delete(mateNum);
		response.sendRedirect("mateMatch/mateMatchList/mateMatchList.jsp");
	}

	
	
}
