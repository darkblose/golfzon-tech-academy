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
#div1 {
	height: 100px;
	width: 300px;
	padding: 10px;
	margin: 3px;
	border: 1px solid blue;
	background-color: lightblue;
}
</style>
<script>
	$(function() {
		console.log("ready....");

		console.log($("#div1").width(),$("#div1").height());
		console.log($(document).width());
		console.log($(window).width());
		console.log("innerWidth:",$("#div1").innerWidth());

		$("button").click(function() {
// 			$("#div1").width(350);
// 			$("#div1").height(200);
			$("#div1").width(350).height(200);
		});

	});
</script>
</head>
<body>
	<div id="div1">

		This is some text in the div.
		<p>This is a paragraph in the div.</p>
		<p>This is another paragraph in the div.</p>

	</div>
	<br>

	<button>Remove div element</button>



</body>
</html>