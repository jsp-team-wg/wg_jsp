<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>마이페이지 회원정보 수정</title>
    <link rel = "stylesheet" href = "../../resource/css/mateFindMyPage.css">
    
</head>
<body>
	<%@ include file="../../headerLogin.jsp" %>
  	<main>
    <aside>
        <section  class = "aside-box">
        <div class = "aside-member-box hover1">
            <div class = "aside-member-text-box">
                <a href = "../../myPage/mateMemberEditMyPage/mateMatchMyPageMemberEdit.jsp">
                <span class = "aside-member-text white">회원정보 수정</span>
                </a>
            </div>
        </div>
        <div class = "aside-matematch-box hover1">
          <div class = "aside-matematch-text-box">
              <a href = "../../myPage/mateFindMyPage/mateFindMyPage.jsp">
              <span class = "aside-matematch-text white">메이트 찾기</span>
              </a>
          </div>
        </div>
        <div class = "aside-qna-box hover1">
          <div class = "aside-qna-text-box">
              <a href = "../../myPage/mateMatchQnaMyPage/mateMatchQnaMyPage.jsp">
              <span class = "aside-qna-text white">Q&A</span>
              </a>
          </div>
        </div>
      </section>
      </aside>

      <!-- 회원정보 수정 -->
      <section class = "accountmodify-form">
         <!-- 아우터 박스 -->
         <div class="board-outer-box">
            <!-- 이너 박스 -->
            <a class="board-inner-box" href="../../mateMatch/mateMatchViewDetail/mateMatchViewDetail.jsp">
              <!-- 이너박스 상단 -->
              <div class="board-inner-box-top">
                <!-- 코트명 -->
                <div class="court-name">
                  <div class="court-name-text">호원실내테니스장</div>
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
                  <div class="comment-num-text">15</div>
                </div>
              </div>
  
              <!-- 이너박스 하단 -->
              <div class="board-inner-box-bottom">
                <div class="date">
                  <div class="date-text">08.11</div>
                </div>
                <div class="day">
                  <div class="day-text">금</div>
                </div>
                <div class="time-start">
                  <div class="time-start-text">18:00</div>
                </div>
                <div class="dash">
                  <div class="dash-text">-</div>
                </div>
                <div class="time-end">
                  <div class="time-end-text">20:00</div>
                </div>
                <div class="game-type">
                  <div class="game-type-text">혼복</div>
                </div>
                <div class="man">
                  <div class="man-text">남</div>
                </div>
                <div class="man-num">
                  <div class="man-num-text">1</div>
                </div>
                <div class="woman">
                  <div class="woman-text">여</div>
                </div>
                <div class="woman-num">
                  <div class="woman-num-text">2</div>
                </div>
                <div class="exp">
                  <div class="exp-text">4</div>
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
          <div class="board-outer-box">
            <!-- 이너 박스 -->
            <a class="board-inner-box" href="../../mateMatch/mateMatchViewDetail/mateMatchViewDetail.jsp">
              <!-- 이너박스 상단 -->
              <div class="board-inner-box-top">
                <!-- 코트명 -->
                <div class="court-name">
                  <div class="court-name-text">호원실내테니스장</div>
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
                  <div class="comment-num-text">15</div>
                </div>
              </div>
  
              <!-- 이너박스 하단 -->
              <div class="board-inner-box-bottom">
                <div class="date">
                  <div class="date-text">08.11</div>
                </div>
                <div class="day">
                  <div class="day-text">금</div>
                </div>
                <div class="time-start">
                  <div class="time-start-text">18:00</div>
                </div>
                <div class="dash">
                  <div class="dash-text">-</div>
                </div>
                <div class="time-end">
                  <div class="time-end-text">20:00</div>
                </div>
                <div class="game-type">
                  <div class="game-type-text">혼복</div>
                </div>
                <div class="man">
                  <div class="man-text">남</div>
                </div>
                <div class="man-num">
                  <div class="man-num-text">1</div>
                </div>
                <div class="woman">
                  <div class="woman-text">여</div>
                </div>
                <div class="woman-num">
                  <div class="woman-num-text">2</div>
                </div>
                <div class="exp">
                  <div class="exp-text">4</div>
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
          <div class="board-outer-box">
            <!-- 이너 박스 -->
            <a class="board-inner-box" href="../../mateMatch/mateMatchViewDetail/mateMatchViewDetail.jsp">
              <!-- 이너박스 상단 -->
              <div class="board-inner-box-top">
                <!-- 코트명 -->
                <div class="court-name">
                  <div class="court-name-text">호원실내테니스장</div>
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
                  <div class="comment-num-text">15</div>
                </div>
              </div>
  
              <!-- 이너박스 하단 -->
              <div class="board-inner-box-bottom">
                <div class="date">
                  <div class="date-text">08.11</div>
                </div>
                <div class="day">
                  <div class="day-text">금</div>
                </div>
                <div class="time-start">
                  <div class="time-start-text">18:00</div>
                </div>
                <div class="dash">
                  <div class="dash-text">-</div>
                </div>
                <div class="time-end">
                  <div class="time-end-text">20:00</div>
                </div>
                <div class="game-type">
                  <div class="game-type-text">혼복</div>
                </div>
                <div class="man">
                  <div class="man-text">남</div>
                </div>
                <div class="man-num">
                  <div class="man-num-text">1</div>
                </div>
                <div class="woman">
                  <div class="woman-text">여</div>
                </div>
                <div class="woman-num">
                  <div class="woman-num-text">2</div>
                </div>
                <div class="exp">
                  <div class="exp-text">4</div>
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
          <div class="board-outer-box">
            <!-- 이너 박스 -->
            <a class="board-inner-box" href="../../mateMatch/mateMatchViewDetail/mateMatchViewDetail.jsp">
              <!-- 이너박스 상단 -->
              <div class="board-inner-box-top">
                <!-- 코트명 -->
                <div class="court-name">
                  <div class="court-name-text">호원실내테니스장</div>
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
                  <div class="comment-num-text">15</div>
                </div>
              </div>
  
              <!-- 이너박스 하단 -->
              <div class="board-inner-box-bottom">
                <div class="date">
                  <div class="date-text">08.11</div>
                </div>
                <div class="day">
                  <div class="day-text">금</div>
                </div>
                <div class="time-start">
                  <div class="time-start-text">18:00</div>
                </div>
                <div class="dash">
                  <div class="dash-text">-</div>
                </div>
                <div class="time-end">
                  <div class="time-end-text">20:00</div>
                </div>
                <div class="game-type">
                  <div class="game-type-text">혼복</div>
                </div>
                <div class="man">
                  <div class="man-text">남</div>
                </div>
                <div class="man-num">
                  <div class="man-num-text">1</div>
                </div>
                <div class="woman">
                  <div class="woman-text">여</div>
                </div>
                <div class="woman-num">
                  <div class="woman-num-text">2</div>
                </div>
                <div class="exp">
                  <div class="exp-text">4</div>
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
          <div class="board-outer-box">
            <!-- 이너 박스 -->
            <a class="board-inner-box" href="../../mateMatch/mateMatchViewDetail/mateMatchViewDetail.jsp">
              <!-- 이너박스 상단 -->
              <div class="board-inner-box-top">
                <!-- 코트명 -->
                <div class="court-name">
                  <div class="court-name-text">호원실내테니스장</div>
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
                  <div class="comment-num-text">15</div>
                </div>
              </div>
  
              <!-- 이너박스 하단 -->
              <div class="board-inner-box-bottom">
                <div class="date">
                  <div class="date-text">08.11</div>
                </div>
                <div class="day">
                  <div class="day-text">금</div>
                </div>
                <div class="time-start">
                  <div class="time-start-text">18:00</div>
                </div>
                <div class="dash">
                  <div class="dash-text">-</div>
                </div>
                <div class="time-end">
                  <div class="time-end-text">20:00</div>
                </div>
                <div class="game-type">
                  <div class="game-type-text">혼복</div>
                </div>
                <div class="man">
                  <div class="man-text">남</div>
                </div>
                <div class="man-num">
                  <div class="man-num-text">1</div>
                </div>
                <div class="woman">
                  <div class="woman-text">여</div>
                </div>
                <div class="woman-num">
                  <div class="woman-num-text">2</div>
                </div>
                <div class="exp">
                  <div class="exp-text">4</div>
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
          <div class="board-outer-box">
            <!-- 이너 박스 -->
            <a class="board-inner-box" href="../../mateMatch/mateMatchViewDetail/mateMatchViewDetail.jsp">
              <!-- 이너박스 상단 -->
              <div class="board-inner-box-top">
                <!-- 코트명 -->
                <div class="court-name">
                  <div class="court-name-text">호원실내테니스장</div>
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
                  <div class="comment-num-text">15</div>
                </div>
              </div>
  
              <!-- 이너박스 하단 -->
              <div class="board-inner-box-bottom">
                <div class="date">
                  <div class="date-text">08.11</div>
                </div>
                <div class="day">
                  <div class="day-text">금</div>
                </div>
                <div class="time-start">
                  <div class="time-start-text">18:00</div>
                </div>
                <div class="dash">
                  <div class="dash-text">-</div>
                </div>
                <div class="time-end">
                  <div class="time-end-text">20:00</div>
                </div>
                <div class="game-type">
                  <div class="game-type-text">혼복</div>
                </div>
                <div class="man">
                  <div class="man-text">남</div>
                </div>
                <div class="man-num">
                  <div class="man-num-text">1</div>
                </div>
                <div class="woman">
                  <div class="woman-text">여</div>
                </div>
                <div class="woman-num">
                  <div class="woman-num-text">2</div>
                </div>
                <div class="exp">
                  <div class="exp-text">4</div>
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
      </section>
    </main>
    <%@ include file="../../footer.jsp" %>
</body>
</html>