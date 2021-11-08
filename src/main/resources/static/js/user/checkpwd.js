/**
 * 
 */

$(document).ready(function(){
	$('#btn-chk').on("click",()=>{
		let password = $("#password").val();
		let rePwd = $("#rePwd").val();
		if(password == rePwd){
			alert("비밀번호 맞음");
		}else{
			alert("비밀번호 틀림")
		}
	})
});