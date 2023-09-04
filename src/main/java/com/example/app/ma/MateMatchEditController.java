package com.example.app.ma;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.dao.MateDAO;
import com.example.app.dto.MateDTO;

public class MateMatchEditController implements Execute{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		MateDTO mateDTO = new MateDTO();
		MateDAO mateDAO = new MateDAO();
		
		int mateNum = Integer.parseInt(request.getParameter("mateNum"));
		mateDTO = mateDAO.selectEditOne(mateNum);
		Map<String,Object> map = new HashMap<>();
		map.put("mateNum", mateDTO.getMateNum());
		map.put("courtname", mateDTO.getMateCourtname());
		map.put("courtaddr", mateDTO.getMateCourtaddr());
		
		Date date = mateDTO.getMateDate();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		String formattedDate = sdf.format(date);
		map.put("mateDate", formattedDate);
		
		
		map.put("mateStarttime", mateDTO.getMateStarttime());
		map.put("mateEndtime", mateDTO.getMateEndtime());
		map.put("mateExp", mateDTO.getMateExp());
		map.put("mateNtrp", mateDTO.getMateNtrp());
		map.put("mateGametype", mateDTO.getMateGametype());
		int mcount = mateDTO.getMateMcount();
		int wcount = mateDTO.getMateWcount();
		map.put("mateMWcount","남자 "+mcount+"명 "+"여자 "+wcount+"명");
		map.put("mateContent", mateDTO.getMateContent());
		
		request.setAttribute("mate", map);
		request.getRequestDispatcher("/mateMatch/mateMatchEdit/mateMatchEdit.jsp?mateNum=" + mateNum).forward(request, response);
	}
}
