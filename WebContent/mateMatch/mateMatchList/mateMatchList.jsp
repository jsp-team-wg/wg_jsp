<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>메이트찾기</title>
    <link rel="stylesheet" href="../../resource/css/mateMatchList.css" />
  </head>
  <%@ include file="../../headerLogin.jsp" %>
  <body>
    <!-- 게시글 목록 창 -->
    <main>
      <!-- 상단여백 -->
      <div class="top-spacing"></div>
      <!-- 메이트찾기 & 글쓰기 창 -->
      <section class="section-top">
        <!-- 카테고리명 -->
        <div class="section-top-category-name">
          <div class="section-top-category-name-text">메이트 찾기</div>
          <div class="section-top-category-name2-text">메이트 찾기 - 게시글 목록</div>
        </div>
        <!-- 글쓰기버튼 -->
        <div class="section-top-write">
          <a class="section-top-write-a" href="${pageContext.request.contextPath}/mateMatch/mateMatchWrite/mateMatchWrite.jsp">
            <button class="button-write">글쓰기</button>
          </a>
        </div>
      </section>

      <!-- 검색바 -->
      <section class="section-search">
        <form class="search-form" action="">
          <div class="search-inner">
            <select>
              <option value = "코트장 이름">코트장 이름</option>
            </select>
            <input class="search-bar" type="text" placeholder="  테니스장 이름 검색">
            <button class="search-button" type="submit" >검색</button>
          </div>
        </form>
      </section>

      <!-- 게시글 목록 -->
      <section class="section-board">
      <c:choose>
         <c:when test = "${not empty mateList}">
          	 <c:forEach var="mate" items="${mateList}" begin="0" end="5" >
	        <!-- 아우터 박스 -->
	        <div class="board-outer-box">
	          <!-- 이너 박스 -->
	          <a class="board-inner-box" href="../../mateMatch/mateMatchViewDetail/mateMatchViewDetail.jsp">
	            <!-- 이너박스 상단 -->
	            <div class="board-inner-box-top">
	              <!-- 코트명 -->
	              <div class="court-name">
	                <div class="court-name-text">${mate.getMateCourtname()}</div>
	              </div>
	              <!-- 모집마감 -->
	              <div class="recruit-close">
	                <div class="recruit-close-box">
	                  <div class="recruit-close-text">모집 완료</div>
	                </div>
	              </div>
	              <!-- 댓글 아이콘 -->
	              <div class="comment-icon">
	                <div class="comment-icon-img-box">
	                  <img
	                    class="comment-icon-img"
	                    src="../../resource/img/comment.png"
	                    alt="댓글아이콘"
	                  />
	                </div>
	              </div>
	              <!-- 댓글 수 -->
	              <div class="comment-num">
	                <div class="comment-num-text">${mate.getCommentCnt()}</div>
	              </div>
	            </div>
	
	            <!-- 이너박스 하단 -->
	            <div class="board-inner-box-bottom">
	              <div class="date">
	                <div class="date-text">${mate.getMateDate()}</div>
	              </div>
	              <div class="day">
	                <div class="day-text">금</div>
	              </div>
	              <div class="time-start">
	                <div class="time-start-text">${mate.getMateStarttime()}</div>
	              </div>
	              <div class="dash">
	                <div class="dash-text">-</div>
	              </div>
	              <div class="time-end">
	                <div class="time-end-text">${mate.getMateEndtime()}</div>
	              </div>
	              <div class="game-type">
	                <div class="game-type-text">${mate.getMateGametype()}</div>
	              </div>
	              <div class="man">
	                <div class="man-text">남</div>
	              </div>
	              <div class="man-num">
	                <div class="man-num-text">${mate.getMateMcount()}</div>
	              </div>
	              <div class="woman">
	                <div class="woman-text">여</div>
	              </div>
	              <div class="woman-num">
	                <div class="woman-num-text">${mate.getMateWcount()}</div>
	              </div>
	              <div class="exp">
	                <div class="exp-text">${mate.getMateExp()}</div>
	              </div>
	              <div class="year">
	                <div class="year-text">년</div>
	              </div>
	              <div class="more-less">
	                <div class="more-less-text">이하</div>
	              </div>
	            </div>
	          </a>
	        </div>
        </c:forEach>
         </c:when>
          <c:otherwise>
         		<div> 등록된 게시물이 없습니다 </div>
          	</c:otherwise>
          </c:choose>
      </section>
      
       <!-- 페이징  -->
       <div class="page_wrap">
        <div class="page_nation">
           <a class="arrow pprev" href="#">&lt;&lt;</a>
           <a class="arrow prev" href="#">&lt;</a>
           <a href="#" class="active">1</a>
           <a href="#">2</a>
           <a href="#">3</a>
           <a href="#">4</a>
           <a href="#">5</a>
           <a href="#">6</a>
           <a href="#">7</a>
           <a href="#">8</a>
           <a href="#">9</a>
           <a href="#">10</a>
           <a class="arrow next" href="#">&gt;</a>
           <a class="arrow nnext" href="#">&gt;&gt;</a>
        </div>
     </div>
    </main>
  </body>
  <%@ include file="../../footer.jsp" %>
</html>