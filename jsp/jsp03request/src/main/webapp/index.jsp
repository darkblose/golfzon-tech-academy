<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link rel="stylesheet" href="css/menu.css">
</head>
<body>
	<h3>Home</h3>
	<jsp:include page="top_menu.jsp"></jsp:include>
	
	<pre>
	jsp04session 
	test.com.controller 
		>> IndexController 
		sPath >> index.do
		>> BoardController
		sPath >> b_insert.do,b_update.do,b_delete.do,
					b_selectAll.do
	webapp 
		>> board 
	   		>> insert.jsp, update.jsp, delete.jsp,selectAll.jsp
		>> index.jsp
		>> css >> menu.css
		>> top_menu.jsp
	</pre>

</body>
</html>