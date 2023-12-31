package com.example.app.ma;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.dao.MateCommentDAO;
import com.example.app.dao.MateDAO;

public class MateMatchDeleteController implements Execute{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		MateDAO mateDAO = new MateDAO();
		MateCommentDAO mateCommentDAO = new MateCommentDAO();
		int mateNum = Integer.parseInt(request.getParameter("mateNum"));
		
		mateCommentDAO.deleteWriteComment(mateNum);
		mateDAO.delete(mateNum);
		request.getRequestDispatcher("/mateMatch/mateMatchList/mateMatchListOk.ma").forward(request, response);
	}

	
	
}
