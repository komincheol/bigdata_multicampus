<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="context" value="${pageContext.request.contextPath}" />


<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Danceple - Template</title>

	<!-- Bootstrap core CSS -->
    <link href="${context}/resources/css/bootstrap.css" rel="stylesheet">
    <!--external css-->
    <link href="${context}/resources/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link rel="stylesheet" type="text/css" href="${context}/resources/css/zabuto_calendar.css">
    <link rel="stylesheet" type="text/css" href="${context}/resources/js/gritter/css/jquery.gritter.css" />
    <link rel="stylesheet" type="text/css" href="${context}/resources/lineicons/style.css">    
    
    <!-- Custom styles for this template -->
    <link href="${context}/resources/css/style.css" rel="stylesheet">
    <link href="${context}/resources/css/style-responsive.css" rel="stylesheet">

</head>

<body>
	<section id="container">
		<!-- **********************************************************************************************************************************************************
      TOP BAR CONTENT & NOTIFICATIONS
      *********************************************************************************************************************************************************** -->
		<!--header start-->

		<header class="header black-bg">
			<div class="sidebar-toggle-box">
                  <div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
             </div>
			<!--logo start-->
			<a href="${context}/index.jsp" class="logo"><b>DANCEPEL</b></a>
			<!--logo end-->
			
			<div class="top-menu">
				<ul class="nav pull-right top-menu">
					<li><a class="logout" href="${context}/logout">Logout</a></li>
				</ul>
			</div>
		</header>

		<!-- **********************************************************************************************************************************************************
      MAIN SIDEBAR MENU
      *********************************************************************************************************************************************************** -->
		<!--sidebar start-->
		<aside>
			<div id="sidebar" class="nav-collapse ">
				<!-- sidebar menu start-->
				<ul class="sidebar-menu" id="nav-accordion">

					<p class="centered">
						<a href="profile.html"><img src="assets/img/ui-sam.jpg" class="img-circle" width="60"></a>
					</p>
					<h5 class="centered">Marcel Newman</h5>

					<li class="mt"><a href="${context}/info/adminInfo"> <i
							class="fa fa-desktop"></i> <span>신청현황</span>
					</a></li>
					
					<li class="active sub-menu"><a href="javascript:;"> 
						<i class="fa fa-cogs"></i> <span>일반 관리</span> </a>
						<ul class="sub">
							<li><a href="${context}/admin/team">팀 관리</a></li>
							<li><a href="${context}/admin/genre">장르 관리</a></li>
						</ul>
					</li>
					
					<li class="sub-menu"><a href="javascript:;"> 
						<i class="fa fa-cogs"></i> <span>시즌 관리</span> </a>
						<ul class="sub">
							<li><a href="${context}/admin/season">시즌 관리</a></li>
							<li><a href="${context}/admin/project">프로젝트 관리</a></li>
							<li><a href="${context}/admin/duescheck">회비 관리</a></li>
						</ul>
					</li>
					
					<li class="sub-menu"><a href="javascript:;"> 
						<i class="fa fa-cogs"></i> <span>회원 관리</span> </a>
						<ul class="sub">
							<li><a href="${context}/admin/user">회원 등급 관리</a></li>
							<li><a href="${context}/admin/grade">등급 관리</a></li>
						</ul>
					</li>

				</ul>
				<!-- sidebar menu end-->
			</div>
		</aside>
		<!--sidebar end-->
	</section>
	
	<section id="main-content">
		<section class="wrapper site-min-heigth">
			<h3><i class="fa fa-angle-right"></i> 신청 현황</h3>
			
			<section id="applyList" class="col-lg-12">
				<div class="row">
					<div class="col-md-12">
						<div class="content-panel">
							<h4><i class="fa fa-angle-right"></i> 신청 목록
								<select id="teamId" name="teamId" class="selectpicker ">
									<c:forEach items="${teamList}" var="team">
										<option value="${team.teamId}">${team.teamName}</option>
									</c:forEach>
								</select>
							</h4>
							
							<table class="table">
								<thead>
									<tr>
										<th>아이디</th>
										<th>이름</th>
										<th>연락처</th>
										<th>성별</th>
										<th>등급</th>
									</tr>
								</thead>
								
								<tbody>
									<c:forEach items="${userList}" var="user">
										<tr>
											<td>${user.userId}</td>
											<td>${user.userName}</td>
											<td>${user.phone}</td>
											<td>${user.gender}</td>
											<td>${user.gradeId}</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</section>
			
			<section id="genreRank" class="col-lg-6">
					<div class="row">
						<div class="panel panel-default">
							<div class="panel-heading">
								<h3 class="panel-title">
									<i class="glyphicon glyphicon-list"></i> 장르 랭크
								</h3>
							</div>
							<div class="panel-body">
								<table class="table table-striped">
									<thead>
										<tr>
											<th>순위</th>
											<th>장르 아이디</th>
											<th>장르 이름</th>
										</tr>
									</thead>
									
									<tbody>
										<c:forEach items="${genreRank}" var="rank">
											<tr>
												<td></td>
												<td>${rank.genreId}</td>
												<td>${rank.genreName}</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</section>
				
				<section id="userCnt" class="col-lg-6">
					<div class="row">
						<div class="panel panel-default">
							<div class="panel-heading">
								<h3 class="panel-title">
									<i class="glyphicon glyphicon-list"></i> 인원 정보
								</h3>
							</div>
							
							<div class="panel-body">
								<div class="list-group">
                                    <div class="list-group-item">
                                        <span class="badge">${manCount} / 10</span>
                                        <i class="fa fa-fw fa-comment"></i> 남자
                                    </div>
                                    <div class="list-group-item">
                                        <span class="badge">${wamanCount} / 10</span>
                                        <i class="fa fa-fw fa-comment"></i> 여자
                                    </div>
                                    <div class="list-group-item">
                                        <span class="badge">${totalCount} / 20</span>
                                        <i class="fa fa-fw fa-truck"></i> 총원
                                    </div>
                                    <div class="list-group-item">
                                        <span class="badge">${waitCount}</span>
                                        <i class="fa fa-fw fa-truck"></i> 대기
                                    </div>
                                </div>
							</div>
						</div>
					</div>
				</section>
		</section>
	</section>
						
	<!-- js placed at the end of the document so the pages load faster -->
	<script src="${context}/resources/js/jquery.js"></script>
	<script src="${context}/resources/js/jquery-3.2.1.js"></script>
	<script src="${context}/resources/js/bootstrap.min.js"></script>
	<script class="include" type="text/javascript" src="${context}/resources/js/jquery.dcjqaccordion.2.7.js"></script>
	<script src="${context}/resources/js/jquery.scrollTo.min.js"></script>
	<script src="${context}/resources/js/jquery.nicescroll.js" type="text/javascript"></script>
	<script src="${context}/resources/js/jquery.sparkline.js"></script>

	<!--common script for all pages-->
	<script src="${context}/resources/js/common-scripts.js"></script>

	<script type="text/javascript" src="${context}/resources/js/gritter/js/jquery.gritter.js"></script>
	<script type="text/javascript" src="${context}/resources/js/gritter-conf.js"></script>
	
</body>

</html>