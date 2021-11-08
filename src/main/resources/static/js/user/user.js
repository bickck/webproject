/**
 * 
 */

$(document).ready(function() {
	$('#btn-save').on("click", () => {
		let data = {
			username: $("#username").val(),
			email: $("#email").val(),
			phonenumber: $("#phonenumber").val(),
			password: $("#password").val()
		};
		
		$.ajax({
			type: "POST",
			url: "/user/register",
			data: JSON.stringify(data),
			contentType: "application/json; charset=utf-8"
		}).done(function(resp) {
			alert("회원가입이 완료되었습니다.");
			//alert(resp);
			location.href = "/";
		}).fail(function(error) {
			alert(JSON.stringify(error));
		});
	});
});
