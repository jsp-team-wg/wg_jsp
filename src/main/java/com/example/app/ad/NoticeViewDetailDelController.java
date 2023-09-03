package com.example.app.ad;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.dao.NoticeDAO;
import com.example.app.dto.NoticeDTO;

public class NoticeViewDetailDelController implements Execute {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		NoticeDAO noticeDAO = new NoticeDAO();
		NoticeDTO noticeDTO = new NoticeDTO();
		
		request.setCharacterEncoding("UTF-8");
		
		Integer noticeNum = Integer.parseInt(request.getParameter("noticeNum"));
		noticeDTO.setNoticeNum(noticeNum);
		noticeDAO.delete(noticeDTO);
		request.getRequestDispatcher("/admin/adminNotice/adminNoticeList/adminNoticeList.ad").forward(request, response);
		
	   
	}

}
