<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
<title>Insert title here</title>
<link rel= "Shortcut icon" href="/favicon.ico"/>
<script type="text/javascript" src= "script/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
$(function(){
	$('#btnJsp').click(function(){
		$.ajax({
			method:	'GET',
			url:	'iam.jsp',
			data:	{name:$('#name').val()}
		})
		.done(function(data){
			$('#rcvMsg').html(data);
		});
	});

});
</script>
</head>
<body>
<hr/>
<input type ="text" id= "name" value= "get text"  />
<input type ="button" id= "btnJsp" value= "get text"  />
<div id= "rcvMsg"></div>
</body>
</html>