<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel = "shortcut icon" href="../favicon.ico" />
<script type="text/javascript" src="script/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
$(function(){
   $('#btnClass').click(function() {
      $.getJSON('data.js', function(data){
         var items = [];
         $.each(data, function(key, val){
            items.push(
                  '<li id="' + key + '">' +
                  val['no'] + ":" + 
                  val['name'] + ":" + 
                  val['say'] + "</li>");
         });
         $('#rcvMSG').append(items);
      });
   });
});
</script>
</head>
<body>
<input type="button" id="btnClass" value="get" />
<hr/>
<ul type="square">
<div id="rcvMSG"></div> 
</ul>


</body>
</html>