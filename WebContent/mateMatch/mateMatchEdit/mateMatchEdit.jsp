<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="../../resource/css/mateMatchEdit.css" />
    <script defer src="../../resource/js/mateMatchEdit.js"></script>
    <title>메이트찾기 글수정</title>
  </head>
  <%@ include file="../../headerLogin.jsp" %>
  <body>
    <main>
      <form action="">
        <!-- 카테고리 섹션 -->
        <section class="section-category">
          <div class="category-name">메이트찾기</div>
          <div class="category-name2">메이트찾기 - 글수정</div>
        </section>
        <!-- 내용입력 섹션 -->
        <section class="section-info">
          <!-- 코트이름 -->
          <div class="court-name">
            <div class="court-name-text">코트장 이름</div>
            <div class="court-name-input">
              <input
                class="court-name-input-text"
                value="" type="text"
                placeholder="코트 이름 입력" disabled
              />
            </div>
          </div>

          <!-- 코트주소 -->
          <div class="court-address-input">
            <div class="court-address-input-box1">
              <input
                class="court-address-input-address"
                type="text" value=""
                placeholder="테니스장 주소" disabled
              />
            </div>
            <div class="court-address-input-box2">
              <button class="court-address-input-box2-button" type=""
              id="openPopup">
                주소찾기
              </button>
            </div>
          </div>
          <!-- 팝업 내용을 담을 공간 -->
          <div id="popupContainer" style="display: none;"></div>

          <!-- 날짜 -->
          <div class="date">
            <div class="date-text">날짜</div>
            <div class="date-calender">
              <input class="date-calendar-input" type="date" />
            </div>
          </div>

          <!-- 시간 -->
          <div class="time">
            <div class="time-box1">시간</div>
            <div class="time-box2">
              <input
                class="time-start-input"
                type="time"
                placeholder="시작 시간"
              />
              <div class="si"></div>
              <div class="wave">~</div>
              <input
                class="time-end-input"
                type="time"
                placeholder="종료 시간"
              />
              <div class="si"></div>
            </div>
          </div>

          <!-- 구력 -->
          <div class="exp">
            <div class="exp-text">구력</div>
            <div class="exp-box">
              <input class="exp-input" type="text" placeholder="숫자만 입력" />
              <div class="exp-spacing"></div>
              <div class="exp-dropdown">
                <select class="exp-dropdown-select" name="" id="">
                  <option value="null">선택</option>
                  <option value="down">년 이하</option>
                  <option value="up">년 이상</option>
                  <option value="around">년 전후</option>
                </select>
              </div>
            </div>
          </div>

          <!-- ntrp -->
          <div class="ntrp">
            <div class="ntrp-text">NTRP(선택)</div>
            <div class="ntrp-dropbox">
              <select class="ntrp-select" name="" id="">
                <option value="null">선택</option>
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
          </div>

          <!-- 게임유형 -->
          <div class="game-type">
            <div class="game-type-text">게임유형</div>
            <div class="game-type-dropbox">
              <select class="game-type-select" name="" id="">
                <option value="null">선택</option>
                <option value="single">단식</option>
                <option value="mix-double">혼복</option>
                <option value="man-double">남복</option>
                <option value="woman-double">여복</option>
                <option value="rally">랠리</option>
              </select>
            </div>
          </div>

          <!-- 모집인원 -->
          <div class="recruit">
            <div class="recruit-text">모집 인원</div>
            <div class="recruit-input">
              <div class="recruit-man">남</div>
              <select class="recruit-man-select" name="" id="">
                <option value="null">선택</option>
                <option value="0">0명</option>
                <option value="1">1명</option>
                <option value="2">2명</option>
                <option value="3">3명</option>
                <option value="4">4명</option>
                <option value="5">5명</option>
                <option value="6">6명</option>
                <option value="7">7명</option>
                <option value="8">8명</option>
                <option value="9">9명</option>
                <option value="10">10명</option>
              </select>
              <div class="recruit-spacing"></div>
              <div class="recruit-woman">여</div>
              <select class="recruit-woman-select" name="" id="">
                <option value="null">선택</option>
                <option value="0">0명</option>
                <option value="0">1명</option>
                <option value="1">2명</option>
                <option value="2">3명</option>
                <option value="3">4명</option>
                <option value="4">5명</option>
                <option value="5">6명</option>
                <option value="6">7명</option>
                <option value="7">8명</option>
                <option value="8">9명</option>
                <option value="9">11명</option>
                <option value="10">12명</option>
              </select>
            </div>
          </div>

          <!-- 내용 -->
          <div class="content">
            <div class="content-text">내용</div>

            <div class="content-box">
              <div class="content-inner-box">
                <textarea
                  class="content-write"
                  class="content-inner-box"
                  placeholder="내용을 입력하세요(3,000자 이내)"
                ></textarea>
              </div>
            </div>
          </div>
        </section>

        <!-- 버튼 섹션 -->
        <section class="section-button">
          <a class="button-prev-a" href="../../mateMatch/mateMatchViewDetail/mateMatchViewDetail.jsp"
            ><button class="button-prev">뒤로가기</button></a
          >
          <button class="button-submit" type="submit">작성완료</button>
        </section>
      </form>
    </main>
  </body>
  <%@ include file="../../footer.jsp" %>
</html>