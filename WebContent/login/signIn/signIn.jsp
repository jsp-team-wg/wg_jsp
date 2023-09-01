<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>로그인</title>
    <script defer src="${pageContext.request.contextPath}/resource/js/signIn.js"></script>
    <link rel="stylesheet" href="../../resource/css/signIn.css">
</head>

<body>
    <%@ include file="../../../header.jsp" %>
    <section class="section1-login">로그인</section>

    <section class="section2-input">

        <div class="container">
            <div class="container-id">
                <div class="container-id-text">아이디</div>
            </div>
            <form action="${pageContext.request.contextPath}/login/signIn/signInOk.me" method="post" onsubmit="return submitForm();">
                <div class="container-id-input">
                    <input class="container-id-input-box" type="text" placeholder=" 아이디를 입력해주세요" name="userId">
                </div>
            
	            <div class="container-pw">
	                <div class="container-pw-text">비밀번호</div>
	            </div>


            <form action="${pageContext.request.contextPath}/login/signIn/signInOk.me" method="post">

                <div class="container-pw-input">
                    <input class="container-pw-input-box" type="password" placeholder=" 비밀번호를 입력해주세요" name="userPassword">
                </div>

            </form>   
	            <button class="container-login-button" type="submit">
	                <div class="container-login-button-text">
	                    로그인
	                </div>
	            </button>
			</form>

            <div class="find-id-pw">
                <a class="find-id-a" href="../findId/findId.jsp">
                    <div class="find-id">
                        <div class="find-id-text">
                            아이디 찾기
                        </div>
                    </div>
                </a>
                <div class="seperate-bar">|</div>
                <a class="find-pw-a" href="../findPw/findPw.jsp">
                    <div class="find-pw">
                        <div class="find-pw-text">
                            비밀번호 찾기
                        </div>
                    </div>
                </a>
            </div>
            <div class="signup">
                <a class="signup-a" href="">
                    <div class="signup-text">
                        회원가입
                    </div>
                </a>
            </div>

        </div>
    </section>
    <%@ include file="../../../footer.jsp" %>
</body>

</html>