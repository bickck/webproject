<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script src="/js/user/emailCheck.js"></script>
<script src="/js/user/user.js"></script>
</head>
<body>
	<div class="container">
		<div class="container center">

			<form>
				<div class="form-group">
					<div class="container-empty" id="emailEmpty"></div>
					<input type="email" class="form-control" id="findemail"
						placeholder="이메일">
				</div>
			</form>

			<button id="btn-transfer" type="button"
				class="btn btn-primary btn-block">전송하기</button>
		</div>

	</div>

</body>
</html>