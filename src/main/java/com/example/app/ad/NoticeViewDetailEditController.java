package com.example.app.ad;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.dao.NoticeDAO;
import com.example.app.dto.NoticeDTO;

public class NoticeViewDetailEditController implements Execute{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		NoticeDAO noticeDAO = new NoticeDAO();
		NoticeDTO noticeDTO = new NoticeDTO();
		Integer noticeNum = Integer.parseInt(request.getParameter("noticeNum"));
//	    HttpSession session = request.getSession();
	    
		System.out.println("세션" + noticeNum);
	    noticeDTO.setNoticeNum(noticeNum);
	    noticeDTO.setNoticeTitle("noticeNum");
	    noticeDTO.setNoticeContent("noticeContent");
//	    noticeDTO.setNoticeWriteDate("noticeWriteDate");
	    
	    
	    request.setCharacterEncoding("UTF-8");
	    

	    NoticeDTO noticeRead = noticeDAO.selectOne(noticeDTO.getNoticeNum());
//	    System.out.println(myPageEdit.getUserEmail());
//	    System.out.println(myPageEdit.getUserName());
//	    System.out.println(myPageEdit.getUserNickname());
//	    System.out.println(myPageEdit.getUserGender());
//	    System.out.println(myPageEdit.getUserExp());
//	    System.out.println(myPageEdit.getUserNtrp());
	    
	    
	    request.setAttribute("noticeRead", noticeRead);
	    request.getRequestDispatcher("/admin/adminNotice/adminNoticeEdit/adminNoticeEdit.jsp").forward(request, response);
		
	}

}
