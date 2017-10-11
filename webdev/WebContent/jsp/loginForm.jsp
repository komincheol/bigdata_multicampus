<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
<link rel="Shortcut icon" href="/favicon.ico" />
<script type="text/javascript">
	function input_check() {
		console.log('input_check 수행중');
		var f = document.myform;
		console.log('userid : ' + f.id.value);
		console.log('userpw : ' + f.pw.value);
		console.log('-----------------------');
		console.log('userid : ' + document.getElementById('userid').value);
		console.log('userid : ' + document.getElementById('userpw').value);

		var user_id = document.getElementById('userid').value;
		var user_pw = document.getElementById('userpw').value;
		if (user_id === '') {
			alert('아이디를 입력하세요');
			return;
		}
		if (user_pw === '') {
			alert('비밀번호를 입력하세요');
			return;
		}
		f.submit();
	}
</script>
</head>
<body>
	<form name="myform" action="testLogin.jsp" method="post">
		<label for="userid">아이디:</label> 
		<input type="text" name="id" id="userid" !autofocus="autofocus" /><br>
		<label for="userpw">암&nbsp;&nbsp;&nbsp;
			호 :</label> <input type="password" name="pw" id="userpw" /><br> <input
			type="button" value="로그인" onclick="input_check()" />
	</form>

</body>
</html>