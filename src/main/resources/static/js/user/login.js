/**
 * {
				email : $("#email").val(),
				password : $("password").val()
			},
 */

$(document).ready(function(){
	$('#password').on("click",()=>{
		var data = $('password').val();
		
		$.ajax({
			type:"GET",
			url:"/check/pwd",
			data:JSON.stringify(data),
			contentType:"application/json; charset=utf-8"
		});
	});
});