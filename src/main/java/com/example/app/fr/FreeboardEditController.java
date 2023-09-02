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
import com.example.app.dto.MemberDTO;

public class FreeboardEditController implements Execute{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		FreeBoardDAO freeboardDAO = new FreeBoardDAO();
		FreeBoardDTO freeboardDTO = new FreeBoardDTO();
		MemberDTO memberDTO = new MemberDTO();
		Date date = new Date();
		HttpSession session = request.getSession();
		
		freeboardDTO.setFreeboardNum((Integer)session.getAttribute("freeboarNum"));
		
		freeboardDTO.setFreeboardTitle(request.getParameter("freeboardTitle"));
		freeboardDTO.setFreeboardContent(request.getParameter("freeboardContent"));
		freeboardDTO.setFreeboardViewCnt(Integer.parseInt(request.getParameter("freeboardViewCnt")));
		freeboardDTO.setFreeboardCommentCnt(Integer.parseInt(request.getParameter("freeboardCommentCnt")));
		freeboardDTO.setFreeboardWriteDate(date);

		System.out.println(freeboardDTO.getFreeboardNum());
		System.out.println(freeboardDTO.getFreeboardTitle());
		System.out.println(freeboardDTO.getFreeboardContent());
		System.out.println(freeboardDTO.getFreeboardViewCnt());
		System.out.println(freeboardDTO.getFreeboardCommentCnt());
		System.out.println(freeboardDTO.getFreeboardWriteDate());
		
		System.out.println(freeboardDTO);
		freeboardDAO.edit(freeboardDTO);
		response.sendRedirect("/wg_jsp/community/freeboard/freeboardViewDetail/freeboardViewDetail.jsp");
	}

}
