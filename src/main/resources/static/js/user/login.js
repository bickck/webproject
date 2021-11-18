/**
 * 
 */


$(document).ready(function() {
	$('#btn-login').on("click", () => {
		let data = {
			email: $("#email").val(),
			password: $("#password").val()
		};

		$.ajax({
			type: "POST",
			url: "/auth/login",
			data: JSON.stringify(data),
			contentType: "application/json; charset=utf-8",
			beforSend : function(xhr){
				xhr.setRequestHeader("${_csrf.headerName}","${_csrf.token}")
			},
			success : function(result){
				alert("성공")
				location.href="/";
			},
			fail : function(result){
				alert("실패")
			}
		});
	});
});
