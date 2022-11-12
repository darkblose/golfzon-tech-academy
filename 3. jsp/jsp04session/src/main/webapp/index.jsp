<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link rel="stylesheet" href="css/menu.css">
<script>
	sessionStorage.user_id = "tester";
	console.log("sessionStorage:",sessionStorage.user_id);
	localStorage.user_name = "lee";
	console.log("localStorage:",localStorage.user_name);
</script>
</head>
<body>
	<h3>Home</h3>
	<jsp:include page="top_menu.jsp"></jsp:include>
	${user_id}
	${pageContext.request.scheme}
	${pageContext.request.serverName}
	${pageContext.request.serverPort}
	${pageContext.request.contextPath}
	<%= request.getContextPath() %>
	<%= application.getAttribute("player_name") %>
	${player_name}
	

</body>
</html>