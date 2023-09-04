package com.example.app.ma;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.me.LoginOkController;
import com.example.app.me.LogoutOkController;
import com.example.app.me.SignUpOkController;

/**
 * Servlet implementation class MateMatchFrontController
 */
public class MateMatchFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MateMatchFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//post방식으로 보내게 되면 request 객체에 저장된 한글이 깨지므로 utf-8 추가해야한다
		request.setCharacterEncoding("utf-8");
		doProcess(request, response);
	}
	
	//jsp프로젝트에서는 get과 post를 구분하지 않고 사용
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("wg 서블릿이 실행");
		
		//request.getContextPath()는 URL루트 경로를 의미한다
		System.out.println(request.getContextPath());
		
		//request.getRequestURI는 현재 요청의 URI를 보여준다		
		System.out.println(request.getRequestURI());
		
		//전체 URI에서 ContextPath를 제외시킨 부분이 필요하다
		String target = request.getRequestURI().substring(request.getContextPath().length());
		System.out.println(target);
		
		
		//단순한 값비교는 if문보다 switch문이 효율성이 좋고 가독성도 좋다
		//break문을 꼭 써야된다!
		switch(target) {
		
		//메이트 글 작성 기능
		case "/mateMatch/mateMatchWrite/mateMatchWriteOk.ma":
			System.out.println("mateMatchWriteOk!!");
			new MateMatchWriteController().execute(request, response);
			break;
		//메이트 찾기 글 목록 화면 이동
		case "/mateMatch/mateMatchList/mateMatchList.ma":
			System.out.println("mateMatchList!!");
			request.getRequestDispatcher("/mateMatch/mateMatchList/mateMatchList.jsp").forward(request, response);
			break;
		//메이트 찾기 글 목록 불러오기
		case "/mateMatch/mateMatchList/mateMatchListOk.ma":
			System.out.println("mateMatchListOk!!");
			new MateMatchSelectAllController().execute(request, response);
			break;
		//메이트 찾기 글 상세 보기 화면 이동
		case "/mateMatch/mateMatchViewDetail/mateMatchViewDetail.ma" :
			System.out.println("mateMatchViewDetail!!");
			new MateMatchSelectOneController().execute(request, response);
			break;
		//메이트 찾기 특정 글 데이터 불러오기
		case "/mateMatch/mateMatchViewDetail/mateMatchViewDetailOk.ma" :
			System.out.println("mateMatchViewDetailOk!!");
			new MateMatchSelectOneController().execute(request, response);
			break;
		//메이트 찾기 글 수정 화면으로 이동
		case "/mateMatch/mateMatchEdit/mateMatchEdit.ma":
			System.out.println("mateMatchEdit!!");
			new MateMatchEditController().execute(request, response);
			break;
		//메이트 찾기 글 수정 기능
		case "/mateMatch/mateMatchEdit/mateMatchEditOk.ma":
			System.out.println("mateMatchEditOk!!");
			new MateMatchEditOkController().execute(request, response);
			break;
		//메이트 찾기 글 삭제 기능
		case "/mateMatch/mateMatchViewDetail/mateMatchDeleteOk.ma" :
			System.out.println("mateMatchDeleteOk!!");
			new MateMatchDeleteController().execute(request, response);
			break;
		//메이트 글 검색 기능
		case "/mateMatch/mateMatchWrite/mateMatchWriteSearchOk.ma" :
			System.out.println("mateMatchWriteSearchOk!!");
			new MateMatchWriteSearchOkController().execute(request, response);
			break;
		//메이트 글 댓글 작성
		case "/mateMatch/mateMatchViewDetail/mateMatchCommentWriteOk.ma" :
			System.out.println("mateMatchCommentWriteOk!!");
			new MateCommentWriteController().execute(request, response);
			break;
		}
		
	}
}
