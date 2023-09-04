package com.example.app.qna;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.app.Execute;
import com.example.app.dao.QnaDAO;
import com.example.app.dto.QnaDTO;

public class QnaWriteOkController implements Execute{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		QnaDAO qnaDAO = new QnaDAO();
		QnaDTO qnaDTO = new QnaDTO();
		
		HttpSession session = request.getSession();
		int userNum =  (Integer)session.getAttribute("userNum");
		String title = request.getParameter("title");	
		String content = request.getParameter("content");
		
		qnaDTO.setUserNum(userNum);
		qnaDTO.setQnaTitle(title);
		qnaDTO.setQnaContent(content);
		qnaDAO.qnaWrite(qnaDTO);
		
		request.getRequestDispatcher("/community/qnaList/qnaListOk.qna").forward(request, response);
		
	}
}
