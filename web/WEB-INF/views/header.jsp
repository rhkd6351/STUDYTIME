<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="header">
    <nav>
        <div class="title">
            STUDYTIME <br>
            <p><a href="/main/page">스프링</a></p>
        </div>

        <div class="menu">
            <div class="menu-item">
                게시판
            </div>
        </div>

        <div class="function">
            <div class="function-item">

            </div>
        </div>
    </nav>

    <div class="board">
        <div class="board-item">
            <ul>
                <c:forEach var="board" items="${boardList}">
                <li><a href="/main/board?boardOid=<c:out value="${board.getOid()}"/>"><c:out value="${board.getName()}"/></a></li>
                </c:forEach>
            </ul>
        </div>
        <div class="board-item">
            <ul>
                <li>NONE</li>
            </ul>
        </div>
        <div class="board-item">
            <ul>
                <li>NONE</li>

            </ul>
        </div>
    </div>
</div>