<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="shortcut icon" href="/favicon.png" />
</head>
<body bgcolor="red">
red page
<jsp:forward page="08_yellow.jsp">
	<jsp:param value="배수지" name="username"/>
</jsp:forward>
<%--
	RequestDispatcher dispatcher = request.getRequestDispatcher("08_yellow.jsp");
	dispatcher.forward(request, response);

--%>
</body>
</html>