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

Cookie[] cookie = request.getCookies() ;

    for(Cookie c : cookie){
    	
        c.setMaxAge(0) ;
        response.addCookie(c) ;
  
    }

%>
<%-- <%
String[] names= request.getParameterValues("name");
for(String name : names){
	Cookie cookie = new Cookie(name, "");
	 cookie.setMaxAge(0) ;
     response.addCookie(cookie) ;
}
response.sendRedirect("cookie_status.jsp");
%> --%>

<h3> 쿠키가 전체 삭제되었습니다.</h3>
<a href="cookie_status.jsp">
쿠키 삭제를 확인하려면 클릭하세요.</a>
</body>
</html>