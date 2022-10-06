<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/menu.css">
</head>
<body>
	<h3>index.jsp</h3>
	<jsp:include page="top_menu.jsp"></jsp:include>
	
	jsp03request 
	test.com.controller 
		>> IndexController 
		sPath >> index.do
		>> MemberController
		sPath >> m_insert.do,m_update.do,m_delete.do,
					m_selectAll.do
	webapp 
		>> member 
	   		>> insert.jsp, update.jsp, delete.jsp,selectAll.jsp
		>> index.jsp
		>> css >> menu.css
		>> top_menu.jsp

</body>
</html>