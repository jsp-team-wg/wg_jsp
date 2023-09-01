package com.example.app.fr;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.dao.FreeBoardDAO;
import com.example.app.dto.FreeBoardDTO;

public class FreeBoardDeleteController implements Execute{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		FreeBoardDAO freeboardDAO = new FreeBoardDAO();
		FreeBoardDTO freeboardDTO = new FreeBoardDTO();
		Date date = new Date();
		
		freeboardDTO.setFreeboardNum(Integer.valueOf(request.getParameter("freeboardNum")));
		freeboardDTO.setFreeboardTitle(request.getParameter("freeboardTitle"));
		freeboardDTO.setFreeboardContent(request.getParameter("freeboardContent"));
		freeboardDTO.setFreeboardViewCnt(Integer.valueOf(request.getParameter("freeboardViewCnt")));
		freeboardDTO.setFreeboardCommentCnt(Integer.valueOf(request.getParameter("freeboardCommentCnt")));
		freeboardDTO.setFreeboardWriteDate(date);
		request.getRequestDispatcher("/community/freeboard/freeboardEdit/freeboardEdit.jsp").forward(request, response);
		
		
		
	}

}
