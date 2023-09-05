package com.example.app.ma;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.dao.MateCommentDAO;
import com.example.app.dao.MateDAO;

public class MateCommentDeleteController implements Execute{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		MateCommentDAO  mateCommentDAO = new MateCommentDAO();
		MateDAO mateDAO = new MateDAO();
		int commentNum = Integer.parseInt(request.getParameter("commentNum"));
		mateCommentDAO.deleteComment(commentNum);
		int mateNum = Integer.parseInt(request.getParameter("mateNum"));
		mateDAO.commentCntDown(mateNum);
		request.getRequestDispatcher("/mateMatch/mateMatchViewDetail/mateMatchViewDetail.ma?mateNum=" + mateNum).forward(request, response);
		
	}
	
	
}
