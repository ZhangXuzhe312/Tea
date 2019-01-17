$(function (){
	$("input:eq(0)").blur(function (){
		$.ajax({
			type: "POST",
            url: "LoginRegisetAjax",
            data: {"name":$("input:eq(0)").val()},
            dataType: "json",
            success: function(result){ 
            	
            	$("#pnode").html(result.data);
            	 
            }
		})
	})
})
