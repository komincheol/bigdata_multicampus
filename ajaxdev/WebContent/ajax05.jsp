<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="Shortcut icon" href="/favicon.ico" />
</head>
<body>
	<script type="text/javascript" src="script/jquery-3.2.1.min.js"></script>
	<script type="text/javascript">
$(function(){
$('#btnClass').click(function(){
	$.getScript('script.js')
});
});

</script>
	<hr />
	<input type="button" id="btnClass" value="get" />
	<hr/>
	<ul type>
	<div id="rcvMsg"></div>
	</ul>
</body>
</html>