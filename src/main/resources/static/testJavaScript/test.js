/**
 * 
 */


$(document).ready(function() {
	$('#button').click(function() {
		var testvalue = $("#test").val();
		var result = data(testvalue);

		console.log("result" + result);
	})
})

function data(data) {

	var result_data;

	$.ajax({
		type: "GET",
		url: "/account/test",
		data: { testvalue: data },
		async: false,
		success: function(redata, textStatus) {
			result_data = redata;
			console.log("ajax func in " + redata);
		}

	});

	console.log("ajax data:" + result_data);
	return result_data;
}