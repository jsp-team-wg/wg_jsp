<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Header(로그인후화면)</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resource/css/headerLogin.css">
    <script defer src="${pageContext.request.contextPath}/resource/js/headerLogin.js"></script>
    <script src="https://code.jquery.com/jquery-3.7.0.js" integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=" crossorigin="anonymous"></script>
</head>
<body>
<header>
	<!-- 헤더 카테고리 -->
    <div class="main-header-container">
        <div class="main-header-logo-category">
            <div class="main-header-logo">
                <a href="${pageContext.request.contextPath}/indexLogin.jsp" class="main-header-logo-tag">
                    <img class="main-header-logo-img" 
                    src="${pageContext.request.contextPath}/resource/img/warigarilogo.png"
                    alt="main-header-logo-img">
                </a>
            </div>
            <nav class="main-header-category">
                <ul class="main-header-category-ul">   
                    <li class="main-header-category-list">
                        <a href="${pageContext.request.contextPath}/mateMatch/mateMatchList/mateMatchList.jsp" class="main-header-category-matetag">
                        메이트 찾기
                        </a>
                    </li>
                    <li class="main-header-category-list">
                        <a href="${pageContext.request.contextPath}/community/freeboardList/freeboardList.jsp" class="main-header-category-communitytag">
                        커뮤니티
                        </a>
                    </li>
                </ul>
            </nav>
            <!-- 카테고리바 -->
            <article class = "main-sub-menu">
                <ul class="main-sub-menu-ul">
                    <li class="main-sub-menu-li">
                        <a href="${pageContext.request.contextPath}/community/freeboard/freeboardList/freeboardList.jsp" class="main-sub-menu-tag">
                            자유게시판
                        </a>
                    </li>
                    <li class="main-sub-menu-li">
                        <a href="${pageContext.request.contextPath}/community/qna/qnaList/qnaList.jsp" class="main-sub-menu-tag">
                            Q&A
                        </a>
                    </li>
                    <li class="main-sub-menu-li">
                        <a href="${pageContext.request.contextPath}/community/notice/noticeList/noticeList.jsp" class="main-sub-menu-tag">
                            공지사항
                        </a>
                    </li>
                </ul>
            </article>
        </div>
        <!-- 마에페이지, 로그아웃 버튼 -->
        <div class="main-header-service">
            <div class="main-header-service-mypage">
                <a class="main-header-service-mypage-tag"
                href="${pageContext.request.contextPath}/myPage/mateMemberEditMyPage/mateMatchMyPageMemberEdit.jsp">
                    <div class="main-header-nickname">
                        JinHyukKang
                    </div>님
                </a>
            </div>
            <div class="main-header-service-logout">
                <a class="main-header-service-logout-tag"
                href="${pageContext.request.contextPath}/index.jsp" 
                onclick="return confirmLogout();">
                    로그아웃
                </a>
            </div>
        </div>
    </div>
</header>
</body>
</html>