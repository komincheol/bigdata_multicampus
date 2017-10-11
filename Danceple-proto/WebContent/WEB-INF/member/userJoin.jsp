<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<script src="<c:url value="/resources/js/jquery-3.2.1.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<title>Danceple - Template</title>

<link rel="Shortcut icon" href="/favicon.ico" />

<!-- Bootstrap Core CSS -->
<link href="../css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="../css/sb-admin.css" rel="stylesheet">

<!-- Morris Charts CSS -->
<link href="../css/plugins/morris.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="../font-awesome/css/font-awesome.min.css" rel="stylesheet"
	type="text/css">

<script  type="text/javascript">

	$(document).ready(function(){
		var idchecked = -1;	// -1:확인요망, 1:id존재함, 0:사용가능
		
		$('#memberId').change(function(){	// 아이디 중복 체크 메시지
			idcheck = -1;
			$('#check_id_result').html('아이디 중복체크를 하세요');
		});
		
		$('#memberId').click(function(){	// 아이디 중복 체크 처리
			var memberId = $('#memberId').val().trim();
		
			if (memberId === '') {
				alert('체크할 아이디를 입력하세요');
				$('#memberId').focus();
				return;
			}
			
			$.getJSON('checkID',{"memberId":memberId},
				function(data){
					console.log(data);
					console.log('id  : ' + data.id);
					console.log('cnt : ' + data.cnt);
					console.log('msg : ' + data.msg);
					$('#check_id_result').html(data.msg);
					idchecked = 0;
				});
		});
		
		$('#user_form').bind('submit',function(){	// 회원가입 완료 처리
			if ($('#memberId').val().length === 0) {
				alert('가입할 아이디를 입력하세요');
				$('#memberId').focus();
				return false;
				
			});
});
</script>


<script language="javascript">
 function memChk() // 데이터 입력유무 확인 스크립트
{
   var f = document.frm;
 
   f.phone.value = f.memMobile01.value + f.memMobile02.value + f.memMobile03.value;
   
   if(f.memberId.value == "")
   {
    alert("아이디를 입력하세요")
    f.memberId.focus();
    return false;
   }
   


   if(f.memberPwd.value == "")
   {
    alert("비밀번호를 입력하세요")
    f.memberPwd.focus();
    return false;
   }
  if(f.memberPwdchk.value == "")
   {
    alert("비밀번호를 다시한번 입력해주세요")
    f.memberPwdChk.focus();
    return false;
   } 
if(f.memberPwd.value != f.memberPwdchk.value) 
   {
    alert("비밀번호가 다릅니다.");
    f.memberPwd.value = ""; 
    f.memberPwdChk.value = ""; 
    f.memberPwd.focus(); 
    return false;
   } 
   
   if(f.memberName.value == "")
   {
    alert("이름이 없는건가..") 
    f.memberName.focus(); 
    return false;
   }


   if(f.birthday.value == "" )
   {
    alert("생년월일을 입력하세요.") 
    f.birthday.focus(); 
    return false;
   }
   /* if(document.frm.memSung.value == "")
   {
    alert("성별을 선택하세요") 
    return false; 
   } 라디오버튼값 체크 유무 확인 방법??*/
   if(f.email.value == "")
   {
    alert("이메일을 입력하세요") 
    f.email.focus(); 
    return false;
   }
   // 메일 수신은 수신동의 selected
   
   if (f.memMobile01.value == "Not")
   {
    alert("핸드폰번호를 선택하세요")
    return false;
   }
   if (f.memMobile02.value == "")
   {
    alert("핸드폰번호를 입력하세요")
   f.memMobile02.focus();
    return false;
   }
   if (f.memMobile03.value == "")
   {
    alert("핸드폰번호를 입력하세요")
    f.memMobile03.focus();
    return false;
   }

		   if (f.imgUrl.value == "")
				   {
				    alert("사진을 등록하세요")
				    f.imgUrl.focus();
				    return false;
				   }
  f.submit(); // 버튼으로 쓸 땐 return true; 대신 이걸 쓰고 form시작 구문에 onsubmit="return memChk()" 는 불필요하여 삭제

 } 
  </script>
</head>
<body>

	<div id="wrapper">

		<!-- Navigation -->
		<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
			<!-- Brand and toggle get grouped for better mobile display -->
			<!-- 왼쪽 위 Danceple-->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-ex1-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="../index.jsp">Danceple</a>
			</div>
			<!-- Top Menu Items -->
			<ul class="nav navbar-right top-nav">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"><i class="fa fa-user"></i> John Smith <b
						class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="#"><i class="fa fa-fw fa-user"></i> Profile</a>
						</li>
						<li><a href="#"><i class="fa fa-fw fa-envelope"></i>
								Inbox</a></li>
						<li><a href="#"><i class="fa fa-fw fa-gear"></i> Settings</a>
						</li>
						<li class="divider"></li>
						<li><a href="#"><i class="fa fa-fw fa-power-off"></i> Log
								Out</a></li>
					</ul></li>
			</ul>
			<!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav side-nav">
                    <li>
                        <a href="../info/menu"><i class="fa fa-fw fa-edit"></i> Info Page(도영)</a>
                    </li>
                    <li>
                        <a href="../manage/menu"><i class="fa fa-fw fa-edit"></i> Manage Page(주연)</a>
                        <ul id="manage" class="collapse in" aria-expanded="true">
							<li><a href="../manage/menu#team">팀 관리</a></li>
							<li><a href="../manage/menu#grere">장르 관리</a></li>
							<li><a href="../manage/menu#grade">등급 관리</a></li>
						</ul>
                    </li>
                    <li>
                        <a href="../apply/insertApply"><i class="fa fa-fw fa-edit"></i> Apply Page(현정)</a>
                    </li>
                    <li class="active">
                        <a href="menu"><i class="fa fa-fw fa-edit"></i> Member Page(민철)</a>
                        <ul id="member" class="collapse in" aria-expanded="true">
							<li><a href="login">로그인</a></li>
							<li class="active"><a href="memberInsert">회원가입</a></li>
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
						<h3 class="page-header">
							회원가입 <small>*표시 항목은 필수 입력 항목입니다.</small>
						</h3>
					</div>
				</div>
				<!-- /.row -->

				<div class="row">
					<div class="col-lg-7">
						<div class="col-lg-12">
							<form id="user_form" action="memberInsertAction" method="post" name="frm">
								<div class="form-group">
									<div class="col-lg-2">
										<label>아이디</label> 
									</div>
									
									<div class="col-lg-8">
										<input type="text" id= "memberId"name="memberId" class="form-control">  
									</div>
									
									<div class="col-lg-2">
									<input type="button" id="check_id" value="아이디 중복 체크" autofocus="autofocus" onClick="winOpen()" />
									<span id="check_id_result"></span>
									</div>
									</br>
									<p class="help-block">
										아이디는 영문,숫자 조합으로 하셔야 합니다.[4자리이상 12자리이하]<br> 아이디는 소문자로 저장
										됩니다.
									</p>
								</div>

								<div class="form-group">
									<div class="col-lg-2">
										<label>비밀번호</label>
									</div>
									
									<div class="col-lg-10">
										<input type="password" name="memberPwd" class="form-control">
									</div>
									
									<p class="help-block">비밀번호는 4자리이상 12자리이하로 입력해주세요.</p>
									<!-- 비밀번호 문자와 숫자 혼합사용 체크....? -ㅅ-a -->
								</div>

								<div class="form-group">
									<div class="col-lg-2">
										<label>비밀번호 확인</label>
									</div>
									
									<div class="col-lg-10">
										<input type="password" name="memberPwdchk" class="form-control">
									</div>
								</div>

								<div class="form-group">
									<div class="col-lg-2">
										<label>이름</label>
									</div>
									
									<div class="col-lg-10">
										<input type="text" name="memberName" class="form-control">
									</div>
								</div>

								<div class="form-group" >
									<div class="col-lg-2">
										<label>생년월일</label>
									</div>
									
									<div class="col-lg-10">
										<input type="text" name="birthday" maxlength="8" class="form-control">
									</div>
									
									<p class="help-block">ex)19920611</p>
								</div>
								<!-- 주민번호 입력에 따른 생년월일 적용 체크 -.-a -->

								<div class="form-group" >
									<div class="col-lg-2">
										<label>성별</label>
									</div>
									<div class="col-lg-10">
										<label class="radiobox"><input type="radio" name="gender" value="man">남자</label>
										<label class="radiobox"><input type="radio" name="gender" value="woman">여자</label>
									</div>
								</div>

								<div class="form-group" >
									<div class="col-lg-2">
										<label>E - mail</label>
									</div>
									<div class="col-lg-10">
										<input type="text" name="email" class="form-control">
									</div>
								</div>

								<div class="form-group" >
									<div class="col-lg-2">
										<label>메일수신</label>
									</div>
									<div class="col-lg-10">
										<label class="radiobox"><input type="radio" name="memEmailYes" value="mailYes" checked>수신동의</label> 
										<label class="radiobox"><input type="radio" name="memEmailNo" value="mailNo">수신거부</label>
									</div>
								</div>

								<div class="form-group" >
									<div class="col-lg-2">
										<label>핸드폰</label>
									</div>
									<div class="col-lg-10">
										<select name="memMobile01"
											class="selectpicker">
											<option value="010">010</option>
											<option value="011">011</option>
											<option value="016">016</option>
											<option value="017">017</option>
											<option value="019">019</option>
											<option value="070">070</option>
										</select>
										- <input type="text" name="memMobile02" size="5" maxlength="4">
										- <input type="text" name="memMobile03" size="5" maxlength="4">
										
										<input type="hidden" name="phone" />
									</div>
								</div>
								<!-- 숫자만 입력가능?? -.-a -->

								<div class="form-group" >
									<div class="col-lg-2">
										<label>사진 업로드</label>
									</div>
									<div class="col-lg-10">
									  <input name= "imgUrl" type = "file" >
									</div>
								</div>
								</div>

								<div class="form-group" >
									<div class="col-lg-2">
										<label>자기소개</label>
									</div>
									<div class="col-lg-10">
										<textarea name="memIntro" class="form-control"></textarea>
									</div>
								</div>

								<div class="form-group" >
									<div class="col-lg-12">
										<label>개인정보 동의</label>
									</div>
									<div class="col-lg-10">
										<p class="navbar-text">회원님의 개인정보는 댄스플동아리카페에서 회원수집 목적으로만 사용됩니다.</p>
									</div>
									<div class="col-lg-2">
										<label class="radiobox"><input type="radio" name="yes" value="yes" checked>동의</label>
										<label class="radiobox"><input type="radio" name="no" value="no">거부</label>
									</div>
								</div>

								<div class="form-group" >
									<div class="col-lg-12">
										<input type="button" value="등록" onclick="memChk()">
										<!-- 핸드폰까지 입력 후 등록버튼을 누르면
												   함수의 액션(action="#")이 실행되어 버린다.
												    #이 실행되면 reset이 됨...;
												    이유인즉 직업은 필수 선택이 아니고
												   취미에 체크박스의 선택 유무를 따져 value값을
												   넘겨받아 메시지를 띄우는 방법을 모르기 때문...
												    인터넷을 찾아봐도 무슨말인지 영 모르겠다;;
												    그래서 onClick="memChk()" 을 빼야 중간에 리셋이 안되지만
												   그렇다고 빼면 데이터 입력유무값이 체크가 안된다... 
												   알게 되면 추가하여 올릴예정!-->
										<input type="reset" value="취소">
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>

			</div>
			<!-- /.container-fluid -->

		</div>
		<!-- /#page-wrapper -->

	</div>
	<!-- /#wrapper -->

	<input type="button" value="등록" onclick="memChk()">



	<!-- jQuery -->
	<script src="../js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="../js/bootstrap.min.js"></script>

	<!-- Morris Charts JavaScript -->
	<script src="../js/plugins/morris/raphael.min.js"></script>
	<script src="../js/plugins/morris/morris.min.js"></script>
	<script src="../js/plugins/morris/morris-data.js"></script>

</body>
</html>