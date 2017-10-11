<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Danceple - Template</title>
    
<script type="text/javascript">
function changepage(page){
    //alert(page);
    location.href="viewinfo?page="+page;
}
</script>

	<link rel="shortcut icon" href="../favicon-32x32.png" />
	
	<!-- Bootstrap Core CSS -->
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="<c:url value="/resources/css/sb-admin.css" />" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="<c:url value="/resources/css/plugins/morris.css" />" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="<c:url value="/resources/font-awesome/css/font-awesome.min.css" />" rel="stylesheet" type="text/css">
    
    <!-- jQuery -->
    <script src="<c:url value="/resources/js/jquery.js" />"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

	<!-- Morris Charts JavaScript -->
	<script src="<c:url value="/resources/js//plugins/morris/raphael.min.js" />"></script>
	<script src="<c:url value="/resources/js//plugins/morris/morris.min.js" />"></script>
	<script src="<c:url value="/resources/js//plugins/morris/morris-data.js"/>"></script>
    
</head>
<body>
	
	<div id="wrapper">

        <!-- Navigation -->
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="../index.jsp">Danceple</a>
            </div>
            <!-- Top Menu Items -->
            <ul class="nav navbar-right top-nav">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> John Smith <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li>
                            <a href="#"><i class="fa fa-fw fa-user"></i> Profile</a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-fw fa-envelope"></i> Inbox</a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-fw fa-gear"></i> Settings</a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#"><i class="fa fa-fw fa-power-off"></i> Log Out</a>
                        </li>
                    </ul>
                </li>
            </ul>
            <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav side-nav">
                    <li class="active">
                        <a href="/menu"><i class="fa fa-fw fa-edit"></i> Info Page(도영)</a>
                    </li>
                    <li>
                        <a href="../manage/menu"><i class="fa fa-fw fa-edit"></i> Manage Page(주연)</a>
                        <ul id="manage" class="collapse in" aria-expanded="true">
							<li><a href="../manage/menu#team">팀 관리</a></li>
							<li><a href="../manage/menu#genre">장르 관리</a></li>
							<li><a href="../manage/menu#grade">등급 관리</a></li>
						</ul>
                    </li>
                    <li>
                        <a href="../apply/insertApply"><i class="fa fa-fw fa-edit"></i> Apply Page(현정)</a>
                    </li>
                    <li>
                        <a href="../member/menu"><i class="fa fa-fw fa-edit"></i> Member Page(민철)</a>
                        <ul id="member" class="collapse in" aria-expanded="true">
							<li><a href="../member/login">로그인</a></li>
							<li><a href="../member/memberInsert">회원가입</a></li>
						</ul>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </nav>

        <div id="page-wrapper">

            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">
                            신청 현황
                            <small>페이지 입니다.</small>
                        </h1>
                    </div>
                </div>
                <!-- /.row -->
                
                <section id="apply">
					<div class="row">
						<div class="col-lg-12">
							<div class="panel panel-default">
								<div class="panel-heading">
									<h3 class="panel-title">
										<i class="glyphicon glyphicon-list"></i> 신청 목록
									</h3>
									
									<select id="teamId" name="teamId" class="selectpicker">
										<c:forEach items="${teamList}" var="team">
											<option value="${team.teamId}">${team.teamName}</option>
										</c:forEach>
									</select>
								</div>
								
								<div class="panel-body">
									<table class="table table-striped">
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
													<td>${user.userPhone}</td>
													<td>${user.gender}</td>
													<td>${user.gradeId}</td>
												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
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
						
            </div>
            <!-- /.container-fluid -->

        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->
	
<!-- 
<td width="75%" valign="center">
   <select id="teamlist" onchange="changepage(value)">
   <c:forEach var="team" items="${teamlist}" varStatus="status">
    <c:choose>
        <c:when test="${status.index == page}">
            <option value="${status.index}" selected="selected">${team.teamName }</option>
        </c:when>
        <c:otherwise>
            <option value="${status.index}">${team.teamName }</option>
        </c:otherwise>
        
        </c:choose>
   </c:forEach>
   </select>
   
   </td>
    <table>
        <caption>게시물 리스트</caption>
        <thead>
            <tr>
                <th scope="cols">이름</th>
                <th scope="cols">아이디</th>
                <th scope="cols">성별</th>
                <th scope="cols">등급</th>
                <th scope="cols">핸드폰</th>
                
            </tr>
        </thead>
        <c:forEach var="mem" items="${memlist}">
        <tr>
          <td>${mem.name}</td>
          <td>${mem.userID}</td>
          <td>${mem.gender}</td>
          <td>${mem.gradeId}</td>
          <td>${mem.phone}</td>
        </tr>
        </c:forEach>
    </table>
    <table>
       <tr><td>장르</td></tr>
       <c:forEach var="app" items="${applist }">
       <tr>
           <td>${app.teamId} / ${app.userId}/ ${app.genre1}/ ${app.genre2}/ ${app.genre3}</td>
       </tr>
       </c:forEach>
    </table>
    -->
</body>
</html>