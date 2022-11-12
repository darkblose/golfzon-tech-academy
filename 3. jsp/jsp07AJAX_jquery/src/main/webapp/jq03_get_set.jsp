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

		//text
		console.log($("#title").text());//get
		$("#title").text("HTML h3");//set

		//value
		console.log($("#searchWord").val());//get
		$("#searchWord").val("HTML h3");//set

		//html
		console.log($("#content").text());//get
		console.log($("#content").html());//get
		$("#content").html("<h1>BIG</h1>");

		let trs = "<tr><td>aaa1</td><td>bbb1</td></tr>";
		trs += "<tr><td>aaa2</td><td>bbb2</td></tr>";
		$("#vos").html(trs);

		//attribute value
		console.log($("h2").attr("class"));//get
		$("h1").attr("class", "myName");

		$("button").click(function() {
			$("#w3s").attr("href", "https://www.w3schools.com/jquery/");
		});

	});
</script>
</head>
<body>
	<h3 id="title">jquery1</h3>
	<form action="index.jsp" id="frm">
		<input type="text" id="searchWord" value="jq1"> <input
			type="text" id="searchWord2" value="jq2"> <input
			type="checkbox" id="hobby1" value="hobby1">hobby1 <select
			id="searchKey">
			<option value="name">name</option>
			<option value="age">age</option>
		</select> <input type="submit">
	</form>
	<div id="content">
		<h2>Hello</h2>
		<p>javascript!!!~~!!</p>
	</div>
	<table id="vos">
	</table>

	<h2 class="myName">yangssem1</h2>
	<h1>yangssem2</h1>

	<p>
		<a href="https://www.w3schools.com" id="w3s">W3Schools.com</a>
	</p>

	<button>Change href Value</button>

	<p>Mouse over the link (or click on it) to see that the value of
		the href attribute has changed.</p>

</body>
</html>