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
    <link rel="stylesheet" href="../../resources/css/main.css">
</head>
<body>
<div class="page-wrapper">
    <%@include file="header.jsp"%>

    <div class="content">
        <div class="aside-left-content">
            <div class="left-item">
                내정보
            </div>
            <div class="left-item">
                <ul>
                    <li>내가 쓴 글</li>
                    <li>댓글 단 글</li>
                    <li>내 스크랩</li>
                </ul>
            </div>
        </div>
        <div class="aside-center-content">
            <div class="center-left-content">
                <div class="center-left-item">
                    <div class="center-left-title">
                        자유게시판
                    </div>
                    <c:forEach var="leftPost" items="${leftPostList}" varStatus="stat" begin="0" end="17">
                    <div class="center-left-post">
                        <div class="post-title">
                            <a href="/main/board/post?postOid=${leftPost.oid}"><c:out value="${leftPost.title}"/></a>
                        </div>
                        <div class="post-date">
                            2분 전
                        </div>
                    </div>
                    </c:forEach>
                </div>
            </div>
            <div class="center-right-content">
                <div class="center-right-item">
                    <div class="center-right-title">
                        비밀게시판
                    </div>
                    <c:forEach var="rightPost" items="${rightPostList}" varStatus="stat" begin="0" end="17">
                        <div class="center-right-post">
                            <div class="post-title">
                                <a href="/main/board/post?postOid=${rightPost.oid}"><c:out value="${rightPost.title}"/></a>
                            </div>
                            <div class="post-date">
                                방금
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </div>
        <%@include file="right-content.jsp"%>
    </div>

    <footer>

    </footer>
</div>

</body>
</html>