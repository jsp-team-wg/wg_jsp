<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>자유게시판 글수정</title>
    <link rel="stylesheet" href="../../../resource/css/freeboardEdit.css" />
  </head>
  <body>
  
  	<%@ include file="../../../headerLogin.jsp" %>
    <main>
      <!-- 자유게시판 글수정-->
      <section class="first-section">
     <input type = "hidden" value = "${freeboard.freeboardNum}" name = "freeboard"/>
        <div class="section-top-category-name">
          <div class="section-top-category-name-text1">커뮤니티</div>
          <div class="section-top-category-name-text2">자유게시판 - 글수정</div>
        </div>
      </section>
      <!-- 제목 & 내용 -->
         <section class="titleContentSection border-radius bgGray">
          <div class="titleContent">
            <div class="title">
              <p>제목</p>
              <div class="title-out-box">
                <textarea class="title-in-box-text"
                name="freeboardTitle" 
                placeholder="제목을 입력하세요(50자 이내)">${freeboard.freeboardTitle}
                 </textarea>
              </div>
            </div>
            <div class="content">
              <p>내용</p>
              <div class="content-box-out">
             
                <textarea
                  class="content-area border-radius"
                  name="freeboardContent"
                  placeholder="내용을 입력하세요(3000자 이내)"> 
                 ${freeboard.freeboardContent}
                </textarea>
                
              </div>
            </div>
          </div>
        </section>
        <!-- 뒤로가기 & 작성완료 -->
        <section>
          <div class="pagebackComplete border-radius">
            <button type="submit" 
            onclick="window.location.href='${pageContext.request.contextPath}/community/freeboard/freeboardViewDetail/freeboardViewDetail.fr?freeboardNum=${freeboard.freeboardNum}'"
              class="pageback button-size border-radius bgRed colorWhite"
              name="pageback"
            >
              뒤로가기
            </button>

            <button type="button" 
            onclick="location.href='${pageContext.request.contextPath}/community/freeboard/freeboardList/freeboardEditOk.fr?freeboardNum=${freeboard.freeboardNum}'"
              class="complete button-size border-radius bgGreen colorWhite "
              name="complete"
            >
              수정완료
            </button>
          </div>
        </section>
    </main>
    <%@ include file="../../../footer.jsp" %>
  </body>
</html>