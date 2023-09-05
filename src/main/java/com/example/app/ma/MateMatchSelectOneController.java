package com.example.app.ma;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.dao.MateCommentDAO;
import com.example.app.dao.MateDAO;
import com.example.app.dto.MateCommentDTO;
import com.example.app.vo.MateCommentVO;
import com.example.app.vo.MateVO;

public class MateMatchSelectOneController implements Execute{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat sdfc = new SimpleDateFormat("yyyyMMddHHmm");
		MateDAO mateDAO = new MateDAO();
	    int mateNum = Integer.parseInt(request.getParameter("mateNum"));
	    MateVO mateVO = mateDAO.selectOne(mateNum);
	    
	    MateCommentDAO mateCommentDAO = new MateCommentDAO();
	    MateCommentVO mateCommentVO = new MateCommentVO();
	    List<MateCommentVO> list = mateCommentDAO.selectComment(mateNum);
	    List<Map>listResult = new ArrayList<>();
	    
	    for(int i=0; i<list.size(); i++) {
	    	mateCommentVO = list.get(i);
	    	Map<String, Object> commentInfo = new HashMap<>();
	    	commentInfo.put("userNickname", mateCommentVO.getUserNickname());
	    	commentInfo.put("commentNum",mateCommentVO.getCommentNum());
	    	commentInfo.put("userNum", mateCommentVO.getUserNum());
	    	commentInfo.put("mateNum", mateCommentVO.getMateNum());
	    	commentInfo.put("commentContent", mateCommentVO.getCommentContent());
	    	listResult.add(commentInfo);
	    }
	    request.setAttribute("mateCommentList", listResult);
	    System.out.println(listResult);
		
		Map<String, Object> mateInfo = new HashMap<>();
		mateInfo.put("mateNum", mateNum);
		mateInfo.put("userNum", mateVO.getUserNum());
		mateInfo.put("mateCourtname", mateVO.getMateCourtname());
		mateInfo.put("mateCourtaddr",  mateVO.getMateCourtaddr());
		mateInfo.put("mateCommentcnt", mateVO.getMateCommentCnt());
		Date mateDate = mateVO.getMateDate();
		// Calendar 객체를 생성하고 mateDate를 설정합니다.
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(mateDate);

		// 월과 일을 추출합니다.
		int month = calendar.get(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int year = calendar.get(Calendar.YEAR);
		String yearString = Integer.toString(year);
		String monthString = String.format("%02d", month);
		String dayString = String.format("%02d", day);
		mateInfo.put("mateMonthDay",yearString+"." +monthString+"."+dayString);
		
		// 요일을 추출합니다.
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

		// dayOfWeek의 값에 따라 요일을 문자열로 변환합니다.
		String dayOfWeekString = "";
		switch (dayOfWeek) {
		    case Calendar.SUNDAY:
		        dayOfWeekString = "일";
		        break;
		    case Calendar.MONDAY:
		        dayOfWeekString = "월";
		        break;
		    case Calendar.TUESDAY:
		        dayOfWeekString = "화";
		        break;
		    case Calendar.WEDNESDAY:
		        dayOfWeekString = "수";
		        break;
		    case Calendar.THURSDAY:
		        dayOfWeekString = "목";
		        break;
		    case Calendar.FRIDAY:
		        dayOfWeekString = "금";
		        break;
		    case Calendar.SATURDAY:
		        dayOfWeekString = "토";
		        break;
		}
		mateInfo.put("mateWeek", dayOfWeekString);
		mateInfo.put("mateStarttime", mateVO.getMateStarttime());
		mateInfo.put("mateEndtime", mateVO.getMateEndtime());
		mateInfo.put("mateGametype", mateVO.getMateGametype());
		mateInfo.put("mateMcount", mateVO.getMateMcount());
		mateInfo.put("mateWcount", mateVO.getMateWcount());
		mateInfo.put("mateExp", mateVO.getMateExp());
		mateInfo.put("mateNtrp", mateVO.getMateNtrp());
		mateInfo.put("mateContent", mateVO.getMateContent());
		mateInfo.put("userNickname", mateVO.getUserNickname());
		mateInfo.put("userGender", mateVO.getUserGender());
		mateInfo.put("userExp", mateVO.getUserExp());
		mateInfo.put("userNtrp", mateVO.getUserNtrp());
		mateInfo.put("mateCommentCnt", mateVO.getMateCommentCnt());
		//기한마감시 마감완료
		int status = mateVO.getMateAtstatus();
		mateInfo.put("mateAtStatus", status);
		System.out.println(status);
		
		System.out.println(mateInfo);
	    request.setAttribute("mate", mateInfo);
	    System.out.println(mateVO);
	    request.getRequestDispatcher("/mateMatch/mateMatchViewDetail/mateMatchViewDetail.jsp?mateNum=" + mateNum).forward(request, response);
		
		}
	}

