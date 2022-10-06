<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setAttribute("kor", 99);
%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="js/jquery-3.6.1.min.js"></script>
<!-- <script src="https://code.jquery.com/jquery-3.6.1.min.js"></script> -->
<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script> -->
<script>
	console.log("jquery....",${3*4});// EL도 사용가능.
	
	let sum = ${3*4};
	console.log("sum:",sum);
	
	let x_kor = ${kor};//number 99
	console.log("x_kor:",x_kor);
	
	x_kor = '${kor}';//string 99
	console.log("x_kor:",x_kor);
	
	$(function(){
		console.log("ready....");
// 		console.log($("*"));
		console.log($("body"));
				
		let interval_id;
		$("#btn_on").click(function(){
			console.log("click...btn_on");
			let bool = true;
			interval_id = setInterval(function(){
				console.log("setInterval...",bool);
				let bg_color = "red"; 
				if(bool){
					bg_color = "red"; 
				}else{
					bg_color = "blue"; 
				}
				
				$("body").css("background",bg_color);
				
				bool = !bool;
			},1000);
		});//id btn_on
		$("#btn_off").click(function(){
			console.log("click...btn_off");
			clearInterval(interval_id);
		});//id btn_off
		
		
	});
	
	
</script>
</head>
<body>
	<h3>jquery</h3>
	<button id="btn_on">배경색 점등깜빡이기</button>
	<button id="btn_off">배경색 점등끄기</button>
</body>
</html>