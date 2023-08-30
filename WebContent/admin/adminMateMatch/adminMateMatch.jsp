<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    <html lang="ko">
      <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>메이트찾기 관리</title>
        <link rel="stylesheet" href="../../resource/css/adminMateMatch.css" />
      </head>
      <body>
        
        <div class="container">
          <!-- 좌측 어사이드 -->
          <aside>
            <div class="aside-spacing"></div>
            <section class="member">
              <a class="member-a" href="${pageContext.request.contextPath}/admin/adminMember/adminMember.jsp">
                <div class="member-text">회원관리</div>
              </a>
            </section>
            <section class="board-mate">
              <a class="board-mate-a" href="${pageContext.request.contextPath}/admin/adminMateMatch/adminMateMatch.jsp">
                <div class="board-mate-text">메이트찾기 관리</div>
              </a>
            </section>
            <section class="board-free">
              <a class="board-free-a" href="${pageContext.request.contextPath}/admin/adminFreeBoard/adminFreeBoard.jsp">
                <div class="board-free-text">자유게시판 관리</div>
              </a>
            </section>
            <section class="board-qna">
              <a class="board-qna-a" href="${pageContext.request.contextPath}/admin/adminQna/adminQna.jsp">
                <div class="board-qna-text">Q&A 관리</div>
              </a>
            </section>
            <section class="board-notification">
              <a class="board-notification-a" href="${pageContext.request.contextPath}/admin/adminNotice/adminNoticeList/adminNoticeList.jsp">
                <div class="board-notification-text">공지사항 관리</div>
              </a>
            </section>
          </aside>
    
          <!-- 우측 게시글 목록 창 -->
          <main>
            <!-- 메이트찾기 & 글쓰기 창 -->
            <section class="section-top">
              <!-- 카테고리명 -메이트찾기 -->
              <div class="section-top-category-name">
                <div class="section-top-category-name-text1">메이트 찾기</div>
                <div class="section-top-category-name-text2">메이트 찾기 - 관리</div>
              </div>
            </section>
    
          <!-- 검색바 -->
          <section class="section-search">
            <form class="search-form" action="">
              <div class="search-inner">
                <input class="search-bar" type="text" placeholder="테니스장 이름으로 검색해주세요">
                <button class="search-button" type="submit" >검색</button>
              </div>
            </form>
          </section>
    
            <!-- 게시글 목록 -->
            <section class="section-board">
              <!-- @@아우터박스 -->
              <div class="board-outer-box">
                <a class="board-inner-box" href="${pageContext.request.contextPath}/mateMatch/mateMatchViewDetail/mateMatchViewDetail.jsp">
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
              <!-- @@아우터박스 -->
              <div class="board-outer-box">
                <a class="board-inner-box" href="${pageContext.request.contextPath}/mateMatch/mateMatchViewDetail/mateMatchViewDetail.jsp">
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
              <!-- @@아우터박스 -->
              <div class="board-outer-box">
                <a class="board-inner-box" href="${pageContext.request.contextPath}/mateMatch/mateMatchViewDetail/mateMatchViewDetail.jsp">
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
              <!-- @@아우터박스 -->
              <div class="board-outer-box">
                <a class="board-inner-box" href="${pageContext.request.contextPath}/mateMatch/mateMatchViewDetail/mateMatchViewDetail.jsp">
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
              <!-- @@아우터박스 -->
              <div class="board-outer-box">
                <a class="board-inner-box" href="${pageContext.request.contextPath}/mateMatch/mateMatchViewDetail/mateMatchViewDetail.jsp">
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
              <!-- @@아우터박스 -->
              <div class="board-outer-box">
                <a class="board-inner-box" href="${pageContext.request.contextPath}/mateMatch/mateMatchViewDetail/mateMatchViewDetail.jsp">
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
        </div>
       
      </body>
    </html>
    