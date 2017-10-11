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
하나의 페이지 속성:<%=pageContext.getAttribute("name") %><br>
하나의 요청속성:<%=request.getAttribute("name") %><br>
하나의 세션속성:<%=session.getAttribute("name") %><br>
하나의 애플리케이션 속성:<%= application.getAttribute("name") %><br>

<a href="thirdPage.jsp"></a>
</body>
</html>