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
						<a href="profile.html"><img src="${context}/resources/img/ui-sam.jpg" class="img-circle" width="60"></a>
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
		<section class="wrapper">
			<h3><i class="fa fa-angle-right"></i> 장르 관리</h3>
			<div class="row mt">
				<div class="col-lg-12">
					<div class="form-panel">
						<h4 class="mb"><i class="fa fa-angle-right"></i> Delete Genre</h4>
						<form action="genreDeleteAction" method="post" class="form-horizontal style-form">
						
							<div class="form-group">
								<label class="col-lg-2 col-sm-2 control-label"> 장르 아이디 </label>
                                
                                <div class="col-lg-10">
                                	<p class="form-control-static">${genreVO.genreId}</p>
                                	<input type="hidden" id="genreId" name="genreId" value="${genreVO.genreId}">
                                </div>
                            </div>
						
							<div class="form-group">
								<label class="col-lg-2 col-sm-2 control-label"> 장르 이름 </label>
                                
                                <div class="col-sm-10">
									<p class="form-control-static">${genreVO.genreName}</p>
								</div>
							</div>
						
							<div class="form-group">
								<div class="col-sm-2">
									<button type="submit" class="btn btn-danger">Delete</button>
								</div>
							</div>
						</form>
					</div>
                </div>
    		</div>
   		</section>
   </section>
   
   <!-- js placed at the end of the document so the pages load faster -->
    <script src="${context}/resources/js/jquery.js"></script>
    <script src="${context}/resources/js/bootstrap.min.js"></script>
    <script class="include" type="text/javascript" src="${context}/resources/js/jquery.dcjqaccordion.2.7.js"></script>
    <script src="${context}/resources/js/jquery.scrollTo.min.js"></script>
    <script src="${context}/resources/js/jquery.nicescroll.js" type="text/javascript"></script>


    <!--common script for all pages-->
    <script src="${context}/resources/js/common-scripts.js"></script>

    <!--script for this page-->
    <script src="${context}/resources/js/jquery-ui-1.9.2.custom.min.js"></script>
    
    
</body>

</html>
