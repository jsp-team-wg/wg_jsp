package com.example.app.me;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.dao.MemberDAO;
import com.example.app.dto.MemberDTO;

public class FindPwOkController implements Execute {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // TODO Auto-generated method stub
        MemberDAO memberDAO = new MemberDAO();
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setUserId(request.getParameter("userId"));
        memberDTO.setUserName(request.getParameter("userName"));
        memberDTO.setUserEmail(request.getParameter("userEmail"));

        request.setCharacterEncoding("UTF-8");


        MemberDTO foundMember = memberDAO.findPw(memberDTO);

        // 사용자 비밀번호 및 길이 가져오기
        String userPassword = foundMember.getUserPassword();
        int passwordLength = userPassword.length();

        // '*' 문자로 마스킹된 비밀번호 생성
        StringBuilder maskedPassword = new StringBuilder();
        for (int i = 0; i < passwordLength; i++) {
            if (i < 4) {
                // 처음 4자는 그대로 표시
                maskedPassword.append(userPassword.charAt(i));
            } else {
                // 나머지는 '*'로 마스킹
                maskedPassword.append("*");
            }
        }

        // 마스킹된 비밀번호를 MemberDTO에 설정
        foundMember.setUserPassword(maskedPassword.toString());

        request.setAttribute("member", foundMember);

        System.out.println(memberDTO.getUserName());
        System.out.println(memberDTO.getUserId());
        System.out.println(memberDTO.getUserEmail());
        System.out.println(memberDTO.getUserNickname());

        request.getRequestDispatcher("/login/findPw/findPw.jsp").forward(request, response);
    }
}
