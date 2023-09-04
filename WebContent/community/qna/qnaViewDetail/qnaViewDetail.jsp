<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Q&A 상세보기</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resource/css/qnaViewDetail.css" />
<!-- 구글 폰트 -->
</head>
<body>
	<c:choose>
		<c:when test="${empty sessionScope}">
			<jsp:include page="../../../header.jsp" />
		</c:when>
		<c:otherwise>
			<jsp:include page="../../../headerLogin.jsp" />
		</c:otherwise>
	</c:choose>

	<!-- 커뮤니티(Q&A) 상세보기 전체 영역 -->
	<div class="Area">
		<!-- 위쪽 컨테이너 -->
		<section class="MainText-Container">
			<div class="MainText-Container-text1">커뮤니티</div>
			<div class="MainText-Container-text2">Q&A - 상세페이지</div>
		</section>
		<section class="Up-Container">
			<form action="" method="get">
				<div class="Content-OuterContainer1 Shadow">
					<div class="Content-InnerContainer1">
						<!-- 제목 -->
						<div class="Title-Container">
							<span>${qnaViewDetail.getQnaTitle()}</span>
						</div>
						<hr />
						<!-- 작성자 -->
						<div class="Author-Container">
							<span>${qnaViewDetail.getUserNickname()}</span> <span
								class="Text-Style1 man">${qnaViewDetail.getUserGender()}</span>
							<span class="ntrp">NTRP</span> <span class="ntrp-num">${qnaViewDetail.getUserNTRP()}</span>
							<span class="exp">구력</span> <span class="exp-year">${qnaViewDetail.getUserExp()}</span>
							<span class="year">년</span>
						</div>
						<hr />
						<!-- 게시일 -->
						<div class="PostDate-Container">
							<span class="Text-Color-Gray">게시일</span> <span
								class="Text-Style1">${qnaViewDetail.getQnaWriteDate()}</span>
						</div>
						<!-- 코멘트 -->
						<div class="Comment-OuterContainer">
							<div class="Comment-InnerContainer">
								<div>
									<span class="Text-Color-Gray">내용</span>
								</div>
								<div class="Text-Style1 Input-Style2 content-Size1">
									<textarea class="content-box" readonly>${qnaViewDetail.getQnaContent()}</textarea>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- 삭제, 수정 버튼 -->
				<div class="Button-OuterContainer1">
					<div class="Button-InnerContainer1">
						<button class="Delete1" type="button"
							onclick="location.href='${pageContext.request.contextPath}/community/qnaList/qnaListOk.qna'">
							<span>뒤로가기</span>
						</button>
						<button class="Edit1" type="button"
							onclick="location.href='${pageContext.request.contextPath}/community/qnaEdit/qnaEdit.qna?listNum=${listNum}'">
							<span>수정</span>
						</button>
					</div>
				</div>
			</form>
		</section>

		<!-- 아래쪽 컨테이너 -->
		<section class="Down-Container">
			<!-- 조회수, 댓글 아이콘 -->
			<div class="Icon-OuterContainer">
				<div class="Icon-InnerContainer">
					<div class="Icon-Margin">
						<img class="Icon-Size1"
							src="${pageContext.request.contextPath}/resource/img/view.png"
							alt="조회수" />
						<div class="Font-Size">${qnaViewDetail.getQnaViewCnt()}</div>
					</div>
					<div class="Icon-Margin">
						<img class="Icon-Size2"
							src="${pageContext.request.contextPath}/resource/img/comment.png"
							alt="댓글수" />
						<div class="Font-Size Font-Size2">${qnaViewDetail.getQnaCommentCnt()}</div>
					</div>
				</div>
			</div>
			
			<!-- 댓글 -->
			<div class="Review-OuterContainer">
				
					<c:choose>
						<c:when test="${not empty qnaReview}">
							<c:forEach var="review" items="${qnaReview}">
<form action="${pageContext.request.contextPath}/community/qnaViewDetail/qnaViewDetailOk.qna?listNum=${listNum}&page=${currentPage}&reviewNum=${review.getCommentNum()}" method="get">

								<div class="Review-InnerContainer">
									<hr />
									<div class="Review-Align">
										<div>
											<span class="Text-Color-Gray">${review.getUserNickname()}</span>
											<span class="Text-Style1">${review.getCommentContent()}</span>
										</div>
										<div>
											<button class="Delete2">삭제</button>
										</div>
									</div>
									<hr />
								</div>

							</c:forEach>
						</c:when>
						<c:otherwise>
							<tr class="notList-box">
								<td colspan="5" align="center" class="noList">등록된 댓글이 없습니다</td>
							</tr>
						</c:otherwise>
					</c:choose>

				</form>
			</div>


			<!-- 페이징  -->
			<div class="page_wrap">
				<div class="page_nation">

					<a class="arrow prev"
						href="${pageContext.request.contextPath}/community/qnaViewDetail/qnaViewDetailOk.qna?listNum=${listNum}&page=${currentPage-1}">&lt;</a>
					<c:forEach var="page" items="${pageList}">

						<c:if test="${ currentPage == page }">
							<a class="active"
								href="${pageContext.request.contextPath}/community/qnaViewDetail/qnaViewDetailOk.qna?listNum=${listNum}&page=${page}">
								<c:out value="${page}" />
							</a>
						</c:if>
						<c:if test="${ currentPage != page }">
							<a
								href="${pageContext.request.contextPath}/community/qnaViewDetail/qnaViewDetailOk.qna?listNum=${listNum}&page=${page}">
								<c:out value="${page}" />
							</a>
						</c:if>
					</c:forEach>
					<a class="arrow next"
						href="${pageContext.request.contextPath}/community/qnaViewDetail/qnaViewDetailOk.qna?listNum=${listNum}&page=${currentPage+1}">&gt;</a>

				</div>
			</div>

			<!-- 댓글작성란, 댓글등록 버튼 -->
			<div class="ReviewWrite-Container">
				<form class="ReviewWrite-Container-form"
					action="${pageContext.request.contextPath}/community/qnaViewDetail/qnaViewDetailOk.qna?listNum=${listNum}&page=${currentPage}"
					method="get">
					<div class="ReviewWrite-Container-box1">
						<textarea class="ReviewWrite-Container-form-text"
							placeholder="댓글을 입력하세요(50자 이내)" name="commentWrite"></textarea>
					</div>
					<button class="Review-Button">댓글 달기</button>
				</form>
			</div>
		</section>
	</div>
	<%@ include file="../../../footer.jsp"%>
</body>
</html>
