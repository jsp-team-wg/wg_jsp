package com.example.app.no;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.dao.NoticeDAO;
import com.example.app.dto.NoticeDTO;
import com.example.app.vo.QnaViewDetailVo;

public class NoticeViewDetailOkController implements Execute{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		NoticeDAO noticeDAO = new NoticeDAO();
		NoticeDTO noticeDTO = new NoticeDTO();
		
		// 클릭한 게시글 번호 추적
				int listNum = 1;
				if (request.getParameter("listNum") != null) {
					listNum = Integer.parseInt(request.getParameter("listNum"));
				}
				System.out.println("게시글번호 : " + listNum);
				

				noticeDTO.setNoticeNum(listNum);



				// 해당 번호의 게시글에 내용 넣기
				NoticeDTO noticeViewDetail = noticeDAO.noticeViewDetail(listNum);

				System.out.println("내용 : " + noticeViewDetail);

				request.setAttribute("noticeViewDetail", noticeViewDetail);
				request.setAttribute("listNum", listNum);
				
				
				request.getRequestDispatcher("/community/notice/noticeViewDetail/noticeViewDetail.jsp").forward(request, response);
		
			
	}

}
