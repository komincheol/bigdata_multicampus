<%@page import= "java.net.URLEncoder" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String userID=request.getParameter("userID");
    String userPwd=request.getParameter("userPwd");
    String loginCheck=request.getParameter("loginChecked");    
    if(loginCheck.equals("user")){
    	
    	%>
    	<jsp:forward page="usermain.jsp">
    	<jsp:param value='<%=URLEncoder.encode("전고객","UTF-8") %>' name ="userName"/>
    	</jsp:forward>
    	<%}else{ %>
    	<jsp:forward page="managerMain.jsp">
    	<jsp:param value='<%=URLEncoder.encode("성관리","UTF-8") %>' name ="userName"/>
    	</jsp:forward>
    <% }
    %>
<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
<title>Insert title here</title>
<link rel= "Shortcut icon" href="/favicon.ico"/>
</head>
<body>

</body>
</html>