package com.example.app.ma;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.app.Execute;
import com.example.app.dao.MateCommentDAO;
import com.example.app.dao.MateDAO;
import com.example.app.dto.MateCommentDTO;

public class MateCommentWriteController implements Execute {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		MateCommentDAO mateCommentDAO = new MateCommentDAO();
		MateDAO mateDAO = new MateDAO();
		MateCommentDTO mateCommentDTO = new MateCommentDTO();
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		HttpSession session = request.getSession();
		
		int mateNum = Integer.parseInt(request.getParameter("mateNum"));
		
		mateCommentDTO.setUserNum((Integer)session.getAttribute("userNum"));
		mateCommentDTO.setMateNum(mateNum);
		mateCommentDTO.setCommentContent("commentContent");
		mateCommentDTO.setCommentWritedate(date);
		
		System.out.println(mateCommentDTO);
		mateDAO.commentCntUp(mateNum);
		mateCommentDAO.wirte(mateCommentDTO);
		request.getRequestDispatcher("/mateMatch/mateMatchViewDetail/mateMatchViewDetail.jsp?mateNum=" + mateNum).forward(request, response);
	}
	
	
}
