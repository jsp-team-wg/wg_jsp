<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>회원가입</title>
    <link rel="stylesheet" href="../../resource/css/signUp.css">
    <script defer src="../../resource/js/signUp.js"></script>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>
    <%@ include file="../../../header.jsp" %>
    <div class="Area">
        <section class="MainText-Container">
            <div class="MainText-Style">회원가입</div>
        </section>
        <section class="Content-OuterContainer">
            <div class="Content-InnerContainer">
                <form id="signup-form" action="${pageContext.request.contextPath}/login/signUp/signUpOk.me" method="post">
                    <!-- 아이디 -->
                    <div class="Container1">
                        <span class="Text-Style1">아이디</span>
                        <br>
                        <input class="Input-Style1 Shadow2" type="text" 
                        placeholder="   아이디를 입력해주세요" id="id"
                        name="userId" required>
                        <button class="Button-Style1 Text-Style2 Shadow1" type="button"
                        id="idCheck" >중복확인</button>
                    </div>

                    <!-- 닉네임 -->
                    <div class="Container2">
                        <span class="Text-Style1">닉네임</span>
                        <br>
                        <input class="Input-Style1 Shadow2" type="text" 
                        placeholder="   닉네임을 입력해주세요"
                        name="userNickname" required>
                        <button class="Button-Style1 Text-Style2 Shadow1">중복확인</button>
                    </div>

                    <!-- 비밀번호 -->
                    <div class="Container2">
                        <span class="Text-Style1">비밀번호</span>
                        <br>
                        <input class="Input-Style2 Shadow2 Normal" type="password" 
                        placeholder="   비밀번호를 입력해주세요" id="password"
                        name="userPassword"
                        oninput="pwCheck()" required>
                    </div>
						<div id="check-pw-msg"></div>
                    <!-- 비밀번호 확인 -->
                    <div class="Container2">
                        <span class="Text-Style1">비밀번호 확인</span>
                        <br>
                        <input class="Input-Style2 Shadow2 Check" type="password" 
                        placeholder="   비밀번호를 다시 입력해주세요" 
                        name="userPasswordCheck"
                        oninput="pwCheck()" required>
                        <div class="Confirm"></div>
                    </div>
                    

                    <!-- 이메일 -->
                    <div class="Container2">
                        <span class="Text-Style1">이메일</span>
                        <br>
                        <input class="Input-Style2 Shadow2" type="email" 
                        placeholder="   이메일을 입력해주세요 ex&#41; hong123@email.net"
                        name="userEmail" required>
                    </div>

                    <!-- 이름 -->
                    <div class="Container2">
                        <span class="Text-Style1">이름</span>
                        <br>
                        <input class="Input-Style2 Shadow2" type="text" 
                        placeholder="   이름을 입력해주세요 ex&#41; 홍길동"
                        name="userName" required>
                    </div>

                    <!-- 성별 -->
                    <div class="Container2">
                        <span class="Text-Style1">성별</span>
                        <br>
                        <input class="Button-Style2 Shadow2" 
						       type="button" value="남성" 
						       name="userGender" onclick="setGender('남성')">
						<input class="Button-Style3 Shadow2" 
						       type="button" value="여성" 
						       name="userGender" onclick="setGender('여성')">
                    </div>

                    <!-- 나의 구력 -->
                    <div class="Container2">
                        <span class="Text-Style1">나의 구력</span>
                        <br>
                        <input class="Input-Style3 Shadow2" type="text" 
                        name="userExp"
                        placeholder="ex&#41; 3" required>
                        <span class="Text-Style1">년</span>
                    </div>

                    <!-- NTRP (선택) -->
                    <div class="Container2">
                        <span class="Text-Style1">NTRP &#40;선택&#41;</span>
                        <br>
                        <select class="Select-Style1 Text-Style3 Shadow2" name="userNtrp" required>
                            <option>선택</option>
                            <option value="1.0">1.0</option>
                            <option value="1.5">1.5</option>
                            <option value="2.0">2.0</option>
                            <option value="2.5">2.5</option>
                            <option value="3.0">3.0</option>
                            <option value="3.5">3.5</option>
                            <option value="4.0">4.0</option>
                            <option value="4.5">4.5</option>
                            <option value="5.0">5.0</option>
                        </select>
                    </div>

                    <!-- 이용약관 동의 -->
                    <div class="Container3">
                        <span class="Text-Style1">이용약관 동의</span>
                        <br>
                        <div class="Agree-OuterContainer">
                            <div class="Agree-InnerContainer1">
                                <span class="Text-Style3">이용약관</span>
                                <input class="Input-Style4" type="checkbox" id="agree1" required/>
                            </div>
                            <div class="Agree-InnerContainer2">
                                <span class="Text-Style3">개인정보 처리방침</span>
                                <input class="Input-Style4" type="checkbox" id="agree2" required/>
                            </div>
                        </div>
                    </div>
					<input type="hidden" id="userGender" name="userGender">
                    <!-- 회원가입 완료 -->
                    
                    <button type="submit" class="SignUpDone-Container Shadow1">
                        <span class="Text-Style1" >회원가입 완료</span>
                    </button>
                </form>
            </div>
        </section>
    </div>
    <%@ include file="../../../footer.jsp" %>
</body>

	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/join.js"></script>
	
 	<script>
 	let $checkMsg = $("#check-id-msg");
 	let $checkPwMsg = $("#check-pw-msg");
 	let $idInput = $("#id");
 	let $pwInput = $("#password");
 	

	 </script>	 
	 <script>	
	 	//비밀번호 유효성검사
	 	// 영어 대소문자를 구분하지 않음
		// 영어, 숫자, 특수문자로 이루어진 비밀번호 8글자 이상
		const regex = /^(?=.*[a-zA-Z])(?=.*\d)(?=.*[!@#$%^&*()_+])[a-zA-Z\d!@#$%^&*()_+]{8,}$/;
		
		$pwInput.on('blur', function() {
			if (regex.test($pwInput.val())) {
				//console.log("비밀번호가 유효합니다.");
				$checkPwMsg.text("사용 가능한 비밀번호입니다.")
			} else {
				//console.log("올바른 비밀번호를 입력해주세요.");
				$checkPwMsg.html("사용 불가능한 비밀번호입니다.<br>영어, 숫자, 특수문자를 포함하여 8글자 이상 작성하세요")
			}
		});
	</script>
	<script>
		//약관확인하기
		$('form').on('submit', function(e) {
			e.preventDefault(); // 기본 이벤트를 막아주는 명령어(지금은 submit 이벤트)
			
			//console.log($('#agree').prop('checked'));
			
			if($('#agree1').prop('checked') && $('#agree2').prop('checked')){
		this.submit(); // 서브밋 이벤트를 발생시키는 메소드(폼 요소에 사용해야 함)
			} else {
				alert('약관에 동의해주세요!')
			}
		});
	</script>


</html>