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
			<form class="validation-form" novalidate action="m_insertOK" method="post">
			  	
			  <div class="mb-3">
				<label for="id">ID</label>
				<input type="text" class="form-control" name="id" id="id" placeholder="" value="admin" required>
				<div class="invalid-feedback">
				  ID 입력해주세요.
				</div>
			  </div>
			  <div class="mb-3">
				<label for="pw">PW</label>
				<input type="password" class="form-control" name="pw" id="pw" placeholder="" value="hi1234" required>
				<div class="invalid-feedback">
				  PW 입력해주세요.
				</div>
			  </div>
			  <div class="mb-3">
				<label for="name">NAME</label>
				<input type="text" class="form-control" name="name" id="name" placeholder="" value="lee" required>
				<div class="invalid-feedback">
				  NAME 입력해주세요.
				</div>
			  </div>
			  <div class="mb-3">
				<label for="tel">TEL</label>
				<input type="text" class="form-control" name="tel" id="tel" placeholder="" value="010" required>
				<div class="invalid-feedback">
				  TEL 입력해주세요.
				</div>
			  </div>
	
			  
			  <hr class="mb-4">
			  <div class="custom-control custom-checkbox">
				<input type="checkbox" class="custom-control-input" id="aggrement" checked required>
				<label class="custom-control-label" for="aggrement">개인정보 수집 및 이용에 동의합니다.</label>
			  </div>
			  <div class="mb-4"></div>
			  <button class="btn btn-primary btn-lg btn-block" type="submit">가입 완료</button>
			</form>
		  </div>
		</div>
		<footer class="my-3 text-center text-small">
		  <p class="mb-1">&copy; 2022 YANGSSEM</p>
		</footer>
	  </div>
	  <script>
		window.addEventListener('load', () => {
		  const forms = document.getElementsByClassName('validation-form');
	
		  Array.prototype.filter.call(forms, (form) => {
			form.addEventListener('submit', function (event) {
			  if (form.checkValidity() === false) {
				event.preventDefault();
				event.stopPropagation();
			  }
	
			  form.classList.add('was-validated');
			}, false);
		  });
		}, false);
	  </script>
</body>
</html>