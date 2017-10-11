<%@page import="javax.security.auth.message.callback.PrivateKeyCallback.Request"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
<title>Insert title here</title>
<link rel= "Shortcut icon" href="/favicon.ico"/>
</head>
<body>
입장하려면 나이를 입력하세요.<br>
<form action="forward.jsp">
<input type = "text" name = "age">
<input type ="submit" value= "입장">
<!-- ../cal/calendarTest2.jsp -->
</form>
</body>
</html>