<%@page import="java.net.URLEncoder"%>
<%@page import="org.apache.commons.codec.digest.DigestUtils"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="memo.model.MemoVO"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String user_id=request.getParameter("user_id");
	String user_pw=DigestUtils.sha512Hex(request.getParameter("user_pw"));
	String save_id= request.getParameter("save_id");
	String user_name= null;
 	

	Connection cn = null;
	PreparedStatement st = null;
	ResultSet rs= null;
	
	StringBuffer sql = new StringBuffer();
	sql.append("SELECT user_name");
	sql.append(" FROM t_mem");
	sql.append(" WHERE user_id=?");
	sql.append(" AND user_pw=?");
	Cookie[] cookie=request.getCookies();
	
	boolean result = false;
	try {
		Class.forName("oracle.jdbc.OracleDriver");
		cn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe","bigdata","bigdata");
		st=cn.prepareStatement(sql.toString());
		st.setString(1,user_id);
		st.setString(2,user_pw);
		rs= st.executeQuery();
		if(rs.next()){
			user_name=rs.getString("user_name");
		}
		
		if(save_id != null && save_id.equals("on")){
			 Cookie c1 = new Cookie("user_id", URLEncoder.encode(user_id));
			   c1.setMaxAge(60*60*24*30);
			   response.addCookie(c1);
		}else {
			 Cookie c1 = new Cookie("user_id", null);
			   c1.setMaxAge(0);
			   response.addCookie(c1);
		}
		
	} catch(Exception e) {
		e.printStackTrace();
	} finally {
		if (rs != null)try{rs.close();} catch(Exception e){}
		if (st != null)try{st.close();} catch(Exception e){}
		if (cn != null)try{cn.close();} catch(Exception e){}
	}
	
	%>
<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
<title>Insert title here</title>
<link rel= "Shortcut icon" href="/favicon.ico"/>
</head>
<body>

	
	<%
	if(user_name != null){
	out.println(user_name+"회원님이 로그인되었습니다.");
	}else{%>
	<script type="text/javascript">
	alert('아이디 혹은 비밀번호가 틀립니다.');
	location.href='login.jsp';
	</script>
	<%}%>
	
	
	
</body>
</html>
