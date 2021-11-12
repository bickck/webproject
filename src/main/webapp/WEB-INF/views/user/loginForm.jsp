<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="container center">

			<form>
				<div class="form-group">
					<div class="container-empty" id="emailEmpty"></div>
					<input type="email" class="form-control" id="email"
						placeholder="이메일">
				</div>

				<div class="form-group">
					<div class="container" id="passWordEmpty"></div>
					<input type="password" class="form-control" id="password"
						placeholder="비밀번호">
					<div class="container" id="passWordEmpty"></div>
				</div>
			</form>

			<div class="form-group from-check">
				<label class="form-check-label"> <input name="remember"
					class="form-check-input" type="checkbox"> Remember me
				</label> 
				
				
				<a href="/account/find-me">비밀번호 찾기</a>
			</div>

			<button id="btn-login" type="button"
				class="btn btn-primary btn-block">로그인</button>
		</div>
</body>
</html>