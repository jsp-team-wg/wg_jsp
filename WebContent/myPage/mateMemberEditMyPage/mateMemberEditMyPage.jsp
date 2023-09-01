<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>마이페이지 회원정보 수정</title>
<link rel="stylesheet"
	href="../../resource/css/mateMatchMyPageMemberEdit.css">
<script src="../../resource/js/mateMatchMyPageMemberEdit.js"></script>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>
	<%@ include file="../../headerLogin.jsp"%>
	<main>
		<aside>
			<section class="aside-box">
				<div class="aside-member-box hover1">
					<div class="aside-member-text-box">
						<a
							href="${pageContext.request.contextPath}/mypage/MyPageEdit/MyPageEdit.my">
							<span class="aside-member-text white">회원정보 수정</span>
						</a>
					</div>
				</div>
				<div class="aside-matematch-box hover1">
					<div class="aside-matematch-text-box">
						<a
							href="${pageContext.request.contextPath}/myPage/mateFindMyPage/mateFindMyPage.my">
							<span class="aside-matematch-text white">메이트 찾기</span>
						</a>
					</div>
				</div>
				<div class="aside-qna-box hover1">
					<div class="aside-qna-text-box">
						<a
							href="${pageContext.request.contextPath}/myPage/mateMatchQnaMyPage/mateMatchQnaMyPage.my">
							<span class="aside-qna-text white">Q&A</span>
						</a>
					</div>
				</div>
			</section>
		</aside>

		<!-- 회원정보 수정 -->
		<section class="accountmodify-form">
			<form
				action="${pageContext.request.contextPath}/mypage/MyPageEdit/MyPageDel.my">
				<div class="withdraw">
					<input class="withdraw-button" type="button" value="회원탈퇴"
						onclick="withdraw_confirm();" style="cursor: pointer">
				</div>
			</form>
			<form
				action="${pageContext.request.contextPath}/mypage/MyPageEdit/MyPageEditOk.my">
				
				
				<!-- 아이디 -->
				<div class="accountmodify-smallform">
					<div class="id-box mp">
						아이디 : <span class="id-text">${myPageEdit.getUserId()}</span>
					</div>
					<!-- 이름 -->
					<div class="name-box mp">
						이름 : <span class="name-text"></span>
					</div>
					<!-- 닉네임 -->
					<div class="nickname-box mp">
						닉네임 : <span class="nickname-text">${myPageEdit.getUserNickname()}</span>
					</div>
					<!-- 비밀번호 변경 -->
					<div class="pw-box mp">
						비밀번호 변경
						<div class="pw-text-box">
							<input class="pwmatch-input" type="password"
								placeholder="사용 할 비밀번호를 입력해주세요" oninput="pwCheck()"
								id="password"><br> <span class="check-msg"
								id="check-pw-msg"></span>
						</div>
					</div>
					<!-- 비밀번호 확인 -->
					<div class="pwmatch-box mp">
						비밀번호 확인
						<div class="pwmatch-text-box">
							<input class="pwmatch-input-check" type="password"
								placeholder="입력한 비밀번호를 다시 입력해주세요" oninput="pwCheck()">
						</div>
					</div>
					<!-- 비밀번호 확인 문구 -->
					<div class="pwmatch-ment-box mp">비밀번호를 입력하세요</div>

					<!-- 이메일 -->
					<div class="email-box mp">
						이메일 : <span class="emial-text">${myPageEdit.getUserEmail()}</span>
					</div>
					<!-- 성별 -->
					<div class="gender-box mp">
						성별
						<div class="gender-button">
							<input class="gender-input hover2" type="button" value="남자">
							<input class="gender-input hover3" type="button" value="여자">
						</div>
					</div>
					<!-- 구력 -->
					<div class="oldpower-box mp">
						나의 구력
						<div class="oldpower-text">
							<input class="oldpower-input" type="text" value="${myPageEdit.getUserExp()}" name="userExp">년
						</div>
					</div>
					<!-- NTRP -->
					<div class="ntrp-box mp">
						NTRP(선택)
						<div class="ntrp-dropdown">
							<select class="ntep-select">
								<option value="선택"></option>
								<option value="1.0">1.0</option>
								<option value="1.0">1.5</option>
								<option value="1.0">2.0</option>
								<option value="1.0">2.5</option>
								<option value="1.0">3.0</option>
								<option value="1.0">3.5</option>
								<option value="1.0">4.0</option>
								<option value="1.0">4.5</option>
								<option value="1.0">5.0</option>
							</select>
						</div>
					</div>
				</div>
			
				<!-- 수정완료 버튼 -->

				<div class="button-box">
					<input class="submit-button" type="submit" value="수정완료"
						onclick="alert('수정이 완료 되었습니다.');" style="cursor: pointer">
				</div>
			</form>
		</section>
	</main>
	<%@ include file="../../footer.jsp"%>
</body>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
	let $checkPwMsg = $("#check-pw-msg");
	let $pwInput = $("#password");
	//비밀번호 유효성검사
	// 영어 대소문자를 구분하지 않음
	// 영어, 숫자, 특수문자로 이루어진 비밀번호 8글자 이상
	const regex = /^(?=.*[a-zA-Z])(?=.*\d)(?=.*[!@#$%^&*()_+])[a-zA-Z\d!@#$%^&*()_+]{8,}$/;

	$pwInput
			.on(
					'blur',
					function() {
						if (regex.test($pwInput.val())) {
							//console.log("비밀번호가 유효합니다.");
							$checkPwMsg.text("사용 가능한 비밀번호입니다.")
						} else {
							//console.log("올바른 비밀번호를 입력해주세요.");
							$checkPwMsg
									.html("사용 불가능한 비밀번호입니다.<br>영어, 숫자, 특수문자를 포함하여 8글자 이상 작성하세요")
						}
					});
</script>
</html>