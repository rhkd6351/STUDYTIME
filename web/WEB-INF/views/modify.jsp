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
    <link rel="stylesheet" href="../../../resources/css/main.css?ver2">
    <link rel="stylesheet" href="../../../resources/css/board.css?ver=2">
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
                    <form action="/main/board/post/updateSubmit" method="post">
                        <input type="text" name="title" placeholder="글 제목" value="${postVo.title}">
                        <textarea name="content" cols="30" rows="10" placeholder="내용">${postVo.content}</textarea>
                        <input type="hidden" value="${postVo.oid}" name="oid">
                        <input type="submit" value="수정">
                    </form>
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