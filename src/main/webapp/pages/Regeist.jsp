<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body style="background-image:url('../images/backgroud.png')">

<center>
		<form action="RegeistUser" method="post">	
			教师号:<input type="text" name="tid"/>   <span id="pnode"></span><br />
			密码: <input type="password" name="tpwd"/> <br />
			<input type="submit" id="submitId"  value="注册"/>
		</form>
</center>
<!-- <script src="../js/ajax.js"></script> -->


</body>
<!-- <script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script> -->
<script type="text/javascript" src="../js/jquery-3.1.1.js"></script>
<script src="../js/ajax.js"></script>
</html>