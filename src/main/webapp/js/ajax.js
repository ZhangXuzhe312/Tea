$(function (){
	$("input:eq(0)").blur(function (){
		$.ajax({
			type: "POST",
            url: "http://localhost:8080/TeaDeclare/LoginRegisetAjax",
            data: {"name":$("input:eq(0)").val()},
            dataType: "json",
            success: function(result){ 
            	
            	$("#pnode").html(result.data);
            	 
            }
		})
	})
})
