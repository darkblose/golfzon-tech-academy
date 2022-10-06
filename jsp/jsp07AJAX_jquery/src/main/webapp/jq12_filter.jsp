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

		// 		$("div:first").css("background-color", "yellow");
		// 		$("div").first().css("background-color", "yellow");
		// 		$("div:eq(0)").css("background-color", "yellow");
		$("div").eq(0).css("background-color", "yellow");

		// 		$("div").last().css("background-color", "blue");
		$("div:eq(-1)").css("background-color", "blue");
		// 		$("div").eq(-1).css("background-color", "blue");

// 		$("p.intro").css("background-color", "gold");
		$("p").filter(".intro").css("background-color", "gold");
// 		$("p").not(".intro").css("background-color", "yellow");
		$("p").not(".intro").not("div *").css("background-color", "yellow");
	});
</script>
</head>
<body>

	<h1>Welcome to My Homepage</h1>

	<p>This is a paragraph.</p>

	<div style="border: 1px solid black;">
		<p>A paragraph in a div.</p>
		<p>Another paragraph in a div.</p>
	</div>
	<br>

	<div style="border: 1px solid black;">
		<p>A paragraph in another div.</p>
		<p>Another paragraph in another div.</p>
	</div>
	<br>

	<div style="border: 1px solid black;">
		<p>A paragraph in another div.</p>
		<p>Another paragraph in another div.</p>
	</div>

	<p>My name is Donald.</p>
	<p class="intro">I live in Duckburg.</p>
	<p class="intro">I love Duckburg.</p>
	<p>My best friend is Mickey.</p>

</body>
</html>