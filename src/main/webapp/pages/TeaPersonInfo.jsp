<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人信息</title>

</head>
<body style="width: 1700px;height: 800px;background-color: red">
<table border="1" cellspacing="0" style="padding: 100px 300px;border: none " >
    <tr><th colspan="5">教师信息</th></tr>
    <tr>
        <td width="80px">教师号</td>
        <td width="80px">${zhanghao}</td>
        <td width="80px">性别</td>
        <td>##</td>
        <td rowspan="3"><img width="80px" height="120px" src="../images/backgroud.png" alt="照片"></td>
    </tr>
    <tr>
        <td>民族</td>
        <td>汉</td>
        <td>出生年月</td>
        <td>1990-10-11</td>
    </tr>
    <tr>
        <td>学历</td>
        <td>##</td>
        <td>职位</td>
        <td>##</td>
    </tr>
    <tr>
        <td>所在专业</td>
        <td>##</td>
        <td>所在学校</td>
        <td colspan="2" align="center">####</td>
    </tr>
</table>

<script src="../js/jquery-3.1.1.js"></script>
<script type="text/javascript">
$(function(){
	$(document).ready(function (){
	
  		$.ajax({
			type: "POST",
            url: "/TeaDeclare/src/main/java/com/haut/servlet/TeaSucAjax.java",
            data: {"zhanghao":$(zhanghao)},
            dataType: "json",
            success: function(result){ 
            	alert(result);
            	
            	 
            }
		})  
	})
})

/* $(document).ready(function(){
	 
	}); */
</script>
</body>
</html>