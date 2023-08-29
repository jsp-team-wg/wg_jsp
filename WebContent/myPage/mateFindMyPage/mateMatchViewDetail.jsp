<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>메이트 찾기 상세페이지</title>
    <link rel="stylesheet" href="../../resource/css/mateMatchViewDetail.css" />
  </head>
  <%@ include file="../../headerLogin.jsp" %>
  <body>
    <main>
      <!-- 메이트 찾기 상세페이지 창 -->
      <section class="mate-detail-top">
        <div class="mate-detail-title-box">
          <div class="mate-detail-title-text">메이트 찾기</div>
          <div class="mate-detail-subtitle-text">메이트 찾기 - 상세페이지</div>
        </div>
        <br />
      </section>
      <!-- 모집 완료 버튼 -->
      <section class="mate-detail-button2">
        <form class="form-button2">
          <button
            type="button"
            class="mate-detail-form-button3"
            onclick="location.href='../../mateMatch/mateMatchList/mateMatchList.jsp'"
          >
            <span class="mate-detail-form-button-text">모집완료</span>
          </button>
          <span class="mate-detail-form-button-text2"
            >※ 모집 완료 클릭 시 되돌릴 수 없습니다</span
          >
        </form>
      </section>
      <!--글 쓰기 제목-->
      <section class="mate-detail-bigform">
        <div class="mate-detail-form-title-text">
          <h1>호원 실내 테니스장</h1>
        </div>
        <hr />
        <!-- 작성자 프로필 섹션 -->
        <section class="mate-detail-profile">
          <div class="profile-nickname-box">
            <span class="profile-nickname-text">우진공주</span>
          </div>
          <div class="profile-gender-box">
            성별
            <span class="profile-gender-text">남성</span>
          </div>
          <div class="profile-ntrp-box">
            NTRP
            <span class="profile-ntrp-text">1.5</span>
          </div>
          <div class="profile-oldpower-box">
            구력
            <span class="profile-oldpower-text">1</span>
          </div>
          <div class="profile-oldpower-box2">
            <span class="profile-oldpower-text">년</span>
          </div>
        </section>
        <hr />
        <!-- 모집 요구 정보 섹션 -->
        <section class="mate-detail-form">
          <div clss="date-box">
            일시
            <span class="date-text">2023.08.11</span>
            <span class="date-text">18:00</span>
            ~
            <span class="date-text">20:00</span>
          </div>
          <div class="game-categori-box">
            모집유형
            <span class="game-categori-text">랠리</span>
          </div>
          <div class="oldpower-box">
            모집구력
            <span class="oldpower-text">5년</span>
            <span class="oldpower-text">이상</span>
          </div>
          <div class="ntrp-box">
            NTRP
            <span clas="ntrp-text">2.5</span>
          </div>
          <div class="member-box">
            모집인원
            <div class="member-box-gender-m">
              남자
              <span class="member-box-gender-m-text">1</span>
            </div>
            <div class="member-box-gender-f">
              여자
              <span class="member-box-genger-f-text">2</span>
            </div>
          </div>
          <div class="comment-bigbox">
            <div class="comment-smallbox">
              <div class="comment-text">내용</div>

              <div class="comment-text-box">
                <textarea class="commentbox-text" readonly>함께 즐기실 분들 환영입니다!</textarea>
              </div>
            </div>
          </div>
        </section>
      </section>
      <!-- 삭제, 수정 버튼 -->
      <section class="mate-detail-button">
        <form class="form-button">
          <button
            type="button"
            class="mate-detail-form-button1"
            onclick="location.href='../../mateMatch/mateMatchList/mateMatchList.jsp'"
          >
            <span>삭제</span>
          </button>
        </form>
        <form class="form-button">
          <!-- 링크 연결 안 됨 -->
          <button
            type="button"
            class="mate-detail-form-button2"
            onclick="location.href='../../mateMatch/mateMatchEdit/mateMatchEdit.jsp'"
          >
            <span>수정</span>
          </button>
        </form>
      </section>
      <br />

      <!-- 댓글 섹션 -->
      <section class="mate-detail-form-comment2">
        <!-- 댓글 아이콘, 수 -->
        <div class="comment-icon-box">
          <!-- <span class = "comment-title-text">댓글 목록 </span>  -->
          <img class="comment-icon" src="../../resource/img/comment.png" alt="comment-icon" />
          <div class="comment-num">
            <span class="comment-num-text">15</span>
          </div>
        </div>
        <!-- 댓글 목록 -->
        <div class="comment2-box">
          <div class="comment2-nickname">
            <span class="comment2-text">길동님</span>
          </div>
          <div class="comment2-list-box">
            <span class="comment2-list-text">hong@123.com으로 연락주세요</span>
          </div>
          <div class="modify-button-box">
            <button class="modify-button">수정</button>
          </div>
          <div class="delete-button-box">
            <button class="delete-button">삭제</button>
          </div>
          <br />
          <hr />

          <div class="comment2-nickname">
            <span class="comment2-text">길동님</span>
          </div>
          <div class="comment2-list-box">
            <span class="comment2-list-text">hong@123.com으로 연락주세요</span>
          </div>
          <div class="modify-button-box">
            <button class="modify-button">수정</button>
          </div>
          <div class="delete-button-box">
            <button class="delete-button">삭제</button>
          </div>
          <br />
          <hr />

          <div class="comment2-nickname">
            <span class="comment2-text">길동님</span>
          </div>
          <div class="comment2-list-box">
            <span class="comment2-list-text">hong@123.com으로 연락주세요</span>
          </div>
          <div class="modify-button-box">
            <button class="modify-button">수정</button>
          </div>
          <div class="delete-button-box">
            <button class="delete-button">삭제</button>
          </div>
        </div>
        <hr />

        <!-- 페이징 -->
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
        <!-- 댓글달기 -->
        <div class="ReviewWrite-Container">
          <form class="ReviewWrite-Container-form" action="" method="get">
            <div class="ReviewWrite-Container-box1">
              <textarea
                class="ReviewWrite-Container-form-text"
                placeholder="댓글을 입력하세요(50자 이내)"
              ></textarea>
            </div>
            <button class="Review-Button">댓글 달기</button>
          </form>
        </div>
      </section>
    </main>
  </body>
  <%@ include file="../../footer.jsp" %>
</html>
