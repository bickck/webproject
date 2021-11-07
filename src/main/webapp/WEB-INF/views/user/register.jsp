<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<script src="/js/user/user.js"></script>
</head>

<body>
	<div class="container">
		<div class="container center">

			<form>
				<div class="form-group">
					<div class="container-empty" id="usereEmpty"></div>
					<input type="text" class="form-control" id="username"
						placeholder="�̸�">
				</div>

				<div class="form-group">
					<div class="container-empty" id="emailEmpty"></div>
					<input type="email" class="form-control" id="email"
						placeholder="�̸���">
				</div>
				<div class="form-group">
					<div class="container-empty" id="phoneEmpty"></div>
					<input type="tel" class="form-control" id="phonenumber"
						placeholder="�޴���ȭ">
				</div>
				<div class="form-group">
					<div class="container" id="passWordEmpty"></div>
					<input type="password" class="form-control" id="password"
						placeholder="��й�ȣ">
				</div>
				<div class="form-group" id="userempty">
					<div class="container-empty" id="rePasswordEmpty"></div>
					<input type="repassword" placeholder="��й�ȣ Ȯ��" class="form-control"
						id="pwd">
				</div>
			</form>
			<button id="btn-save" type="button" class="btn btn-primary btn-block">ȸ��
				����</button>
		</div>

	</div>
</body>
</html>