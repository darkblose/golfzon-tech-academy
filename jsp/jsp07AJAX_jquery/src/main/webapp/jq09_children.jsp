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
.descendants * {
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

		$("div").children().css({
			"color" : "red",
			"border" : "2px solid red"
		});
		$("div").children("p:first").css({
			"color" : "blue",
			"border" : "2px solid blue"
		});
		$("div").children("p:first").append("<h1>Hello</h1>");
		$("div").children("p:last").after("<h1>Hello</h1>");

	});
</script>
</head>
<body>
	<div class="descendants" style="width: 500px;">
		div (current element)
		<p>
			p (child) <span>span (grandchild)</span>
		</p>
		<p>
			p (child) <span>span (grandchild)</span>
		</p>
	</div>


</body>
</html>