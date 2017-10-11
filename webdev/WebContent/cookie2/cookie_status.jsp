<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="Shortcut icon" href="/favicon.ico" />
</head>
<body>
<a href = "cookie_form.jsp">쿠키생성</a>

[<a href="removeID.jsp">아뒤 삭제</a>]
[<a href="remobeName.jsp">이름 삭제</a>]
[<a href="removeLevel.jsp">레벨 삭제</a>]
[<a href="removeCookie.jsp">전체 삭제</a>]
<hr/>
[생성 쿠키 리스트]
	<%
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie c : cookies) {
				if (!c.getName().equals("JSESSIONID")) {
					out.println("쿠키이름 : " + c.getName() + "<br/>");
					out.println("쿠키 값 :" + 
					URLDecoder.decode(c.getValue(), "UTF-8") + "<br/>");

					out.println("<hr/>");
				}

			}
		}
	%>
	
</body>
</html>