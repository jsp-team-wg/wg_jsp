package com.example.app.ma;

import java.io.IOException;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.app.Execute;
import com.example.app.dao.MateDAO;
import com.example.app.dto.MateDTO;

public class MateMatchWriteController implements Execute{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		MateDAO mateDAO = new MateDAO();
		MateDTO mateDTO = new MateDTO();
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		HttpSession session = request.getSession();
		
		mateDTO.setUserNum((Integer)session.getAttribute("userNum"));
		mateDTO.setMateCourtname(request.getParameter("mateCourtname"));
		System.out.println(request.getParameter("mateCourtname"));
		mateDTO.setMateCourtddr(request.getParameter("mateCourtaddr"));
		System.out.println(request.getParameter("mateCourtaddr"));
		try {
			mateDTO.setMateDate(format.parse(request.getParameter("mateDate")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(request.getParameter("mateStarttime"));
		mateDTO.setMateStarttime(request.getParameter("mateStarttime"));
		mateDTO.setMateEndtime(request.getParameter("mateEndtime"));
		mateDTO.setMateExp(request.getParameter("mateExpint") + request.getParameter("mateExptext"));
		mateDTO.setMateNtrp(Double.parseDouble(request.getParameter("mateNtrp")));
		mateDTO.setMateGametype(request.getParameter("mateGametype"));
		mateDTO.setMateMcount(Integer.parseInt(request.getParameter("mateMcount")));
		mateDTO.setMateMcount(Integer.parseInt(request.getParameter("mateWcount")));
		mateDTO.setMateContent(request.getParameter("mateContent"));
		mateDTO.setMateWritedate(date);
		
		System.out.println(mateDTO);
		mateDAO.write(mateDTO);
		response.sendRedirect("/wg_jsp/mateMatch/mateMatchList/mateMatchList.jsp");
	}

	
}
