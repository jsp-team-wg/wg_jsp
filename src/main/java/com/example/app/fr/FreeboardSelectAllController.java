package com.example.app.fr;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.dao.FreeBoardDAO;
import com.example.app.dto.FreeBoardDTO;

public class FreeboardSelectAllController implements Execute{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		FreeBoardDAO freeboardDAO = new FreeBoardDAO();
		FreeBoardDTO freeboardDTO = new FreeBoardDTO();
		List<Map> resultList = new ArrayList<>();
		
		request.setAttribute("freeboardList", freeboardDAO.selectAll());
		
		System.out.println("check freeboardNum : " + freeboardDTO.getFreeboardNum());
		System.out.println("check freeboardTitle : " + freeboardDTO.getFreeboardTitle());
		request.getRequestDispatcher("/community/freeboard/freeboardList/freeboardList.jsp").forward(request, response);
		
	}

}

