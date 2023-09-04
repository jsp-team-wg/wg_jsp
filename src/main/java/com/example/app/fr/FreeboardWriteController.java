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

public class FreeboardWriteController implements Execute{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		FreeBoardDAO freeboardDAO = new FreeBoardDAO();
		FreeBoardDTO freeboardDTO = new FreeBoardDTO();
		Date date = new Date();
		HttpSession session = request.getSession();
		
		Integer userNum = (Integer)session.getAttribute("userNum");
		System.out.println("check UserNum : "+userNum);
		
		
		freeboardDTO.setUserNum(userNum);

		request.setCharacterEncoding("UTF-8");
		

		freeboardDTO.setFreeboardTitle(request.getParameter("freeboardTitle"));
		freeboardDTO.setFreeboardContent(request.getParameter("freeboardContent"));
		freeboardDTO.setFreeboardWriteDate(date);

		
		System.out.println(freeboardDTO);
		freeboardDAO.write(freeboardDTO);
		response.sendRedirect("/wg_jsp/community/freeboard/freeboardList/freeboardListOk.fr");
		
	}

}
