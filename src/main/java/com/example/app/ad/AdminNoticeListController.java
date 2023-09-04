package com.example.app.ad;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.dao.NoticeDAO;

public class AdminNoticeListController implements Execute {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		NoticeDAO noticeDAO = new NoticeDAO();

		request.setAttribute("noticeList", noticeDAO.selectAll());
		request.getRequestDispatcher("/admin/adminNotice/adminNoticeList/adminNoticeList.jsp").forward(request, response);

	}

}
