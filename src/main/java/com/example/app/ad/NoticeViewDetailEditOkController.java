package com.example.app.ad;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.dao.NoticeDAO;
import com.example.app.dto.MemberDTO;
import com.example.app.dto.NoticeDTO;

public class NoticeViewDetailEditOkController implements Execute{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		NoticeDAO noticeDAO = new NoticeDAO();
		NoticeDTO noticeDTO = new NoticeDTO();
		Integer noticeNum = Integer.parseInt(request.getParameter("noticeNum"));
		noticeDTO.setNoticeNum(noticeNum);
		System.out.println("세션" + noticeNum);
		noticeDTO.setNoticeTitle(request.getParameter("noticeTitle"));
		noticeDTO.setNoticeContent(request.getParameter("noticeContent"));
		System.out.println("세션" + request.getParameter("noticeTitle"));
		System.out.println("세션" + request.getParameter("noticeContent"));
		NoticeDTO noticeEdit = noticeDAO.selectOne(noticeNum);

		// noticeEdit 객체의 속성을 변경합니다.
		noticeEdit.setNoticeTitle(request.getParameter("noticeTitle"));
		noticeEdit.setNoticeContent(request.getParameter("noticeContent"));

		// 수정된 내용으로 데이터베이스를 업데이트합니다.
		noticeDAO.update(noticeEdit);
		request.getRequestDispatcher("/community/notice/noticeViewDetail/noticeViewDetail.ad").forward(request, response);
	}

}
