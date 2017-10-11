<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
<title>Insert title here</title>
<link rel= "Shortcut icon" href="/favicon.ico"/>
<!-- <script type="text/javascript" src= "https://code.jquery.com/jquery-3.2.1.min.js"></script>
 -->
 <script type="text/javascript" src= "script/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
$(function(){
	$('#btnText').click(function(){
		$('#rcvMsg').load('msg.txt');
		});
	$('#btnJsp').click(function(){
		$('#rcvMsg').load('msg.jsp');
	});
});
</script>
</head>
<body>
<input type ="button" id= "btnText" value= "get text" />
<input type ="button" id= "btnJsp" value= "get text"  />
<div id= "rcvMsg"></div>
</body>
</html>