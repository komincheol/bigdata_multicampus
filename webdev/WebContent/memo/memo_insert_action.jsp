<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="memo.model.MemoVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%--    <%
    String name = request.getParameter("name");
    String title = request.getParameter("title");
    String content = request.getParameter("content");
    
    MemoVO memoVO= new MemoVO();
    memoVO.setName(name);
    memoVO.setTitle(title);
    memoVO.setContent(content);
    %> --%>
    <jsp:useBean id="memoVO" class="memo.model.MemoVO"/>
    <jsp:setProperty name="memoVO" property="*"/>
    <%
    
    Connection cn = null;
    PreparedStatement ps= null;
    
    StringBuffer sql=new StringBuffer();
    sql.append(" insert into t_memo(no, name, title,content) ");
    sql.append(" values(seq_memo.nextval,?,?,?) ");
    boolean result= false;
    try {
    	Class.forName("oracle.jdbc.OracleDriver");
    	cn= DriverManager.getConnection(
    			"jdbc:oracle:thin:@localhost:1521:xe","bigdata","bigdata");
    	ps=cn.prepareStatement(sql.toString());
    	ps.setString(1, memoVO.getName());
    	ps.setString(2, memoVO.getTitle());
    	ps.setString(3, memoVO.getContent());
    	ps.executeUpdate();
    	result=true;
    }catch(Exception e){
    	e.printStackTrace();
    }finally{
    	if(ps != null)try{ps.close();} catch(Exception e){}
    	if(cn !=null)try{cn.close();}catch(Exception e){}
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
<%if (result){ %>
메모 등록 성공
<%}else{ %>
메모 등록 실패
<%} 
%>

</body>
</html>