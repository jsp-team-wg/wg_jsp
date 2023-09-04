package com.example.app.qna;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.app.Execute;
import com.example.app.dao.QnaCommentDAO;
import com.example.app.dao.QnaDAO;
import com.example.app.dto.QnaCommentDTO;
import com.example.app.dto.QnaDTO;
import com.example.app.vo.QnaCommentVO;
import com.example.app.vo.QnaViewDetailVo;

public class QnaViewDetailOkController implements Execute {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		QnaDAO qnaDAO = new QnaDAO();
		QnaDTO qnaDTO = new QnaDTO();
		QnaCommentDAO qnaCommentDAO = new QnaCommentDAO();
		QnaCommentDTO qnaCommentDTO = new QnaCommentDTO();
		QnaCommentVO qnaCommentVO = new QnaCommentVO();
		
		// 클릭한 게시글 번호 추적
		int listNum = 1;
		if (request.getParameter("listNum") != null) {
			listNum = Integer.parseInt(request.getParameter("listNum"));
		}
		System.out.println("게시글번호 : " + listNum);
		request.setAttribute("listNum", listNum);
	
		// 조회수 올리기
		
		int prevView = qnaDAO.getPrevView(listNum).getQnaViewCnt();

		qnaDTO.setQnaNum(listNum);
		qnaDTO.setQnaViewCnt(prevView + 1);

		System.out.println("게시글번호 : " + qnaDTO.getQnaNum());
		System.out.println("기존 조회수 : " + prevView);
		System.out.println("새로운 조회수 : " + qnaDTO.getQnaViewCnt());
		qnaDAO.addViewCnt(qnaDTO);

		// 해당 번호의 게시글에 내용 넣기
		QnaViewDetailVo qnaViewDetail = qnaDAO.qnaViewDetail(listNum);

		System.out.println("내용 : " + qnaViewDetail);

		request.setAttribute("qnaViewDetail", qnaViewDetail);

		
		
		// 페이지네이션
		int totalPage = 10;
		int totalList = 6;
		int currentPage = 1;
		int pageBlock = 1;
		int lastPage = 1;

//				게시글 개수
		int totalListNum = qnaDAO.countQnaCommentNum();
		int maxBlock = (totalListNum - 1) / 60 + 1;
		int listLeftOver = totalListNum % 60;
		int maxPage = listLeftOver / 6 + 1;
		if (listLeftOver % 10 == 0) {
			maxPage = listLeftOver / 6;
		}

		System.out.println("댓글 총 개수!! : " + totalListNum);

		if (request.getParameter("page") != null) {

			if (Integer.parseInt(request.getParameter("page")) > 0) {
				currentPage = Integer.parseInt(request.getParameter("page"));
			}
			if (Integer.parseInt(request.getParameter("page")) > maxPage) {
				currentPage = Integer.parseInt(request.getParameter("page")) - 1;
			}
		}

		// 첫 페이지번호 & 마지막 페이지번호

		lastPage = maxPage;

		if (currentPage > lastPage) {
			currentPage = lastPage;
		}

		pageBlock = (currentPage - 1) / 10 + 1;

		int firstPage = (pageBlock - 1) * 10 + 1;

		List<Integer> pageList = new ArrayList<>();
		for (int i = firstPage; i <= lastPage; i++) {
			pageList.add(i);
		}

		int firstList = (currentPage - 1) * totalList;

		
		// 댓글출력
		List<QnaCommentVO> commentList = null;
		if (totalListNum != 0) {
			System.out.println("조건문 진입!!");
			System.out.println("firstList!! : " + firstList);
			commentList = qnaCommentDAO.bringQnaCommentList(firstList);
		}

		HttpSession session = request.getSession();
		//댓글작성
		if(session.getAttribute("userNickname") !=  null) {
		
		String userNickname = (String)session.getAttribute("userNickname");
		int userNum= (Integer)session.getAttribute("userNum");
		
		String commentWrite = request.getParameter("commentWrite");
		System.out.println("댓글!!!! : " + commentWrite);
		System.out.println("게시글넘버 : " +listNum);
		
		if(commentWrite != null) {
			
			qnaCommentDTO.setQnaNum(listNum);
			qnaCommentDTO.setCommentContent(commentWrite);
			qnaCommentDTO.setUserNum(userNum);
			
			qnaCommentDAO.commentWrite(qnaCommentDTO);
			
		
		}
		}
		
		//댓글삭제
		System.out.println("댓글번호!!!!! : "+request.getParameter("reviewNum"));
		
		if( request.getParameter("reviewNum")!=null) {
			int reviewNum =Integer.parseInt(request.getParameter("reviewNum"));
			qnaCommentDAO.deleteReview(reviewNum);
		}
		
	
		
		System.out.println("commentList!! : " + commentList);
		
		request.setAttribute("qnaReview", commentList);
		request.setAttribute("currentPage", currentPage);
		request.setAttribute("pageList", pageList);
		request.getRequestDispatcher("/community/qna/qnaViewDetail/qnaViewDetail.jsp").forward(request, response);

	}

}
