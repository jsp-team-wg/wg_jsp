package com.example.app.ad;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.app.Execute;
import com.example.app.dao.AdminDAO;
import com.example.app.dao.MemberDAO;
import com.example.app.dto.AdminDTO;
import com.example.app.dto.MemberDTO;

public class AdminLoginOkController implements Execute{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		AdminDAO adminDAO = new AdminDAO();
		AdminDTO adminDTO = new AdminDTO();
		
		
		
		adminDTO.setAdminId(request.getParameter("adminId"));
		adminDTO.setAdminPw(request.getParameter("adminPw"));
		adminDTO = adminDAO.signIn(adminDTO);
		adminDTO.setAdminNum(adminDTO.getAdminNum());
		
		System.out.println(request.getParameter("adminId"));
		
		System.out.println(adminDTO.getAdminNum());
		
		
		//회원의 번호, 이름 세션에 저장
		HttpSession session = request.getSession();
		session.setAttribute("adminNum",1);
		
		System.out.println(session.getAttribute("adminNum"));
		
		
		response.sendRedirect("/wg_jsp/admin/adminMember/adminMember.jsp");
		
	}

}
