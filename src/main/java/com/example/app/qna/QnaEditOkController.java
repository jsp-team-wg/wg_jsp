package com.example.app.qna;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.dao.QnaDAO;
import com.example.app.dto.QnaDTO;

public class QnaEditOkController implements Execute{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	
		QnaDAO qnaDAO = new QnaDAO();
		QnaDTO qnaDTO = new QnaDTO();
		
//		int listNum =1;
//		listNum = Integer.valueOf(request.getParameter("listNum"));
//		System.out.println("수정 listNum!!! : " + listNum);
//		
		
		System.out.println(request.getParameter("listNum"));
		System.out.println(request.getParameter("title"));
		System.out.println(request.getParameter("content"));
		
//		수정완료 누를시
//		String title = request.getParameter("title");
//		String content = request.getParameter("content");
//		System.out.println("title!! : "+title);
//		System.out.println("content!! : "+content);
//		
//		qnaDTO.setQnaNum(listNum);
//		qnaDTO.setQnaTitle(title);;
//		qnaDTO.setQnaContent(content);
//		
//		qnaDAO.qnaEdit(qnaDTO);
		response.sendRedirect("/community/qnaViewDetail/qnaViewDetailOk.qna?listNum=${listNum}");

		
		
		
		
	}
	
	

}
