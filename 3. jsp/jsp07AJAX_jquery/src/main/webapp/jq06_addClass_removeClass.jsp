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
.important {
	font-weight: bold;
	font-size: xx-large;
}

.blue {
	color: blue;
}
</style>
<script>
	$(function() {
		console.log("ready....");

		$("button:eq(0)").on("click",function(){
			$("h2").attr("class","blue");
// 			$("h1").addClass("blue");
			$("h1,h2,p").addClass("blue");
			$("div").addClass("important");
		});
		$("button:eq(1)").on("click",function(){
			$("h1,h2,p").removeClass("blue");
			$("div").removeClass("important");
		});
		$("button:eq(2)").on("click",function(){
			$("h1,h2,p").toggleClass("blue");
			$("div").toggleClass("important");
		});
	});
</script>
</head>
<body>
	<h1>Heading 1</h1>
	<h2>Heading 2</h2>

	<p>This is a paragraph.</p>
	<p>This is another paragraph.</p>

	<div>This is some important text!</div>
	<br>

	<button>Add classes to elements</button>
	<button>Remove classes to elements</button>
	<button>Toggle classes to elements</button>
</body>
</html>