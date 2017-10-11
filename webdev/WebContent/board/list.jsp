<%@page import="java.util.ArrayList"%>
<%@page import="board.model.BoardDAO"%>
<%@page import="java.util.List"%>
<%@page import="board.model.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    long pg= 1;//현재페이지
    try{
    	pg= Long.parseLong(request.getParameter("pg"));
    }catch(Exception e){   	
    }
    
    int pageSize = 5;	//한페이지에 출력할수있게
    long startnum = (pg-1) * pageSize+1; // 출력페이지 시작번호
    long endnum= pg * pageSize;// 출력페이지 끝번호
    long pageCount = 0;							// 전체 페이지 수
	long totalCount = 0;						// 전체 게시물 수
	long blockSize=10;
	long startPage=0;
	long endPage=0; 
	
	BoardDAO boardDAO = BoardDAO.getInstance();
	totalCount=boardDAO.getTotalCount();
	List<BoardVO>list=new ArrayList<BoardVO>();
	 
   
    
	pageCount = totalCount / pageSize;	// 전체 페이지 수
	if (totalCount % pageSize != 0){
		pageCount++;
	}
	
	if(pageCount <endPage) endPage= pageCount;
	startPage=(pg-1)/(blockSize)*blockSize+1;
	endPage=(pg-1)/(blockSize)*blockSize+blockSize;    	
	  list=boardDAO.getBoardList(startnum,endnum);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="content.css" type= "text/css" rel="stylesheet">
<link rel="shortcut icon" href="/favicon.ico" />
</head>
<body>
<table class="type08">
	<caption>게시물 리스트</caption>
<tr>
	<th scope="cols">번호</th>
	<th scope="cols">작성자</th>
	<th scope="cols">제목</th>
	<th scope="cols">작성일</th>
	<th scope="cols">조회수</th>
</tr>
<% for(BoardVO boardVO: list){%>
<tr>
	<th><%=boardVO.getNo() %></th>
	<th><%=boardVO.getName() %></th>
	<th><a href="content.jsp?no=<%=boardVO.getNo() %>"><%=boardVO.getTitle() %></a></th>
	<th><%=boardVO.getRegdate() %></th>
	<th><%=boardVO.getViewcount() %></th>
</tr>
<%} %>
<tr>
	<td colspan ="5">
	<%if(startPage==1){ %>
	이전페이지
<%}else{ %>
<a href = "list.jsp?pg=<%=startPage-1 %>">이전페이지</a>
<%} %>

<%for(long p=startPage; p<= endPage; p++){%>
	<%if (p==pg){ %>
		<%=p %>
		<%}else{ %>
	<a href = "list.jsp?pg=<%=p %>"><%=p %></a>
	<% } 
 	}%>

<%if(endPage == pageCount){ %>
	다음페이지
<%}else{ %>
	<a href ="list.jsp?pg=<%=endPage+1%>">다음페이지</a>
<%} %>
</td>
</tr>
</table><br/>
<a href="insert.jsp">글쓰기</a><br/>
</body>
</html>