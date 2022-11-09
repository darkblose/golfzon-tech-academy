<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Spring Boot Application with JSP</title>

    <link href="/css/main.css" rel="stylesheet">

	 <!-- Bootstrap CSS -->
	 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <script type="text/javascript">
		$(function () {
			console.log("hello jquery");

		});
	</script>
</head>
<body>
	<jsp:include page="../top_menu.jsp"></jsp:include>
	<div class="container">
		<div class="input-form-backgroud row">
		  <div class="input-form col-md-12 mx-auto">
			<h4 class="mb-3">회원가입</h4>
			<table class="table">
				<thead>
				  <tr>
					<th scope="col">#</th>
					<th scope="col">ID</th>
					<th scope="col">PW</th>
					<th scope="col">NAME</th>
					<th scope="col">TEL</th>
				  </tr>
				</thead>
				<tbody>
					<c:forEach var="vo" items="${vos }">
					  <tr>
						<th scope="row">${vo.num}</th>
						<td>${vo.id}</td>
						<td>${vo.pw}</td>
						<td>${vo.name}</td>
						<td>${vo.tel}</td>
					  </tr>
				  	</c:forEach>
				</tbody>
			  </table>
		  </div>
		</div>
		<footer class="my-3 text-center text-small">
		  <p class="mb-1">&copy; 2022 YANGSSEM</p>
		</footer>
	  </div>
	  
</body>
</html>