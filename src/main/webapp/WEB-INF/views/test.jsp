<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<script src="/testJavaScript/test.js"></script>
<body>
	donghyeon - ${donghyeon}, testView - ${testView}

	<br> testvalue -

	<c:choose>
		<c:when test="${not empty cookie.cookiesTest.name }">
			<div>쿠키 있어요!!</div>
		</c:when>
	</c:choose>


	<div id="val"></div>



	<form>
		<input type="text" id="test">
	</form>
	<button type="button" id="button">테스트</button>
</body>
</html>