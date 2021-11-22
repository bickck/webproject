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
			<li class="nav-item"><a class="nav-link" href="/event">�̺�Ʈ</a></li>
			<li class="nav-item"><a class="nav-link" href="/event/category">ī�װ�</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="/event/myroadMap">�н��ε��</a>
			</li>
			<!-- �α��� �� ��� �������� �� -->

			<c:choose>
				<c:when test="${empty sessionScope.principal }">
					<li class="nav-item"><a class="nav-link" href="/user/login">�α���</a>
					</li>

					<li class="nav-item"><a class="nav-link"
						href="account/register">ȸ������</a></li>
				</c:when>
				<c:otherwise>
					<li class="nav-item"><a class="nav-link" href="/userList">����
							������</a></li>
					<li class="nav-item"><a class="nav-link" href="/auth/logout">�α׾ƿ�</a>
				</c:otherwise>

			</c:choose>

		</ul>
	</nav>
	<h1>${id }</h1>
	<h1>${username }</h1>
	<h1>${email }</h1>