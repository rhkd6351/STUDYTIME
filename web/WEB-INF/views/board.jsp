<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>스터디타임</title>
    <link rel="stylesheet" href="../../resources/css/main.css?ver1">
    <link rel="stylesheet" href="../../resources/css/board.css?ver=1">
</head>
<body>
<div class="page-wrapper">
    <%@include file="header.jsp"%>

    <div class="content">
        <div class="aside-left-content">
            <div class="left-item">
                ${boardVo.name}
            </div>
            <div class="left-item">
                <div class="write-post">
                    <form action="/main/addPost" method="post">
                        <input type="text" name="title" placeholder="글 제목">
                        <textarea name="content" cols="30" rows="10" placeholder="내용"></textarea>
                        <input type="hidden" value="${boardVo.oid}" name="boardOid">
                        <input type="submit" value="작성">
                    </form>
                </div>
            </div>
            <c:forEach var="post" items="${postList}">
            <div class="left-item list">
                <div class="post-list">
                    <div class="post-list-title">
                        <a href="/main/board/post?postOid=${post.oid}"><c:out value="${post.title}"/></a>
                    </div>
                    <div class="post-list-content">
                        <c:out value="${post.content}"/>
                    </div>
                    <div class="post-list-date">
                        30분 전
                    </div>
                    <div class="post-list-student">
                        <c:out value="${post.studentId}"/>
                    </div>
                    <div class="post-list-like">
                        <c:out value="${post.up}"/>
                    </div>
                </div>
            </div>
            </c:forEach>
        </div>
        <%@include file="right-content.jsp"%>
    </div>

    <footer>

    </footer>
</div>

</body>
</html>