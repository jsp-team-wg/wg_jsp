package com.example.app.fr;

import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.dao.FreeBoardDAO;
import com.example.app.vo.FreeBoardVO;

public class FreeboardSelectOneController implements Execute{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		FreeBoardDAO freeboardDAO = new FreeBoardDAO();
		int freeboardNum = Integer.parseInt(request.getParameter("freeboardNum"));
		FreeBoardVO freeboardVO = freeboardDAO.selectOne(freeboardNum);
		
		Map<String, Object> freeboardInfo = new HashMap<>();
		freeboardInfo.put("freeboardNum", freeboardNum);
		freeboardInfo.put("userNum", freeboardVO.getUserNum());
		freeboardInfo.put("userNickName", freeboardVO.getUserNickname());
		freeboardInfo.put("useGender", freeboardVO.getUserGender());
		freeboardInfo.put("userNtrp", freeboardVO.getUserNtrp());
		freeboardInfo.put("userExp", freeboardVO.getUserExp());
		freeboardInfo.put("freeboardTitle", freeboardVO.getFreeboardTitle());
		freeboardInfo.put("freeboardContent", freeboardVO.getFreeboardContent());
		freeboardInfo.put("freeboardViewCnt", freeboardVO.getFreeboardViewCnt());
		freeboardInfo.put("freeboardCommnetCnt", freeboardVO.getFreeboardCommentCnt());
		
		
		// Calendar 객체를 생성하고 freeboardDate를 설정합니다.
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(freeboardVO.getFreeboardWriteDate());

        // 월과 일을 추출합니다.
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int year = calendar.get(Calendar.YEAR);
        String yearString = Integer.toString(year);
        String monthString = String.format("%02d", month);
        String dayString = String.format("%02d", day);
       
        
        freeboardInfo.put("freeboardMonthDay", yearString+"."+monthString+"."+dayString);
        System.out.println(yearString+"."+monthString+"."+dayString);
		request.setAttribute("freeboard", freeboardInfo);
		System.out.println(freeboardVO);
		request.getRequestDispatcher("/community/freeboard/freeboardViewDetail/freeboardViewDetail.jsp?freeboardNum=" + freeboardNum).forward(request, response);
		
	}

}
