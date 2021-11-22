<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
		<!-- Brand/logo -->
		<a class="navbar-brand" href="/">myColoso</a>

		<!-- Links -->
		<ul class="navbar-nav mr-auto">
			<li class="nav-item"><a class="nav-link" href="/event/about">ABOUT</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="/event">이벤트</a></li>
			<li class="nav-item"><a class="nav-link" href="/event/category">카테고리</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="/event/myroadMap">학습로드맵</a>
			</li>
			<!-- 로그인 할 경우 보여지는 곳 -->

			<c:choose>
				<c:when test="${empty sessionScope.principal }">
					<li class="nav-item"><a class="nav-link" href="/user/login">로그인</a>
					</li>

					<li class="nav-item"><a class="nav-link"
						href="account/register">회원가입</a></li>
				</c:when>
				<c:otherwise>
					<li class="nav-item"><a class="nav-link" href="/userList">나의
							강의장</a></li>
					<li class="nav-item"><a class="nav-link" href="/auth/logout">로그아웃</a>
				</c:otherwise>

			</c:choose>

		</ul>
	</nav>
	<h1>${id }</h1>
	<h1>${username }</h1>
	<h1>${email }</h1>