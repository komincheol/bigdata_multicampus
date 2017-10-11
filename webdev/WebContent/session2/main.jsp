<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <% if(session.getAttribute("user_id") == null ||
	  session.getAttribute("user_id").equals("")){ %>
 <script type="text/javascript">
 alert('먼저 로그인을 하세요');
location.href='sessionform.jsp';
</script>   	
   <%	 return;
   }%> 
<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
<title>Insert title here</title>
<link rel= "Shortcut icon" href="/favicon.ico"/>

</head>
<body>
<h1>세션테스트중입니다.</h1>
<a herf ="imsi.jsp">임시 서버</a>
현재<%=session.getAttribute("user_id")%>
(<%=session.getAttribute("user_name")%>
,<%=session.getAttribute("user_level")%>)
회원님이 접속중입니다. <br/>
<a href="session_invalidate.jsp">로그아웃</a>
</body>
</html>