<%@page import="java.io.IOException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%!
public String commentAge(int age ){

/*     	if(age <20){ 
	out.print("(묘령)");
}else if(20<= age && age<30){
	out.print("(약관)");
}else if(30<= age && age<40){
	out.print("(이립)");
}else if(40<= age && age<50){
	out.print("(불혹)");
}else if(50<= age && age<60){
	out.print("(지천명)");
}else if(60<= age && age<70){
	out.print("(이순)");
}else if(70<= age){
	out.print("(종심)");
}	 */
switch(age/10) {
		case 0:
		case 1:
			return "묘령";
		case 2:
			return"약관";
		case 3:
			return"이립";
		case 4:
			return"불혹";
		case 5:
			return"지천명";
		case 6:
			return"이순";
		default:
			return"종심";
		}
}
%>
<%
    String name= request.getParameter("name");
    int age= Integer.parseInt(request.getParameter("age"));
    %>
<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> 그래, 난 <%=name %>. 포기를 모르는 남자지!<br/></h1>
 나이:<%=age %><%=commentAge(age) %><br/>
 <% %>
</body>
</html>