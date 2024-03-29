<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
					
					<li class="sub-menu"><a href="javascript:;"> 
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
				<div class="row">
					<div class="col-md-12">
						<div class="content-panel">
							<h4><i class="fa fa-angle-right"></i> 시즌 목록
								<a href="${context}/manage/seasonInsert"class="btn btn-default"><i class="fa fa-pencil"></i> Add</a>
							</h4>
							<table class="table">
								<thead>
									<tr>
										<th>시즌 아이디</th>
										<th>시즌 월</th>
										<th>시작 날짜</th>
										<th>종료 일</th>
										<th>프로젝트 아이디</th>
									</tr>
								</thead>
	
								<tbody>
									<c:forEach items="${seasonList}" var="season">
										<tr>
											<td>${season.seasonId}</td>
											<td>${season.snMonth}</td>
											<td>
												<fmt:parseDate value="${season.startDate}" var="startDate" pattern="yyyy-MM-dd HH:mm:ss"/>
												<fmt:formatDate value="${startDate}" pattern="yyyy/MM/dd"/>
											</td>
											<td>
												<fmt:parseDate value="${season.endDate}" var="endDate" pattern="yyyy-MM-dd HH:mm:ss"/>
												<fmt:formatDate value="${endDate}" pattern="yyyy/MM/dd"/>
											</td>
											<td>${season.projectNo}</td>
											<td>
												<a href="${context}/manage/seasonUpdate?seasonId=${season.seasonId}" class="btn btn-primary btn-xs"><i class="fa fa-pencil"></i></a>  
												<a href="${context}/manage/seasonDelete?seasonId=${season.seasonId}" class="btn btn-danger btn-xs"><i class="fa fa-trash-o "></i></a>
											</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>
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
