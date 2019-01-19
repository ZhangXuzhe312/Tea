<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/teaManage.css" />
</head>
<body>
<div style="width: 100%;height: 200px;background-color: red">教师登录成功
</div>
<div style="width:100%;height: 800px;">
     <div  style="width: 11%;height: 100%;float: left;border: none;background-color: chartreuse">
            <ul>
                <li><a href="pages/TeaPersonInfo.jsp" target="ifre"><h5>个人信息</h5></a></li>
                <li> <a href="pages/TeaDeclare.jsp" target="ifre"><h5>申报记录</h5></a></li>
                <li> <a href="pages/TeaBaoZhang.jsp" target="ifre"><h5>报账</h5></a></li>
            </ul>
    </div>
    
    <div class="content-left" style="width: 89%;height: 100%;float: left">
        <iframe style="width: 100%;height: 800px;margin: 0px 1px" name="ifre" scrolling="no" frameborder="0"></iframe>
    </div>
<!-- </div>
<div style="width: 100%;height: 300px;border: solid 2px red"><img src="/TeaDeclare/src/main/webapp/images/backgroud.png"></div>
</body> -->
</html>