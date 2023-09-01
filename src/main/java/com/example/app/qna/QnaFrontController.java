package com.example.app.qna;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class QnaFrontController
 */
public class QnaFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QnaFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
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
		case "/community/qnaList/qnaListOk.qna":
			System.out.println("qnaOk!!");
			new QnaListOkController().execute(request,response);
			break;

		}
	}

}
