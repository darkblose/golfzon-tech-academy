<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div id="nav">
	<ul>
		<li><a href="index.do">홈</a></li>
		<li><a href="m_insert.do">회원입력</a></li>
		<li><a href="m_selectAll.do">모든회원목록</a></li>
	</ul>
</div>
<br><br>
<hr>
	${user_id}
	<c:choose>
		<c:when test="${user_id == null}">
			<a href="login.do">로그인</a>
			<a href="m_insert.do">회원가입</a>
		</c:when>
		<c:otherwise>
			<a href="logout.do">로그아웃</a>
		</c:otherwise>
	</c:choose>
	