<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css" />">
<link rel="stylesheet" href="<c:url value="/resources/css/bubbles.css" />">
<script src="<c:url value="/resources/js/jquery-3.2.1.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<title>Insert title here</title>
<link rel="shortcut icon" href="/favicon.ico" />
<script type="text/javascript">
$(document).ready(function(){
	ajax_process("");
	
	$('#txt_isay').keypress(function(e){
		if (e.which === 13){
			conversation();
		}
	});
	
	$('#btn_isay').click(function(){
		conversation();
	});
});

function conversation() {
	var _isay = $.trim($('#txt_isay').val());

	var isay = '<h4 class="triangle-border right"><b>' + _isay + '</b></h4>';
	$('#said').append(isay);
	$('#txt_isay').val('');
	ajax_process(_isay);
}

function ajax_process(_isay){
	$.ajax({
		type : 'POST',
		url  : 'watsonsay',
		data : 'isay=' + encodeURIComponent(_isay),
		async: false,
		success : function(data) {
			console.log(data);
			var watsonsay =
				'<h4 class="triangle-border left"><b>' + data.output.text;
				
			if (data.context.image!=='') {
				watsonsay += '<br/><img src="resources/img/'+data.context.image+'.png" width="530" />';
			}	
			
			if(data.context.system.dialog_turn_counter !== 1.0){
				watsonsay += '<br/>Your Score : '+data.context.score;
			}

			if(data.context.image ==='end'){
				
				if(data.context.score <=200){
					watsonsay += '<br/><img src="resources/img/mosoll.jpg" width="530" />';

				}else if(data.context.score >= 200){
					watsonsay += '<br/><img src="resources/img/clear.png" width="530" />';
				}
			}
			
			watsonsay += '</b></h4>';
			$('#said').append(watsonsay);	
			$('html, body').animate({scrollTop: $(document).height()}, 500);
			
		}
	});
}
</script>
</head>
<body>
<div id="said"></div>
<input type="text" id="txt_isay" class="triangle-border center" />
<button type="button" id="btn_isay" autofocus="autofocus" class="btn btn-default">전송</button>
</body>
</html>