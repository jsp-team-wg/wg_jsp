package com.example.app.ma;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.dao.MateDAO;
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
		
		Map<String, Object> mateInfo = new HashMap<>();
		mateInfo.put("mateNum", mateNum);
		mateInfo.put("userNum", mateVO.getUserNum());
		mateInfo.put("mateCourtname", mateVO.getMateCourtname());
		mateInfo.put("mateCourtaddr",  mateVO.getMateCourtaddr());
		mateInfo.put("mateCommentcnt", mateVO.getCommentCnt());
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
		mateInfo.put("mateCommentCnt", mateVO.getCommentCnt());
		//기한마감시 마감완료
		int status = mateVO.getAtstatus();
		System.out.println(status);
		if(status == 1) {
			mateInfo.put("mateAtStatus", status);
		}else {
			String DateString = sdf.format(mateDate);
			String endTime = mateVO.getMateEndtime();
			String formattedTime = endTime.replace(":", "");
			String date = DateString + formattedTime;
			long dateLong = Long.parseLong(date);
			
			//현재 날짜(YYYYMMDDHHMM)
			Date currentDate = new Date();
			String curDate = sdfc.format(currentDate);
			long curDateLong = Long.parseLong(curDate);
			
			//현재시간과 마감시간 비교
		    if (dateLong <= curDateLong) {
				//데이터 업데이트
				mateDAO.changeAt(mateNum);
				mateInfo.put("mateAtStatus", 1);
			}else {
				mateInfo.put("mateAtStatus", 0);
			}
		
	    request.setAttribute("mate", mateInfo);
	    System.out.println(mateVO);
	    request.getRequestDispatcher("/mateMatch/mateMatchViewDetail/mateMatchViewDetail.jsp?mateNum=" + mateNum).forward(request, response);
		
		}
	}
}
