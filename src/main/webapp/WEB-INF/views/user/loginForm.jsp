<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<link rel="stylesheet" href="/css/userlogin.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script src="/js/user/login.js"></script>

</head>
<body>

	<div id="main1">
		<div class="container center" id=layout1>
			<div class="container center" id="layout2">
				<form action="/account/login" method="POST">
					<div class="form-group">
						<div class="container-empty" id="emailEmpty"></div>
						<input type="text" class="form-control" id="email"
							placeholder="이메일">
					</div>
					<p>
					<div class="form-group">
						<div class="container" id="passWordEmpty"></div>
						<input type="text" class="form-control" id="password"
							placeholder="비밀번호">
						<div class="container" id="passWordEmpty"></div>
					</div>

					<div class="form-group from-check">
						<label class="form-check-label"> <input name="remember"
							class="form-check-input" type="checkbox"> Remember me
						</label> <a href="/account/find-me">비밀번호 찾기</a>
					</div>
				</form>
				<button id="btn-login" type="submit"
					class="btn btn-primary btn-block">로그인</button>
			</div>
		</div>
	</div>
</body>

</html>