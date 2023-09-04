package com.example.app.fr;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class FreeboardFrontController
 */
public class FreeboardFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FreeboardFrontController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// post방식으로 보내게 되면 request 객체에 저장된 한글이 깨지므로 utf-8 추가해야한다
		request.setCharacterEncoding("utf-8");
		doProcess(request, response);
	}

	// jsp프로젝트에서는 get과 post를 구분하지 않고 사용
	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("wg 서블릿이 실행");

		// request.getContextPath()는 URL루트 경로를 의미한다
		System.out.println(request.getContextPath());

		// request.getRequestURI는 현재 요청의 URI를 보여준다
		System.out.println(request.getRequestURI());

		// 전체 URI에서 ContextPath를 제외시킨 부분이 필요하다
		String target = request.getRequestURI().substring(request.getContextPath().length());
		System.out.println(target);

		// 단순한 값비교는 if문보다 switch문이 효율성이 좋고 가독성도 좋다
		// break문을 꼭 써야된다!
		switch (target) {
		// 자유게시판 글 작성 페이지 이동
		case "/community/freeboard/freeboardWrite/freeboardWrite.fr":
			System.out.println("freeboardWrite!!");
			request.getRequestDispatcher("/community/freeboard/freeboardWrite/freeboardWrite.jsp").forward(request, response);
			break;
		//자유게시판 글 작성 기능
		case "/community/freeboard/freeboardWrite/freeboardWriteOk.fr":
			System.out.println("freeboardWriteOk!!");
			new FreeboardWriteController().execute(request, response);
			break;
		//자유게시판 글 목록 화면 이동
		case "/community/freeboard/freeboardList/freeboardList.fr":
			System.out.println("freeboardList!!");
			request.getRequestDispatcher("/community/freeboard/freeboardList/freeboardList.jsp").forward(request, response);
			break;
		//자유게시판 찾기 글 목록 불러오기
		case "/community/freeboard/freeboardList/freeboardListOk.fr":
			System.out.println("freeboardListOk!!");
			new FreeboardSelectAllController().execute(request, response);
			break;
		//자유게시판 글 상세 보기 화면 이동
		case "/community/freeboard/freeboardViewDetail/freeboardViewDetail.fr" :
			System.out.println("freeboardViewDetail!!");
			new FreeboardSelectOneController().execute(request, response);
			break;
		//자유게시판 특정 글 데이터 불러오기
		case "/community/freeboard/freeboardViewDetail/freeboardViewDetailOk.fr" :
			System.out.println("mateMatchViewDetailOk!!");
			new FreeboardSelectOneController().execute(request, response);
			break;
		//자유게시판 글 수정 화면으로 이동
		case "/community/freeboard/freeboardEdit/freeboardEdit.fr":
			System.out.println("freeboardEdit!!");
			new FreeboardEditController().execute(request, response);
			break;
		//자유게시판 글 수정 기능
		case "/community/freeboard/freeboardList/freeboardEditOk.fr":
			System.out.println("freeboardEditOk!!");
			new FreeboardEditOkController().execute(request, response);
			break;
		//자유게시판 글 삭제 기능
		case "/community/freeboard/freeboardViewDetail/freeboardDeleteOk.fr" :
			System.out.println("freeboardDeleteOk!!");
			new FreeboardDeleteController().execute(request, response);
			break;
		

		}
	}

}

