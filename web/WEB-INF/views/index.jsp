
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
    <link rel="stylesheet" href="../../resources/css/login.css">
</head>
<script type="text/javascript">
    var loginId = ${loginId};
    var loginPw = ${loginPw};

    if(loginId == false){
        alert("아이디가 틀렸습니다.");
    }else if(loginPw == false){
        alert("비밀번호가 틀렸습니다.");
    }
</script>
<body>
<div class="page-wrapper">
    <div class="content">
        <div class="aside-left">
            <div class="aside-left-content">
                <div class="title">
                    <h2 style="font-weight: 100;">스터디 생활을 더 편하고 즐겁게,</h2>
                    <h2 style="color: #c62917; font-weight: bold;">스터디타임</h2>
                </div>
                <div class="phone"></div>
                <div class="app google">
                    Google Play
                </div>
                <div class="app apple">
                    App Store
                </div>
            </div>
            <div class="aside-left-content">

            </div>
            <div class="aside-left-content">

            </div>
        </div>

        <div class="aside-right">
            <div class="aside-right-content">
                <div class="login-box">
                    <div class="title">
                        <h3>STUDYTIME</h3>
                    </div><br/>
                </div>
                <form action="/main/login" method="post">
                    <input type="text" name="id" placeholder="ID"/> <br/>
                    <input type="password" name="pw" placeholder="PW"> <br/>
                    <input type="submit" value="로그인">
                    <input type="button" value="회원가입">
                </form>
            </div>

            <div class="aside-right-content">
                <div class="search-title">
                    <p>스터디 둘러보기</p>
                </div>
                <input type="text" class="search" placeholder="찾으시는 스터디를 검색하세요">
                <ul>
                    <li>스프링</li>
                    <li>머신러닝</li>
                    <li>블록체인</li>
                    <li>노드js</li>
                    <li>리액트</li>
                </ul>
            </div>
        </div>
    </div>

    <footer>

    </footer>
</div>

</body>
</html>