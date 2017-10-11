<%@page import="java.util.InputMismatchException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%String name = request.getParameter("want"); %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
@import url(want.css);
</style>
</head>
<%
String want = request.getParameter("want");
String want_string = want + "가 하고 싶어요ㅜㅜ";
try{
	if(!(want.equals("야구")|| 
			want.equals("축구")|| 
					want.equals("농구"))){
		throw new InputMismatchException();
	}
}
	catch(Exception e){
		response.sendRedirect("form.jsp");
		return;
	}

%>

<body>
<div id="want"><img src="want.png" width="60%" /></div>
<div class="say"><h3><%=name%>가 하고싶어요</h3></div>

</body>
</html>