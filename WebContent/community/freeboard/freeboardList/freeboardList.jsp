<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>자유게시판</title>
    <link rel="stylesheet" href="../../../resource/css/freeboardList.css" />
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
    <div class="container">
      <!-- 좌측 어사이드 -->
      <aside>
        <div class="aside-spacing"></div>
        <section class="section-freeboard">
          <a class="freeboard-a" href="${pageContext.request.contextPath}/community/freeboard/freeboardList/freeboardListOk.jsp">
            <div class="freeboard">자유게시판</div>
          </a>
        </section>
        <section class="section-qna">
          <a class="qna-a" href="../../qna/qnaList/qnaListLogin.jsp">
            <div class="qna">Q&A</div>
          </a>
        </section>
        <section class="section-notice">
          <a class="notice-a" href="../../notice/noticeList/noticeList.jsp">
            <div class="notice">공지사항</div>
          </a>
        </section>
      </aside>

      <!-- 우측 게시글 목록 창 -->
      <main>
        <!-- 카테고리 & 글쓰기 창 -->
        <section class="section-top">
          <!-- 카테고리명 - 자유게시판 -->
          <div class="section-top-category-name">
            <div class="section-top-category-name-text1">커뮤니티</div>
            <div class="section-top-category-name-text2">자유게시판 - 게시글 목록</div>
          </div>
          <!-- 글쓰기버튼 -->
          <div class="section-top-write">
            <a class="section-top-write-a" href="../freeboardWrite/freeboardWrite.jsp">
                <button class="button-write">글쓰기</button>
            </a>
          </div>
        </section>

         <!-- 검색바 -->
        <section class="section-search">
          <form class="search-form" action="${pageContext.request.contextPath}/community/freeboard/freeboardWrite/freeboardWriteOk.fr">
            <div class="search-inner">
              <input class="search-bar" type="text">
              <button class="search-button" type="submit" 
              onclick = "location.href = '${pageContext.request.contextPath}/community/freeboard/freeboardList/freeboardList.fr'"
              >검색</button>
            </div>
          </form>
        </section>

        <!-- 게시글 목록 -->
        <section class="section-board">
		<c:choose>
			<c:when test = "${not empty freeboardList}">
				<c:forEach var = "freeboard" items = "${freeboardList}">
         <!-- @@아우터박스 -->
         <input type = "hidden" value = "${freeboard.freeboardNum}"/>
          <div class="board-outer-box">
            <a class="board-inner-box" href="${pageContext.request.contextPath}/community/freeboard/freeboardViewDetail/freeboardViewDetail.fr?freeboardNum=${freeboard.freeboardNum}">
              <!-- 이너박스 상단 -->
              <div class="board-inner-box-title">
                <div class="board-inner-box-title-text">
                  ${freeboard.freeboardTitle}
                </div>
              </div>
              <!-- 이너박스 중단 -->
              <div class="board-inner-box-content">
                <div class="board-inner-box-content-text">
                  ${freeboard.freeboardContent}
                </div>
              </div>
              <!-- 이너박스 하단 -->
              <div class="board-inner-box-view-comment">
                <div class="comment-view">
                  <img class="comment-view-img" src="../../../resource/img/view.png" alt="" />
                </div>
                <div class="comment-view-cnt">
                  <div class="comment-view-cnt-text">${freeboard.freeboardViewCnt}</div>
                </div>
                <div class="comment-comment">
                  <img class="comment-comment-img" src="../../../resource/img/comment.png" alt="" />
                </div>
                <div class="comment-comment-cnt">
                  <div class="comment-comment-cnt-text">${freeboard.freeboardCommentCnt}</div>
                </div>
                <div class="comment-written-date">
                  <div class="comment-written-date-text">${freeboard.freeboardWriteDate}</div>
                </div>
              </div>
            </a>
          </div>
          	</c:forEach>
          	</c:when>
          	<c:otherwise>
          		<tr>
          			<td colspan = "5" align = "center" > 등록된 게시물이 없습니다 </td>
          		</tr>
          	</c:otherwise>
          </c:choose>
        </section>
		</form>
        <!-- 페이징  -->
			<div class="page_wrap">
				<div class="page_nation">

					<a class="arrow prev"
						href="${pageContext.request.contextPath}/community/freeboard/freeboardList/freeboardListOk.fr?page=${currentPage-1}">&lt;</a>
					<c:forEach var="page" items="${pageList}">

						<c:if test="${ currentPage == page }">
							<a class="active"
								href="${pageContext.request.contextPath}/community/freeboard/freeboardList/freeboardListOk.fr?page=${page}">
								<c:out value="${page}" />
							</a>
						</c:if>
						<c:if test="${ currentPage != page }">
							<a
								href="${pageContext.request.contextPath}/community/freeboard/freeboardList/freeboardListOk.fr?page=${page}">
								<c:out value="${page}" />
							</a>
						</c:if>
					</c:forEach>
					<a class="arrow next"
						href="${pageContext.request.contextPath}/community/freeboard/freeboardList/freeboardListOk.fr?page=${currentPage+1}">&gt;</a>

				</div>
			</div>
       
      </main>
    </div>
    <%@ include file="../../../footer.jsp" %>
  </body>
</html>