/**
 * 
 */


$(document).ready(function() {
	$('#button').click(function() {
		var testvalue = $("#test").val();
		var result = data(testvalue);
		const dv = document.getElementById("val");
		dv.textContent = result;
	})
})

function data(data) {

	var result_data;

	$.ajax({
		type: "POST",
		url: "/account/test",
		data: { testvalue: data },
		async: false,
		success: function(redata, textStatus) {
			result_data = redata;
			console.log("ajax func in " + redata);
		}

	});
	return result_data;
}