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
	$(function(){
		console.log("ready....");
		let h3s = $("h3");
		console.log(h3s);
		console.log(h3s[0]);
		
		let colors = ['red','green','blue','gray'];
		
		h3s.each(function(index){
// 			console.log($(this).text());
			$(this).click(function(){
				console.log($(this).text());
// 				console.log(index);
// 				console.log($(this).text("red"));
				console.log($(this).text(colors[index]));
				console.log($(this).css("background",colors[index]));
			});
			
		});
		
		let btns = $(".btn");
		let p_txts = $(".p_txt");
		btns.each(function(index){
			$(this).click(function(){
// 				$(p_txts[index]).css("background","green");
// 				$($(".p_txt")[index]).css("background","green");
				$(".p_txt:eq("+index+")").css("background","green");
				
			});
		});
		
// 		let p0 = $(".p_txt:eq(0)");
		let p0 = $(".p_txt:first");
		p0.click(function(){
			$(this).css("font-size","30pt");
		});
		
		let a_choices = $(".a_choice");
		a_choices.each(function(index){
			$(this).click(function(){
				console.log(index);
				$($("ul li")[index]).css("font-size","20pt");
				$("ol").show();
				return false;
			});
		});
		
		$("#a_temp").click(function(){
// 			$("ol").hide();
			$("ol").toggle();
			return false;
		});
		
		
		$($("ul li:first")).css("color","blue");
		$($("ul li:last")).css("color","blue");
		$($("ol li:eq(-1)")).css("color","blue");
		$($(":button")).css("color","blue");
		
		
	});
	
	
</script>
</head>
<body>
	<h3>jquery1</h3>
	
	<p class="p_txt">Hello jquery1</p>
	<p class="p_txt">Hello jquery2</p>
	<p class="p_txt">Hello jquery3</p>
	
	<button class="btn">button01</button>
	<h3>jquery2</h3>
	<h3>jquery3</h3>
	
	<button class="btn">button02</button>
	<button class="btn">button03</button>
	<h3>jquery4</h3>
	<button>button04</button>
	<button>button05</button>
	<button>button06</button>
	<input type="button" value="input_button">
	<input type="button" value="input_button">
	
	<h1>과일가게</h1>
	<a href="index.jsp" id="a_temp">관계없는 링크index.jsp</a>
	<a href="index.jsp" class="a_choice">사과 선택</a>
	<a href="index.jsp" class="a_choice">배 선택</a>
	<a href="index.jsp" class="a_choice">바나나 선택</a>
	<ol>
		<li>사과</li>
		<li>배</li>
		<li>바나나</li>
	</ol>
	<ul>
		<li>사과</li>
		<li>배</li>
		<li>바나나</li>
	</ul>
	
	
</body>
</html>