package com.example.app.fr;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.app.Execute;
import com.example.app.dao.FreeBoardDAO;
import com.example.app.dto.FreeBoardDTO;

public class FreeboardWriteController implements Execute{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		FreeBoardDAO freeboardDAO = new FreeBoardDAO();
		FreeBoardDTO freeboardDTO = new FreeBoardDTO();
		Date date = new Date();
		HttpSession session = request.getSession();
		
		freeboardDTO.setFreeboardNum((Integer)session.getAttribute("freeboardNum"));

		
		freeboardDTO.setFreeboardNum(Integer.parseInt(request.getParameter("freeboardNum")));
		freeboardDTO.setFreeboardTitle(request.getParameter("freeboardTitle"));
		freeboardDTO.setFreeboardContent(request.getParameter("freeboardContent"));
		freeboardDTO.setFreeboardViewCnt(Integer.parseInt(request.getParameter("freeboardViewCnt")));
		freeboardDTO.setFreeboardCommentCnt(Integer.parseInt(request.getParameter("freeboardCommentCnt")));
		freeboardDTO.setFreeboardWriteDate(date);

		
		System.out.println(freeboardDTO);
		freeboardDAO.write(freeboardDTO);
		response.sendRedirect("/wg_jsp/community/freeboard/freeboardList/freeboardList.jsp");
		
	}

}
