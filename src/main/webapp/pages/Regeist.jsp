<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body style="background-image:url('../images/backgroud.png')">

<center>
		<form action="RegeistUser" method="post">	
			教师号:<input type="text" name="tid"/>  <p id="pnode"></p> <br />
			密码: <input type="password" name="tpwd"/> <br />
			<input type="submit" value="注册"/>
		</form>
</center>
<script type="text/javascript" src="../js/jquery-3.1.1.js"></script>
<!-- <script src="../js/ajax.js"></script> -->

<script type="text/javascript">
	$("input:[type='submit']").click(function (){
		$.ajax({
			type: "POST",
            url: "RegeistUser",
            data: {"id":$("input:eq(0)").val(),"pass":$("input:eq(1)").val()},
            dataType: "json",
            success: function(result){ 
            	
            	/* $("#pnode").html(result.data); */
            	 
            }
		})
	})

</script>

</body>
</html>