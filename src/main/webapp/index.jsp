<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <title>登录界面</title>
</head>
<link rel="stylesheet" href="css/login.css"/>
<body>

<form action="LoginManage" method="post">
    <div class="dowebok">
        <div class="logo"></div>
        <div class="form-item">
            <input id="username" type="text" autocomplete="off" placeholder="账号" name="username">
           <p id=pnode></p>
        </div>
        <div class="form-item">
            <input id="password" type="password" autocomplete="off" placeholder="登录密码" name="upwd">
          
        </div>
        <div class="form-item"><button id="submit">登 录</button></div>
        <div class="reg-bar">
            <a class="reg" href="LoginManage?flag=regeist">立即注册</a>
            <a class="forget" href="LoginManage?flag=forget">忘记密码</a>
        </div>
    </div>
   </form> 



<div style="text-align:center;">

</div>
<script src="./js/jquery-3.1.1.js"></script>
<script src="./js/ajax.js"></script>
</body>
</html>