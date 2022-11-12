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
		$("button").click(function() {
// 			$("#div1").remove();
			$("#div1").empty();
			
			$("#vos").empty();
			for (var i = 0; i < 10; i++) {
				$("#vos").append("<tr><td>aaa"+i+"</td><td>bbb"+i+"</td></tr>");	
			}
			
		});
		
		
		
		
	});
</script>
</head>
<body>
	<div id="div1"
		style="height: 100px; width: 300px; border: 1px solid black; background-color: yellow;">

		This is some text in the div.
		<p>This is a paragraph in the div.</p>
		<p>This is another paragraph in the div.</p>

	</div>
	<br>

	<button>Remove div element</button>
	
	<table>
		<thead><tr><th>name</th><th>age</th></tr></thead>
		<tbody id="vos">
			<tr><td>aaa1</td><td>aaa1</td></tr>
			<tr><td>aaa1</td><td>aaa1</td></tr>
			<tr><td>aaa1</td><td>aaa1</td></tr>
		</tbody>
		<tfoot><tr><td colspan="2">1 2 3</td></tr></tfoot>
	</table>
	
</body>
</html>