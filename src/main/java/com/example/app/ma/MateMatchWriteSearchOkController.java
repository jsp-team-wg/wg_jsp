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
import com.example.app.dao.MateDAO;
import com.example.app.dto.MateDTO;

public class MateMatchWriteSearchOkController implements Execute {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				MateDAO mateDAO = new MateDAO();
				MateDTO mateDTO = new MateDTO();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
				SimpleDateFormat sdfc = new SimpleDateFormat("yyyyMMddHHmm");
				List<MateDTO> list = mateDAO.searchMate(request.getParameter("searchQuery"));
				List<Map>resultList = new ArrayList<>();
				
				for (int i=0; i<list.size(); i++) {
					mateDTO = list.get(i);
					Map<String, Object> mateInfo = new HashMap<>();
					int mateNum = mateDTO.getMateNum();
					mateInfo.put("mateNum", mateNum);
					mateInfo.put("mateCourtname", mateDTO.getMateCourtname());
					mateInfo.put("mateCourtaddr",  mateDTO.getMateCourtaddr());
					mateInfo.put("mateCommentcnt", mateDTO.getCommentCnt());
					Date mateDate = mateDTO.getMateDate();
					// Calendar 객체를 생성하고 mateDate를 설정합니다.
					Calendar calendar = Calendar.getInstance();
					calendar.setTime(mateDate);

					// 월과 일을 추출합니다.
					int month = calendar.get(Calendar.MONTH) + 1;
					int day = calendar.get(Calendar.DAY_OF_MONTH);
					String monthString = String.format("%02d", month);
					String dayString = String.format("%02d", day);
					mateInfo.put("mateMonthDay", monthString+"."+dayString);
					
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
					mateInfo.put("mateStarttime", mateDTO.getMateStarttime());
					mateInfo.put("mateEndtime", mateDTO.getMateEndtime());
					mateInfo.put("mateGametype", mateDTO.getMateGametype());
					mateInfo.put("mateMcount", mateDTO.getMateMcount());
					mateInfo.put("mateWcount", mateDTO.getMateWcount());
					mateInfo.put("mateExp", mateDTO.getMateExp());
					
					//기한마감시 마감완료
					int status = mateDTO.getAtstatus();
					System.out.println(status);
					if(status == 1) {
						mateInfo.put("mateAtStatus", status);
					}else {
						String DateString = sdf.format(mateDate);
						String endTime = mateDTO.getMateEndtime();
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
						
					}
					
					resultList.add(mateInfo);
				}
				request.setAttribute("mateSearchList", resultList);
				request.getRequestDispatcher("/mateMatch/mateMatchList/mateMatchList.jsp").forward(request, response);
	}

	
}
