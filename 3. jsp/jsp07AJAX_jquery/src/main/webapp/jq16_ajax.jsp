<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="js/jquery-3.6.1.min.js"></script>
<!-- <script src="https://code.jquery.com/jquery-3.6.1.min.js"></script> -->
<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script> -->

<script>
	$(function() {
		console.log("ready....");

		$("#btn01").on("click",function(){
			console.log("click....");
			$.ajax({
				url:"jq16_temp.do",
				type:"post",
				data:{num:$("#num").val()},
				dataType:"json",//xml,html,text
				success : function(responseTxt,status,obj){
					console.log("ajax....",responseTxt);
					console.log("ajax....",status);
					console.log("ajax....",obj);
					
					$("#div1").text(responseTxt.name+":"+responseTxt.age);
				},
				error:function(xhr,status,error){
					console.log("error:function....",status);
				}
			});
			
		});
	});
</script>
</head>
<body>
	<div id="div1">
		<h2>Let jQuery AJAX Change This Text</h2>
	</div>
	<input type="number" id="num" value="11">
	<button id="btn01">Get External Content</button>


</body>
</html>