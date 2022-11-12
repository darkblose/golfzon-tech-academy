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
// 			$("#div1").load("jq13_temp.txt");
// 			$("#div1").load("jq13_temp.do");
// 			$("#div1").load("jq13_temp.do #p1");
			$("#div1").load("jq13_temp.do",function(x,y,z){
				console.log("load....",x);
				console.log("load....",y);
				console.log("load....",z);
			});
			
		});
	});
</script>
</head>
<body>
	<div id="div1">
		<h2>Let jQuery AJAX Change This Text</h2>
	</div>

	<button id="btn01">Get External Content</button>


</body>
</html>