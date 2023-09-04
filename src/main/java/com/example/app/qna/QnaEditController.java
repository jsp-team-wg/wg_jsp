package com.example.app.qna;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.dao.QnaDAO;
import com.example.app.dto.QnaDTO;

public class QnaEditController implements Execute{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	
		QnaDAO qnaDAO = new QnaDAO();
		QnaDTO qnaDTO = new QnaDTO();
		
		int listNum =1;
		listNum = Integer.valueOf(request.getParameter("listNum"));
		System.out.println("수정 listNum!!! : " + listNum);
		
		//해당 게시글 제목,내용 띄우기
		QnaDTO bringContent = qnaDAO.bringContent(listNum);
		request.setAttribute("bringContent", bringContent);
		
		System.out.println(bringContent);
		
		request.getRequestDispatcher("/community/qnaEdit/qnaEdit.qna?").forward(request, response);
		
	}
}
