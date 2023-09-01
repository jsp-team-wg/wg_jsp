package com.example.app.qna;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.dao.QnaDAO;
import com.example.app.dto.MemberDTO;

public class QnaListOkController implements Execute {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		QnaDAO qnaDAO = new QnaDAO();
		
		//페이지네이션 
		int totalPage = 10;
		int totalList = 6;
		int currentPage = 1;
		int pageBlock = 1;
		
//		게시글 개수
		int totalListNum = qnaDAO.countQnaNum();
		
		
		
		int	maxBlock = (totalListNum-1)/60+1;
		int	listLeftOver = totalListNum%60;
		int	maxPage = listLeftOver/6+1;
		if(listLeftOver%10==0) {
			maxPage= listLeftOver/6;
		}
		
		System.out.println("totalListNum" + totalListNum);
		System.out.println("maxBlock" + maxBlock);
		System.out.println("listLeftOver" + listLeftOver);
		System.out.println("maxPage" + maxPage);
		


		if (request.getParameter("page")!=null){
			
			if (Integer.parseInt(request.getParameter("page")) > 0) {
				
				currentPage = Integer.parseInt(request.getParameter("page"));
			}
		}

		int firstList = (currentPage - 1) * totalList + 1;

		pageBlock = (currentPage-1)/10 + 1;
		// 첫 페이지번호 & 마지막 페이지번호
		int firstPage = (pageBlock - 1) * 10 + 1;
		int lastPage = (pageBlock - 1) * 10 + 10;

		if(lastPage>maxPage) {
			lastPage = maxPage;
			if(currentPage>lastPage) {
			currentPage = lastPage;
			}
		}
		List<Integer> pageList = new ArrayList<>();
		for (int i = firstPage; i <= lastPage; i++) {
			pageList.add(i);
		}
		
			
		
		
		
		//리스트출력 

		List<MemberDTO> qnaList = qnaDAO.bringQnaLIst(firstList);
		
		
		
		
		request.setAttribute("qnaList", qnaList);
		request.setAttribute("currentPage", currentPage);
		request.setAttribute("pageList", pageList);
		request.getRequestDispatcher("/community/qna/qnaList/qnaList.jsp").forward(request, response);

	}

}
