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
<%
//1. cookie객체생성
Cookie c= new Cookie("id","pinksung");
//2.유효기간설정
c.setMaxAge(365*24*60*60);
//3/클라이언트 쿠키전송
response.addCookie(c);
//4.쿠키를 생성하여클라이언트 전송
response.addCookie(new Cookie("pwd","test1234"));
response.addCookie(new Cookie("age","20"));%>
<h3>쿠키 설정</h3>
</body>
</html>