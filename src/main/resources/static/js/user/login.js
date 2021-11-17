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
			url: "/request/login",
			data: JSON.stringify(data),
			contentType: "application/json; charset=utf-8"
		});
	});
});
