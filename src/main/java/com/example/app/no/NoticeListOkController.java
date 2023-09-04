package com.example.app.no;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.dao.NoticeDAO;
import com.example.app.dto.NoticeDTO;

public class NoticeListOkController implements Execute{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
			
		
		NoticeDAO noticeDAO = new NoticeDAO();

		// 페이지네이션
		
		int totalPage = 10;
		int totalList = 6;
		int currentPage = 1;
		int pageBlock = 1;
		int lastPage = 1;

//		게시글 개수
		int totalListNum = noticeDAO.countNoticeNum();
		int maxBlock = (totalListNum - 1) / 60 + 1;
		int listLeftOver = totalListNum % 60;
		int maxPage = listLeftOver / 6 + 1;
		if (listLeftOver % 10 == 0) {
			maxPage = listLeftOver / 6;
		}

		System.out.println("게시글 총 개수!! : " + totalListNum);
		
		if (request.getParameter("page") != null) {

			if (Integer.parseInt(request.getParameter("page")) > 0) {
				currentPage = Integer.parseInt(request.getParameter("page"));
			}
			if (Integer.parseInt(request.getParameter("page")) > maxPage) {
				currentPage = Integer.parseInt(request.getParameter("page")) - 1;
			}
		}

		// 첫 페이지번호 & 마지막 페이지번호
		
		lastPage= maxPage;
		
		if (currentPage > lastPage) {
			currentPage = lastPage;
		}

		pageBlock = (currentPage - 1) / 10 + 1;

		int firstPage = (pageBlock - 1) * 10 + 1;

		List<Integer> pageList = new ArrayList<>();
		for (int i = firstPage; i <= lastPage; i++) {
			pageList.add(i);
		}

		int firstList = (currentPage - 1) * totalList;

		// 리스트출력
		List<NoticeDTO> noticeList = null;
		if(totalListNum != 0) {
			System.out.println("조건문 진입!!");
			System.out.println("firstList!! : " + firstList);
		noticeList = noticeDAO.bringNoticeList(firstList);
		}
		
		System.out.println("noticeList!! : " + noticeList);
		request.setAttribute("noticeList", noticeList);
		request.setAttribute("currentPage", currentPage);
		request.setAttribute("pageList", pageList);
		
		
		request.getRequestDispatcher("/community/notice/noticeList/noticeList.jsp").forward(request, response);		
		
		
	}
	
	

}
