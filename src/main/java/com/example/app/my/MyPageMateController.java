package com.example.app.my;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.dao.MyPageDAO;

public class MyPageMateController implements Execute {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		MyPageDAO myPageDAO = new MyPageDAO();
		
		
		request.setAttribute("selectAllMe", myPageDAO.selectMateAllMe());
		request.getRequestDispatcher("/myPage/mateFindMyPage/mateFindMyPage.jsp").forward(request, response);
		
	}

}
