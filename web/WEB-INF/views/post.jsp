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
    <link rel="stylesheet" href="../../resources/css/post.css?ver=3">
</head>
<body>
<div class="page-wrapper">
    <%@include file="header.jsp"%>

    <div class="content">
        <div class="aside-left-content">
            <div class="left-item">
                자유게시판
            </div>
            <div class="left-item">
                <div class="post-student">
                    작성자: ${postVo.studentId}
                </div>

                <div class="post-delete">
                    <c:if test="${postVo.studentId eq sessionScope.student.id}">
                        <a href="/main/board/post/delete?postOid=${postVo.oid}">삭제</a>&nbsp;
                        <a href="/main/board/post/update?postOid=${postVo.oid}">수정</a>
                    </c:if>
                </div>

                <div class="post-title">
                    ${postVo.title}
                </div>
                <div class="post-content">
                    ${postVo.content}
                </div>
                <div class="post-like">
                    ${postVo.up}UP
                </div>
                <div class="reply-box">
                    <c:forEach var="reply" items="${replyList}">
                    <div class="reply">
                        <div class="reply-student">
                            <c:out value="${reply.studentId}"/>
                        </div>
                        <div class="reply-delete">
                            <c:if test="${reply.studentId eq sessionScope.student.id}">
                                <a href="/main/board/post/reply/delete?replyOid=${reply.oid}">삭제</a>
                            </c:if>
                        </div>
                        <div class="reply-content">
                            <c:out value="${reply.content}"/>
                        </div>
                        <div class="reply-like"><br/><br/>
                            <c:out value="${reply.up}"/>UP
                        </div>
                    </div>
                    </c:forEach>
                    <div class="add-reply-box">
                        <form action="/main/addReply" method="post">
                            <input type="text" name="content" placeholder="댓글을 작성하세요">
                            <input type="hidden" name="postOid" value="${postVo.oid}">
                            <input type="submit" value="작성">
                        </form>
                    </div>

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