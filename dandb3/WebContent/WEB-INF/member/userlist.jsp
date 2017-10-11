<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
<title>회원가입</title>
<link rel= "Shortcut icon" href="/favicon.ico"/>
<script type="text/javascript">
$(function(){
	var idchecked = -1; //-1: 확인요망, 1:id 존재 0:사용가능
	
	$('#user_id').change(function(){
		idcheck = -1;
		$('#check_id_result').html('아이디중복체크를 하세요.')
	});
	$('#user_id').change(function(){
		idcheck = 0;
		$('#check_id_result').html('사용가능한 아이디 입니다.')
	});
	$('#user_id').change(function(){
		idcheck = 1;
		$('#check_id_result').html('이미 존재하는 회원입니다.')
	});
	
	$('check_id').click(function(){//아이디 중복체크처리
		
	});
	
	$('#regist_form').bind('click',function(){
		alert('test')
	});	
	
});
</script>
  <script>
 // 아이디 검색창 띄우기

function winOpen(){
  window.open("checkId.jsp","w","width=300, height=100, resizable=yes");
  /* 속성에 빈칸으로 구분했으면 계속 빈칸, 콤마로 구분했으면 계속 콤마
 // 1. 새창에 표시될 파일명
 // 2. 창이름: 없을 때도 "" 따옴표는 해줘야한다.
  // 이름이 없다면 팝업창이 계속 열린다. 이름이라는 것이 
 // 중복으로 띄움을 방지하도록 체크하는 역할
 // 3. 속성 width: 창너비, height: 창높이
      location: 주소표시줄, menubar: 메뉴표시
      resizable : 창의 크기조절여부
      scrollbars : 스크롤바 표시여부
      toolbar : 툴바표시여부
 // 속성은 yes / no 로 표시
 */
 }
  </script>
  
  
  <script language = "javascript">
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
   
/*    if(f.memberId.value != "idCheck"){
       alert("아이디 중복체크를 해주세요.");
       return false;
   } */

   if(f.memberPwd.value == "")
   {
    alert("비밀번호를 입력하세요")
    f.memberPwd.focus();
    return false;
   }
/*    if(f.memberPwdChk.value == "")
   {
    alert("비밀번호를 다시한번 입력해주세요")
    f.memberPwdChk.focus();
    return false;
   } */
 /*   if(f.memberPwd.value != f.memPwdChk.value) 
   {
    alert("비밀번호가 다릅니다.");
    f.memberPwd.value = ""; 
    f.memberPwdChk.value = ""; 
    f.memberPwd.focus(); 
    return false;
   } */
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
   /* if (document.frm.memHobby.value == "" )
   {
    alert("취미를 선택해주세요")
    return false;
   } 체크박스값 체크여부 확인방법?? */

  f.submit(); // 버튼으로 쓸 땐 return true; 대신 이걸 쓰고 form시작 구문에 onsubmit="return memChk()" 는 불필요하여 삭제

 } 
  </script>
</head>
<body>
<h2>회원가입</h2></br>
 

<form action="memberInsertAction" method="post" name="frm"> 

<table> <!-- cellpadding과 cellspacing 값을 0으로 초기화 해주지 않으면 테이블내부의 행/열 간 간격이 벌어진다. -->
 <caption >
*표시 항목은 필수 입력 항목입니다.</caption>
  <tr>
   <td>아&nbsp;이&nbsp;디&nbsp;</td>
   <td >  
    <input type="text" name="memberId" size="16">&nbsp;&nbsp;
    <input type="button" value="ID중복검사" onClick="winOpen()"><br>
    <div id="check_id_result"> </div>  
    아이디는 영문,숫자 조합으로 하셔야 합니다.[4자리이상 12자리이하]<br>
    아이디는 소문자로 저장 됩니다.
   </td> <!-- 중복검사............ㅡ,.ㅡa -->

  </tr>

 <tr>
   <td>암....호&nbsp;</td>

   <td>
    <input type="password" name="memberPwd" ><br>
    <font id="s">비밀번호는 4자리이상 12자리이하로 입력해주세요.</font>
   </td> <!-- 비밀번호 문자와 숫자 혼합사용 체크....? -ㅅ-a -->
  </tr>

 <tr>
   <td>암호확인&nbsp;</td>

   <td>
    <input type="password" name="memberPwdchk" size="16">
   </td>
  </tr> 

 <tr>
   <td>이&nbsp름&nbsp;</td>
   <td>
   <input type="text" name="memberName">
   </td>
  </tr>

  <tr>
   <td>생년월일&nbsp;</td>
   <td>
   <input type="text" name="birthday" size="8" maxlength="8"></br>
   ex)19920611
 </tr> <!-- 주민번호 입력에 따른 생년월일 적용 체크 -.-a -->

 <tr>
   <td>성....별&nbsp;</td>
   <td>
   <input type="radio" name="gender" value="man">남자&nbsp;
   <input type="radio" name="gender" value="woman">여자
 </tr> <!-- 주민번호 입력에 따른 남녀 성별 체크 -.-a -->

 <tr>
   <td >E - mail&nbsp;</td>
   <td>
    <input type="text" name="email" size="28">
   </td>
  </tr>

 <tr>
   <td>메일수신&nbsp;</td>
   <td>
    <input type="radio" name="memEmailYes" value="mailYes" checked>수신동의&nbsp;
    <input type="radio" name="memEmailNo" value="mailNo">수신거부
  </td> <!-- 이메일 검사...-.-? -->
  </tr>



 <tr>
   <td>핸 드 폰&nbsp;</td>
   <td>
    <select name="memMobile01">
    <option value="010">010</option>
    <option value="011">011</option>
    <option value="016">016</option>
    <option value="017">017</option>
    <option value="019">019</option>
    <option value="070">070</option>
    </select>-
   <input type="text" name="memMobile02" size="5" maxlength="4">
    -
    <input type="text" name="memMobile03" size="5" maxlength="4"> 
    <input type="hidden" name="phone" />
   </td> <!-- 숫자만 입력가능?? -.-a -->
  </tr>
  
 
  <tr>
  <td>본인 사진 업로드</td>
  <td>
  <input name= "pictureUrl" type = "file" >
  </td>
</tr>
 
 
 <tr>
   <td>자기소개&nbsp;</td>
   <td>
    <textarea name="memIntro" rows="4" cols="65"></textarea>
   </td>
  </tr>
   <tr>
   <td>개인정보 동의 &nbsp;</td>
   <td>
   회원님의 개인정보는 댄스플동아리카페에서 회원수집 목적으로만 사용됩니다.
    <input type="radio" name="yes" value="yes">동의&nbsp;
   <input type="radio" name="no" value="no">거부
</td>
  

 <tr>
   <td>
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
    <font>...</font>
    <input type="reset" value="취소">
   </td>
  </tr>
 </table>
 </form>
</body>
</html>