package com.example.app.ad;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.app.Execute;
import com.example.app.dao.NoticeDAO;
import com.example.app.dto.NoticeDTO;

public class AdminNoticeWriteOkController implements Execute {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		 // TODO Auto-generated method stub
		  NoticeDAO noticeDAO = new NoticeDAO();
	      NoticeDTO noticeDTO = new NoticeDTO();
	      Date date = new Date();
	    
	      
	        
	      noticeDTO.setAdminNum(1);

	      request.setCharacterEncoding("UTF-8");
	      

	      noticeDTO.setNoticeTitle(request.getParameter("noticeTitle"));
	      noticeDTO.setNoticeContent(request.getParameter("noticeContent"));
	      noticeDTO.setNoticeWriteDate(date);

	      
	      System.out.println(noticeDTO);
	      noticeDAO.write(noticeDTO);
	      response.sendRedirect(request.getContextPath() +"/admin/adminNotice/adminNoticeList/adminNoticeList.ad");

	}
	
}
