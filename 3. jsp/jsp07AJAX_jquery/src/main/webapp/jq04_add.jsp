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

<style type="text/css">
.myName {
	font-size: 30pt;
}
</style>
<script>
	$(function() {
		console.log("ready....");
		$("#btn1").click(function() {
			$("p").append(" <b>Appended text</b>.");
		});

		$("#btn2").click(function() {
			$("ol").append("<li>Appended item</li>");
		});

		$("#btn3").click(function() {
			$("p").prepend("<b>Prepended text</b>. ");
		});
		$("#btn4").click(function() {
			$("ol").prepend("<li>Prepended item</li>");
		});

		$("#btn_before").click(function() {
// 			$("img").before("<b>Before</b>");
			$("img").before("&nbsp;");
		});

		$("#btn_after").click(function() {
			$("img").after("<i>After</i>");
		});

	});

	function appendText() {
		var txt1 = "<p>Text.</p>"; // Create text with HTML
		var txt2 = $("<p></p>").text("Text."); // Create text with jQuery
		var txt3 = document.createElement("p");
		txt3.innerHTML = "Text."; // Create text with DOM
// 		$("body").append(txt1, txt2, txt3); // Append new elements
// 		$("body").after(txt1, txt2, txt3); // Append new elements
		$("img").after(txt1, txt2, txt3); // after new elements
	}
</script>
</head>
<body>
	<p>This is a paragraph.</p>
	<p>This is another paragraph.</p>

	<ol>
		<li>List item 1</li>
		<li>List item 2</li>
		<li>List item 3</li>
	</ol>

	<button id="btn1">Append text</button>
	<button id="btn2">Append list items</button>
	<button id="btn3">Prepend text</button>
	<button id="btn4">Prepend list item</button>

	<p>This is a paragraph.</p>
	<button onclick="appendText()">Append text</button>
	<br>
	<br>
	<img src="upload/img_0001.png" alt="jQuery" width="100">
	<br>
	<br>

	<button id="btn_before">Insert before</button>
	<button id="btn_after">Insert after</button>

</body>
</html>