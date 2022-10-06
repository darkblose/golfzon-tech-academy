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
	$(function(){
		console.log("ready....");
		
		$("#title").on({mouseenter : function(){
			console.log("mouseenter....");
			$(this).css("color","red");
		},mouseleave : function(){
			console.log("mouseleave....");
			$(this).css("color","black");
		}});
		
		
		$("#searchWord").on("keypress",function(){
			console.log("keypress....");
			
		});
		
		$("#searchWord2").on("keyup",function(){
			console.log("keyup....");
			
		});
		
		$("#frm").on("submit",function(){
			console.log("submit....");
			console.log("searchWord:"+$("#searchWord").val());
			console.log("searchWord2:"+$("#searchWord2").val());
// 			if($("#searchWord").val().trim().length==0) return false;
// 			if($("#searchWord2").val().trim().length==0) return false;
// 			return true;
			return false;
		});
		
		$("#hobby1").on("change",function(){
			console.log("checkbox change....");
			console.log($(this).is(":checked"));
		});
		
		$("#searchKey").on("change",function(){
			console.log("select change....");
			console.log($(this).val());
		});
		
		$(".p_txt").each(function(i){
			$(this).on({mouseover : function(){
				console.log("over....",i);
			}, mouseout : function(){
				console.log("out....",i);
			}});
		});
		
		
	});
	
	
</script>
</head>
<body>
	<h3 id="title">jquery1</h3>
	<form action="index.jsp" id="frm">
		<input type="text" id="searchWord" value="jq1">
		<input type="text" id="searchWord2" value="jq2">
		<input type="checkbox" id="hobby1" value="hobby1">hobby1
		<select id="searchKey">
			<option value="name">name</option>
			<option value="age">age</option>
		</select>
		<input type="submit">
	</form>
	
	<p class="p_txt">Hello jquery1</p>
	<p class="p_txt">Hello jquery2</p>
	<p class="p_txt">Hello jquery3</p>
	
	
	<button class="btn">button01</button>
	<button class="btn">button02</button>
	<button class="btn">button03</button>
	
	
</body>
</html>