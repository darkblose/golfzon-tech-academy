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
<style>
.siblings * {
	display: block;
	border: 2px solid lightgrey;
	color: lightgrey;
	padding: 5px;
	margin: 15px;
}
</style>
<script>
	$(function() {
		console.log("ready....");

		//대상의 앞뒤요소들 모두찾은 함수
// 		$("h2").siblings().css({
// 			"color" : "red",
// 			"border" : "2px solid red"
// 		});
		
// 		$("h2").prev().css({
// 			"color" : "blue",
// 			"border" : "2px solid blue"
// 		});
// 		$("h2").prevAll().css({
// 			"color" : "blue",
// 			"border" : "2px solid blue"
// 		});
		$("h2").prevUntil("h5").css({
			"color" : "blue",
			"border" : "2px solid blue"
		});
		
// 		$("h2").next().css({
// 			"color" : "green",
// 			"border" : "2px solid green"
// 		});
// 		$("h2").nextAll().css({
// 			"color" : "green",
// 			"border" : "2px solid green"
// 		});
		
		$("h2").nextUntil("h6").css({
			"color" : "gold",
			"border" : "2px solid gold"
		});

	});
</script>
</head>
<body class="siblings">

	<div>
		div (parent)
		<p>p</p>
		<h5>bbbbbb</h5>
		<span>span</span>
		<span>span</span>
		<span>span</span>
		<h2>h2</h2>
		<h3>h3</h3>
		<p>p</p>
		<h3>h3</h3>
		<p>p</p>
		<h3>h3</h3>
		<p>p</p>
		<h6>aaaaa</h6>
		
	</div>

</body>
</html>