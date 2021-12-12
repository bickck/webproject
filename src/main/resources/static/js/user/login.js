/**
 * {
				email : $("#email").val(),
				password : $("password").val()
			},
 */

$(document).ready(function() {

	$('#btn-login').on("click", () => {
		var data = {
			email: $("email").val(),
			password: $("password").val()
		}
		$.ajax({
			type: "POST",
			url: "/account/login",
			data: data,
		});
	});
});