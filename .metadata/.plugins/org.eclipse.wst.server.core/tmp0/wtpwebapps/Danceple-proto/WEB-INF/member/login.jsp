<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="context" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>로그인</title>

<!-- Bootstrap Core CSS -->
<link href="../css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="../css/full-width-pics.css" rel="stylesheet">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>
	<!-- Full Width Image Header Blank -->
	<!-- Image backgrounds are set within the full-width-pics.css file. -->
	<header class="image-bg-fluid-height">
		<aside class="image-bg-fixed-height"></aside>
	</header>

	<!-- Content Section -->
	<section>
		<div class="container">
			<div class="wrapper">
				<div class="row">
					<div class="col-lg-6">
					<c:if test="${sessionScope.loginUser == null}">
						<form action="${context}/member/loginAction" method="post" name="frm" class="form-signin">
							<h2 class="form-signin-heading">Please login</h2>
							<div class="col-lg-12">
								<input type="text" name="userId" id="user_id" value="${userid}" class="form-control" placeholder="ID" required="required" autofocus="autofocus" />
							</div>
							<div class="col-lg-12">
								<input type="password" name="userPwd" id="user_pw" class="form-control"	placeholder="Password" required="required" /> 
							</div>
							<div class="col-lg-12">
								<label class="checkbox">
									<input type="checkbox" name="save_id" > 아이디 기억
								</label>
							</div>
							<div class="col-lg-12">
								<button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>
							</div>
							<div class="col-lg-12">
								<div class="col-lg-7">
									<p class="help-block">아이디/비밀번호를 잃어버리셨습니까?</p>
								</div>
								<div class="col-lg-5">
									<input type="button" value="아이디/비밀번호 찾기" onclick="" class="btn btn-sm btn-secondary btn-block">
								</div>
							</div>
							<div class="col-lg-12">
								<div class="col-lg-7">
									<p class="help-block">아직 회원이 아니시라면 가입하세요.</p>
								</div>
								<div class="col-lg-5">
									<input type="button" value="회원가입" onclick="location.href='memberInsert'" class="btn btn-sm btn-secondary btn-block">
								</div>
								
							</div>
							
							<div class="col-lg-12">
								${message}
							</div>
							
						</form>
						</c:if>
						
					</div>
				</div>
			</div>
		</div>
	</section>

	<!-- jQuery -->
	<script src="../js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="../js/bootstrap.min.js"></script>

</body>

</html>
