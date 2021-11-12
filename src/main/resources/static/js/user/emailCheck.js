/**
 * 
 */


$(document).read(function() {
	$('#btn-transfer').on("click", () => {
		let data = {
			findemail: $("#findemail").val()
		};
		$.ajax({
			type: "POST",
			url: "/account/findPwd",
			data: JSON.stringify(data),
			contentType: "application/json; charset=utf-8"
		}).done(function(resp) {
			//alert(resp);
			location.href = "/";
		}).fail(function(error) {
			alert(JSON.stringify(error));
		});
	});
});