<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="shortcut icon" href="/favicon.png" />
<style type="text/css">
@import url(css/want.css);
</style>
</head>
<body>
<div id="name"><img src="img/whoami2.png" /></div>
<div class="say"><h2><%=request.getAttribute("iam") %></h2></div>
</body>
</html>
