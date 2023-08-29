<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>메인페이지(로그인후 화면)</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resource/css/mainPage.css">
    <script defer src="${pageContext.request.contextPath}/resource/js/mainPage.js"></script>
    <script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=f49922a8774592c118e15c56666d5011&libraries=services"></script>
    <script src="https://code.jquery.com/jquery-3.7.0.js" integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=" crossorigin="anonymous"></script>
</head>
<body>
    <%@ include file="headerLogin.jsp" %>
    <main>
    	<!-- 베너 화면 -->
        <section class="main-section1">
            <div class="main-banner-group">
                <div class="main-banner-list">
                    <a href="" class="main-banner-tag">
                        <img src="resource/img/tennislogo2.png" 
                        class="main-banner-img"
                        alt="main-banner-img1">
                    </a>
                </div>
                <div class="main-banner-list">
                    <a href="" class="main-banner-tag">
                        <img src="resource/img//tennislogo1.png" 
                        class="main-banner-img"
                        alt="main-banner-img1">
                    </a>
                </div>
                <div class="main-banner-list">
                    <a href="" class="main-banner-tag">
                        <img src="resource/img//tennislogo3.png" 
                        class="main-banner-img"
                        alt="main-banner-img1">
                    </a>
                </div>
                <div class="main-banner-list">
                    <a href="" class="main-banner-tag">
                        <img src="resource/img//tennislogo4.png" 
                        class="main-banner-img"
                        alt="main-banner-img1">
                    </a>
                </div>
                <div class="main-banner-list">
                    <a href="" class="main-banner-tag">
                        <img src="resource/img/tennislogo5.png" 
                        class="main-banner-img"
                        alt="main-banner-img1">
                    </a>
                </div>
                <!-- 배너 버튼 -->
                <button type="button" class="arrow-prev">&lt;</button>
                <button type="button" class="arrow-next">&gt;</button>
                <div class="main-banner-cnt">
                    <div class="main-banner-currentIdx"></div>
                    <div class="main-banner-slice">/</div>
                    <div class="main-banner-slideCnt"></div>
                </div>
            </div>
        </section>
		<!-- 메이트 찾기 최신순 4개 출력 -->
        <section class="main-section2">
            <div class="main-section2-title">
                <div class="main-section2-title-text">
                    메이트 찾기
                </div>
                <div class="main-section2-title-more">
                    <a class="main-section2-title-more-tag" href="${pageContext.request.contextPath}/mateMatch/mateMatchList/mateMatchList.jsp">
                        더보기
                    </a>
                </div>
            </div>
            <form action="" class="main-form-mate">
                <a href="${pageContext.request.contextPath}/mateMatch/mateMatchViewDetail/mateMatchViewDetail.jsp" class="main-section2-mate-tag">             
                    <div class="main-section2-mate">
                        <div class="main-section2-mate-title">
                            호원실내테니스장
                        </div>
                        <div class="main-section2-mate-dateTime">
                            <div class="main-section2-mate-date">
                                08.11
                            </div>
                            <div class="main-section2-mate-day">
                                금
                            </div>
                            <div class="main-section2-mate-time">
                                18:00-20:00
                            </div>
                        </div>
                        <div class="main-section2-mate-gameType">
                            <div class="main-section2-mate-game">
                                랠리
                            </div>
                            <div class="main-section2-mate-condition">
                                <div class="main-section2-mate-open">
                                    &#40;
                                </div>
                                <div class="main-section2-mate-condition1">
                                    <div class="main-section2-mate-condition1-m-text">
                                        남
                                    </div>
                                    <div class="main-section2-mate-condition1-m-cnt">
                                        1
                                    </div>
                                    <div class="main-section2-mate-condition1-w-text">
                                        여
                                    </div>
                                    <div class="main-section2-mate-condition1-w-cnt">
                                        2
                                    </div>
                                </div>
                                <div class="main-section2-mate-condition2">,
                                </div>
                                <div class="main-section2-mate-condition3">
                                    &nbsp;
                                </div>
                                <div class="main-section2-mate-condition4">
                                    5년 이상
                                </div>
                                <div class="main-section2-mate-close">
                                    &#41;
                                </div>
                            </div>
                        </div>
                        <div class="main-section2-mate-comment">
                            
                            <img src="resource/img/comment.png" class="main-section2-mate-comment-img"
                            alt="main-section2-mate-comment-img">
                            <div class="main-section2-mate-comment-count">
                                12
                            </div>
                        </div>
                    </div>
                </a>

                <a href="${pageContext.request.contextPath}/mateMatch/mateMatchViewDetail/mateMatchViewDetail.jsp" class="main-section2-mate-tag">             
                    <div class="main-section2-mate">
                        <div class="main-section2-mate-title">
                            호원실내테니스장
                        </div>
                        <div class="main-section2-mate-dateTime">
                            <div class="main-section2-mate-date">
                                08.11
                            </div>
                            <div class="main-section2-mate-day">
                                금
                            </div>
                            <div class="main-section2-mate-time">
                                18:00-20:00
                            </div>
                        </div>
                        <div class="main-section2-mate-gameType">
                            <div class="main-section2-mate-game">
                                랠리
                            </div>
                            <div class="main-section2-mate-condition">
                                <div class="main-section2-mate-open">
                                    &#40;
                                </div>
                                <div class="main-section2-mate-condition1">
                                    <div class="main-section2-mate-condition1-m-text">
                                        남
                                    </div>
                                    <div class="main-section2-mate-condition1-m-cnt">
                                        1
                                    </div>
                                    <div class="main-section2-mate-condition1-w-text">
                                        여
                                    </div>
                                    <div class="main-section2-mate-condition1-w-cnt">
                                        2
                                    </div>
                                </div>
                                <div class="main-section2-mate-condition2">
                                    &nbsp;
                                </div>
                                <div class="main-section2-mate-condition3">,
                                </div>
                                <div class="main-section2-mate-condition4">
                                    5년 이상
                                </div>
                                <div class="main-section2-mate-close">
                                    &#41;
                                </div>
                            </div>
                        </div>
                        <div class="main-section2-mate-comment">
                            <img src="resource/img/comment.png" class="main-section2-mate-comment-img"
                            alt="main-section2-mate-comment-img">
                            <div class="main-section2-mate-comment-count">
                                12
                            </div>
                        </div>
                    </div>
                </a> 

                <a href="${pageContext.request.contextPath}/mateMatch/mateMatchViewDetail/mateMatchViewDetail.jsp" class="main-section2-mate-tag">             
                    <div class="main-section2-mate">
                        <div class="main-section2-mate-title">
                            호원실내테니스장
                        </div>
                        <div class="main-section2-mate-dateTime">
                            <div class="main-section2-mate-date">
                                08.11
                            </div>
                            <div class="main-section2-mate-day">
                                금
                            </div>
                            <div class="main-section2-mate-time">
                                18:00-20:00
                            </div>
                        </div>
                        <div class="main-section2-mate-gameType">
                            <div class="main-section2-mate-game">
                                랠리
                            </div>
                            <div class="main-section2-mate-condition">
                                <div class="main-section2-mate-open">
                                    &#40;
                                </div>
                                <div class="main-section2-mate-condition1">
                                    <div class="main-section2-mate-condition1-m-text">
                                        남
                                    </div>
                                    <div class="main-section2-mate-condition1-m-cnt">
                                        1
                                    </div>
                                    <div class="main-section2-mate-condition1-w-text">
                                        여
                                    </div>
                                    <div class="main-section2-mate-condition1-w-cnt">
                                        2
                                    </div>
                                </div>
                                <div class="main-section2-mate-condition2">
                                    &nbsp;
                                </div>
                                <div class="main-section2-mate-condition3">,
                                </div>
                                <div class="main-section2-mate-condition4">
                                    5년 이상
                                </div>
                                <div class="main-section2-mate-close">
                                    &#41;
                                </div>
                            </div>
                        </div>
                        <div class="main-section2-mate-comment">
                            <img src="resource/img/comment.png" class="main-section2-mate-comment-img"
                            alt="main-section2-mate-comment-img">
                            <div class="main-section2-mate-comment-count">
                                12
                            </div>
                        </div>
                    </div>
                </a> 

                <a href="${pageContext.request.contextPath}/mateMatch/mateMatchViewDetail/mateMatchViewDetail.jsp" class="main-section2-mate-tag">             
                    <div class="main-section2-mate">
                        <div class="main-section2-mate-title">
                            호원실내테니스장
                        </div>
                        <div class="main-section2-mate-dateTime">
                            <div class="main-section2-mate-date">
                                08.11
                            </div>
                            <div class="main-section2-mate-day">
                                금
                            </div>
                            <div class="main-section2-mate-time">
                                18:00-20:00
                            </div>
                        </div>
                        <div class="main-section2-mate-gameType">
                            <div class="main-section2-mate-game">
                                랠리
                            </div>
                            <div class="main-section2-mate-condition">
                                <div class="main-section2-mate-open">
                                    &#40;
                                </div>
                                <div class="main-section2-mate-condition1">
                                    <div class="main-section2-mate-condition1-m-text">
                                        남
                                    </div>
                                    <div class="main-section2-mate-condition1-m-cnt">
                                        1
                                    </div>
                                    <div class="main-section2-mate-condition1-w-text">
                                        여
                                    </div>
                                    <div class="main-section2-mate-condition1-w-cnt">
                                        2
                                    </div>
                                </div>
                                <div class="main-section2-mate-condition2">
                                    &nbsp;
                                </div>
                                <div class="main-section2-mate-condition3">,
                                </div>
                                <div class="main-section2-mate-condition4">
                                    5년 이상
                                </div>
                                <div class="main-section2-mate-close">
                                    &#41;
                                </div>
                            </div>
                        </div>
                        <div class="main-section2-mate-comment">
                            <img src="resource/img/comment.png" class="main-section2-mate-comment-img"
                            alt="main-section2-mate-comment-img">
                            <div class="main-section2-mate-comment-count">
                                12
                            </div>
                        </div>
                    </div>
                </a> 
            </form>
        </section>

		<!-- 커뮤니티 게시판(자유게시판, Q&A 최신순 3개씩) -->
        <section class="main-section3">
            <div class="main-section3-title">
                <div class="main-section3-title-text">
                    커뮤니티
                </div>
                <div class="main-section3-title-more">
                    <a class="main-section3-title-more-tag" href="${pageContext.request.contextPath}/community/freeboard/freeboardList/freeboardList.jsp">
                        더보기
                    </a>
                </div>
            </div>
            <div class="main-section3-sectionGroup">
                <form class="main-section3-section1-form" action="">
                    <div class="main-section3-section1">
                        <div class="main-section3-community-board">
                            <div class="main-section3-community-board-title">
                                <a href="${pageContext.request.contextPath}/community/freeboard/freeboardViewDetail/freeboardViewDetail.jsp" class="main-section3-community-board-tag">
                                    구력 2개월 테린인데 라켓 추천부탁드려요 구력 2개월 테린인데 라켓 추천부탁드려요
                                </a>
                            </div>
                            <div class="main-section3-community-board-content">
                                이번에 테니스 라켓을 새로 구매하려고합니다. 라켓추천 부탁드립니다!이번에 테니스 라켓을 새로 구매하려고합니다. 라켓추천 부탁드립니다!이번에 테니스 라켓을 새로 구매하려고합니다. 라켓추천 부탁드립니다!
                            </div>
                            <div class="main-section3-community-board-viewComment">
                                <div class="main-section3-community-board-view">
                                    <img src="resource/img/view.png" 
                                    class="main-section3-community-board-viewImg"
                                    alt="main-section3-community-board-viewImg">
                                    <div class="main-section3-community-board-viewCount">
                                        1
                                    </div>
                                </div>
                                <div class="main-section3-community-board-comment">
                                    <img src="resource/img/comment.png"
                                    class="main-section3-community-board-commentImg"
                                    alt="main-section3-community-board-commentImg">
                                    <div class="main-section3-community-board-commentCount">
                                        1
                                    </div>
                                </div>
                            </div>
                        </div>
                        <hr>
                        <div class="main-section3-community-board">
                            <div class="main-section3-community-board-title">
                                <a href="${pageContext.request.contextPath}/community/freeboard/freeboardViewDetail/freeboardViewDetail.jsp" class="main-section3-community-board-tag">
                                    구력 2개월 테린인데 라켓 추천부탁드려요 구력 2개월 테린인데 라켓 추천부탁드려요
                                </a>
                            </div>
                            <div class="main-section3-community-board-content">
                                이번에 테니스 라켓을 새로 구매하려고합니다. 라켓추천 부탁드립니다!이번에 테니스 라켓을 새로 구매하려고합니다. 라켓추천 부탁드립니다!이번에 테니스 라켓을 새로 구매하려고합니다. 라켓추천 부탁드립니다!
                            </div>
                            <div class="main-section3-community-board-viewComment">
                                <div class="main-section3-community-board-view">
                                    <img src="resource/img/view.png" 
                                    class="main-section3-community-board-viewImg"
                                    alt="main-section3-community-board-viewImg">
                                    <div class="main-section3-community-board-viewCount">
                                        1
                                    </div>
                                </div>
                                <div class="main-section3-community-board-comment">
                                    <img src="resource/img/comment.png"
                                    class="main-section3-community-board-commentImg"
                                    alt="main-section3-community-board-commentImg">
                                    <div class="main-section3-community-board-commentCount">
                                        1
                                    </div>
                                </div>
                            </div>
                        </div>
                        <hr>
                        <div class="main-section3-community-board">
                            <div class="main-section3-community-board-title">
                                <a href="${pageContext.request.contextPath}/community/freeboard/freeboardViewDetail/freeboardViewDetail.jsp" class="main-section3-community-board-tag">
                                    구력 2개월 테린인데 라켓 추천부탁드려요 구력 2개월 테린인데 라켓 추천부탁드려요
                                </a>
                            </div>
                            <div class="main-section3-community-board-content">
                                이번에 테니스 라켓을 새로 구매하려고합니다. 라켓추천 부탁드립니다!이번에 테니스 라켓을 새로 구매하려고합니다. 라켓추천 부탁드립니다!이번에 테니스 라켓을 새로 구매하려고합니다. 라켓추천 부탁드립니다!
                            </div>
                            <div class="main-section3-community-board-viewComment">
                                <div class="main-section3-community-board-view">
                                    <img src="resource/img/view.png" 
                                    class="main-section3-community-board-viewImg"
                                    alt="main-section3-community-board-viewImg">
                                    <div class="main-section3-community-board-viewCount">
                                        1
                                    </div>
                                </div>
                                <div class="main-section3-community-board-comment">
                                    <img src="resource/img/comment.png"
                                    class="main-section3-community-board-commentImg"
                                    alt="main-section3-community-board-commentImg">
                                    <div class="main-section3-community-board-commentCount">
                                        1
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </form>
                <form class="main-section3-section2-form" action="">
                    <div class="main-section3-section2">
                        <div class="main-section3-community-QA">
                            <div class="main-section3-community-QA-title">
                                <a href="${pageContext.request.contextPath}/community/qna/qnaViewDetail/qnaViewDetail.jsp" class="main-section3-community-QA-tag">
                                    구력 2개월 테린인데 라켓 추천부탁드려요 구력 2개월 테린인데 라켓 추천부탁드려요
                                </a>
                            </div>
                            <div class="main-section3-community-QA-content">
                                이번에 테니스 라켓을 새로 구매하려고합니다. 라켓추천 부탁드립니다!이번에 테니스 라켓을 새로 구매하려고합니다. 라켓추천 부탁드립니다!이번에 테니스 라켓을 새로 구매하려고합니다. 라켓추천 부탁드립니다!
                            </div>
                            <div class="main-section3-community-QA-viewComment">
                                <div class="main-section3-community-QA-view">
                                    <img src="resource/img/view.png" 
                                    class="main-section3-community-QA-viewImg"
                                    alt="main-section3-community-QA-viewImg">
                                    <div class="main-section3-community-QA-viewCount">
                                        1
                                    </div>
                                </div>
                                <div class="main-section3-community-QA-comment">
                                    <img src="resource/img/comment.png"
                                    class="main-section3-community-QA-commentImg"
                                    alt="main-section3-community-QA-commentImg">
                                    <div class="main-section3-community-QA-commentCount">
                                        1
                                    </div>
                                </div>
                            </div>
                        </div>
                        <hr>
                        <div class="main-section3-community-QA">
                            <div class="main-section3-community-QA-title">
                                <a href="${pageContext.request.contextPath}/community/qna/qnaViewDetail/qnaViewDetail.jsp" class="main-section3-community-QA-tag">
                                    구력 2개월 테린인데 라켓 추천부탁드려요 구력 2개월 테린인데 라켓 추천부탁드려요
                                </a>
                            </div>
                            <div class="main-section3-community-QA-content">
                                이번에 테니스 라켓을 새로 구매하려고합니다. 라켓추천 부탁드립니다!이번에 테니스 라켓을 새로 구매하려고합니다. 라켓추천 부탁드립니다!이번에 테니스 라켓을 새로 구매하려고합니다. 라켓추천 부탁드립니다!
                            </div>
                            <div class="main-section3-community-QA-viewComment">
                                <div class="main-section3-community-QA-view">
                                    <img src="resource/img/view.png" 
                                    class="main-section3-community-QA-viewImg"
                                    alt="main-section3-community-QA-viewImg">
                                    <div class="main-section3-community-QA-viewCount">
                                        1
                                    </div>
                                </div>
                                <div class="main-section3-community-QA-comment">
                                    <img src="resource/img/comment.png"
                                    class="main-section3-community-QA-commentImg"
                                    alt="main-section3-community-QA-commentImg">
                                    <div class="main-section3-community-QA-commentCount">
                                        1
                                    </div>
                                </div>
                            </div>
                        </div>
                        <hr>
                        <div class="main-section3-community-QA">
                            <div class="main-section3-community-QA-title">
                                <a href="${pageContext.request.contextPath}/community/qna/qnaViewDetail/qnaViewDetail.jsp" class="main-section3-community-QA-tag">
                                    구력 2개월 테린인데 라켓 추천부탁드려요 구력 2개월 테린인데 라켓 추천부탁드려요
                                </a>
                            </div>
                            <div class="main-section3-community-QA-content">
                                이번에 테니스 라켓을 새로 구매하려고합니다. 라켓추천 부탁드립니다!이번에 테니스 라켓을 새로 구매하려고합니다. 라켓추천 부탁드립니다!이번에 테니스 라켓을 새로 구매하려고합니다. 라켓추천 부탁드립니다!
                            </div>
                            <div class="main-section3-community-QA-viewComment">
                                <div class="main-section3-community-QA-view">
                                    <img src="resource/img/view.png" 
                                    class="main-section3-community-QA-viewImg"
                                    alt="main-section3-community-QA-viewImg">
                                    <div class="main-section3-community-QA-viewCount">
                                        1
                                    </div>
                                </div>
                                <div class="main-section3-community-QA-comment">
                                    <img src="resource/img/comment.png"
                                    class="main-section3-community-QA-commentImg"
                                    alt="main-section3-community-QA-commentImg">
                                    <div class="main-section3-community-QA-commentCount">
                                        1
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
            </div>
        </section>
		<!-- 카카오 api 지도 불러오기 -->
        <section class="main-section4">
            <div class="main-section4-title">지도 검색</div>
            <hr class="main-section4-hr">

            <!-- 카카오맵 api -->
            <div class="option">
                <div class="main-section4-map-keyword">
                    <form class="main-section4-map-keyword-form" onsubmit="searchPlaces(); return false;">
                        <input type="text" value="노원" 
                        id="keyword" class="main-section4-map-keyword-input" 
                        size="15" placeholder="지역명을 입력해 주세요 ex) 노원"> 
                        <div class="main-section4-map-keyword-text">테니스장</div>
                        <button class="main-section4-map-keyword-button" type="submit">검색하기</button> 
                    </form>
                </div>
            </div>
            <div class="map_wrap">
                <div id="map" style="width:100%;height:100%;position:relative;overflow:hidden;"></div>
                <div id="menu_wrap" class="bg_white">
                    <hr>
                    <ul id="placesList"></ul>
                    <div id="pagination"></div>
                </div>
            </div>
        </section>   

    </main>
    <%@ include file="footer.jsp" %>
	
</body>
</html>