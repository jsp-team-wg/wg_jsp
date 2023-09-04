<%@ page language="java" contentType="text/html; charset=UTF-8"
<<<<<<< HEAD
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>공지사항 상세보기</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resource/css/noticeViewDetail.css" />
<!-- 구글 폰트 -->
<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
<link
	href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@800&display=swap"
	rel="stylesheet" />
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
	<!-- 커뮤니티(공지사항) 상세보기 전체 영역 -->
	<div class="Area">
		<!-- 위쪽 컨테이너 -->
		<section class="MainText-Container">
			<div class="MainText-Container-text1">커뮤니티</div>
			<div class="MainText-Container-text2">공지사항 - 상세페이지</div>
		</section>

		<section class="Up-Container">
			<form action="" method="get">
				<div class="Content-OuterContainer1 Shadow">
					<div class="Content-InnerContainer1">
						<!-- 제목 -->
						<div class="Title-Container">
							<span>${noticeViewDetail.getNoticeTitle()}</span>
						</div>
						<hr />

						<!-- 작성자 -->
						<div class="Author-Container">
							<span>관리자</span>
						</div>
						<hr />

						<!-- 게시일 -->
						<div class="PostDate-Container">
							<span class="Text-Color-Gray">게시일</span> <span
								class="Text-Style1">${noticeViewDetail.getNoticeWritedate()}</span>
						</div>
						<!-- 코멘트 -->
						<div class="Comment-OuterContainer">
							<div class="Comment-InnerContainer">
								<span class="Text-Color-Gray">내용</span>
							</div>
							<div class="Text-Style1 Input-Style2 content-Size1">
								<textarea class="content-box" readonly>${noticeViewDetail.getNoticeContent()}</textarea>
							</div>
						</div>
					</div>
				</div>



				<!-- 삭제, 수정 버튼 -->
				<div class="Button-OuterContainer1">
					<div class="Button-InnerContainer1">
						<button class="Delete1" type="button"
							onclick="location.href='${pageContext.request.contextPath}/community/notice/noticeList/noticeList.jsp'">
							<span>삭제</span>
						</button>
						<button class="Edit1" type="button"
							onclick="location.href='${pageContext.request.contextPath}/admin/adminNotice/adminNoticeEdit/adminNoticeEdit.jsp'">
							<span>수정</span>
						</button>
					</div>
				</div>
			</form>
		</section>
	</div>
	<%@ include file="../../../footer.jsp"%>
</body>
=======
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>공지사항 상세보기</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resource/css/noticeViewDetail.css" />
    <!-- 구글 폰트 -->
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link
      href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@800&display=swap"
      rel="stylesheet"
    />
  </head>
  <body>
  <%@ include file="../../../header.jsp" %>
    <!-- 커뮤니티(공지사항) 상세보기 전체 영역 -->
    <div class="Area">
      <!-- 위쪽 컨테이너 -->
      <section class="MainText-Container">
        <div class="MainText-Container-text1">커뮤니티</div>
        <div class="MainText-Container-text2">공지사항 - 상세페이지
        </div>
      </section>
      <section class="Up-Container">
        
          <div class="Content-OuterContainer1 Shadow">
            <div class="Content-InnerContainer1">
              <!-- 제목 -->
              <div class="Title-Container">
                <span>
                <c:out value="${noticeRead.getNoticeTitle()}"></c:out>
                </span>
              </div>
              <hr />
              <!-- 작성자 -->
              <div class="Author-Container">
                <span>관리자</span>
                <span class="Text-Style1 man">남성</span>
                <!-- <span class="ntrp">NTRP${notice.getNoticeNum()}</span>
                <span class="ntrp-num">1.5${notice.getNoticeNum()}</span>
                <span class="exp">구력</span>
                <span class="exp-year">1</span>
                <span class="year">년</span> -->
              </div>
              <hr />
              <input type="hidden"  value="${noticeRead.getNoticeNum()}">
              <!-- 게시일 -->
              <div class="PostDate-Container">
                <span class="Text-Color-Gray">게시일</span>
                <span class="Text-Style1">${noticeRead.getNoticeWriteDate()}
                
                </span>
              </div>
              <!-- 코멘트 -->
              <div class="Comment-OuterContainer">
                <div class="Comment-InnerContainer">
                  <div>
                    <span class="Text-Color-Gray">내용</span>
                  </div>
                  <div class="Text-Style1 Input-Style2 content-Size1">
                    <textarea class="content-box" readonly
                      ><c:out value="${noticeRead.getNoticeContent()}"></c:out></textarea>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <!-- 삭제, 수정 버튼 -->
          <div class="Button-OuterContainer1">
            <div class="Button-InnerContainer1">
							<button class="Delete1" type="button"
								onclick="location.href='${pageContext.request.contextPath}/community/notice/noticeViewDetail/noticeViewDetailDel.ad?noticeNum=${noticeRead.getNoticeNum()}'"
								><span>삭제</span>
							</button>
						
              <button
                class="Edit1"
                type="button"
                onclick="location.href='${pageContext.request.contextPath}/community/notice/noticeViewDetail/noticeViewDetailEdit.ad?noticeNum=${noticeRead.getNoticeNum()}'"
              >
                <span>수정</span>
              </button>
            </div>
          </div>
        
      </section>
    </div>
    <%@ include file="../../../footer.jsp" %>
  </body>
>>>>>>> ljj
</html>
