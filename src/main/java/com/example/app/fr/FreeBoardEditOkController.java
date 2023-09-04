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
import com.example.app.vo.FreeBoardVO;

public class FreeBoardEditOkController implements Execute{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		FreeBoardDAO freeboardDAO = new FreeBoardDAO();
		int freeboardNum = Integer.parseInt(request.getParameter("freeboardNum"));
		
	      FreeBoardDTO freeboardDTO = new FreeBoardDTO();
	      Date date = new Date();
	      HttpSession session = request.getSession();
	      
	      freeboardDTO.setUserNum((Integer)session.getAttribute("userNum"));
	      freeboardDTO.setFreeboardTitle(request.getParameter("freeboardTitle"));
	      freeboardDTO.setFreeboardContent(request.getParameter("freeboardContent"));
	      freeboardDTO.setFreeboardWriteDate(date);
	      
	      
	      System.out.println(freeboardDTO);
	      freeboardDAO.update(freeboardDTO);
	      request.getRequestDispatcher("/community/freeboard/freeboardList/freeboardEidtOk.fr").forward(request, response);
	   }
	}
	
