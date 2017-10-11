<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
<title>Insert title here</title>
<link rel= "Shortcut icon" href="/favicon.ico"/>
</head>
<body bgcolor="red">
이파일은 red.jsp입니다.<br>
브라우저에 배경색이 빨간색으로 나타날까요?<br>
노란색으로 나타날까요?<hr>
forward 액션태그가 실행되면 이페이지의 내용은 출력되지 않습니다.<br>
<jsp:forward page="yello.jsp" />
</body>
</html>