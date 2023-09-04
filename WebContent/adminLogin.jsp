<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>관리자 로그인</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resource/css/adminLogin.css">
</head>
<body>
<form action="${pageContext.request.contextPath}/adminLoginOk.ad">
    <section class="section1-login">관리자 로그인</section>
    
    <section class="section2-input">

        <div class="container">
            <div class="container-id">
                <div class="container-id-text">아이디</div>
            </div>
            <form action="">
                <div class="container-id-input">
                    <input class="container-id-input-box" type="text" placeholder=" 아이디를 입력해주세요" name="adminId">
                </div>
            </form>
            <div class="container-pw">
                <div class="container-pw-text">비밀번호</div>
            </div>
            
                <form action="">
                    <div class="container-pw-input">
<<<<<<< HEAD
                        <input class="container-pw-input-box" type="text" placeholder=" 비밀번호를 입력해주세요" name="adminPw">
=======
                        <input class="container-pw-input-box" type="password" placeholder=" 비밀번호를 입력해주세요" name="adminPw">
>>>>>>> ljj
                    </div>
                </form>
            <button class="container-login-button" 
				type="submit">
                <div class="container-login-button-text">
                    로그인
                </div>
            </button>
            
            
        </div>
    </section>
    </form>
</body>
</html>