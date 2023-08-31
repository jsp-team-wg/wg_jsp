package com.example.app.me;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.app.Execute;

public class LogoutOkController implements Execute {
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();
		session.invalidate();
		System.out.println("실행");
		try {
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
