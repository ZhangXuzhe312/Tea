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
<!-- 管理员登录成功
<h1>登录用户管理</h1>
用户禁用
删除用户
查看用户
修改用户
<h1>教师管理</h1>
增加教师账户
删除教师
查看教师信息及申报记录
修改教师信息
<h1>申报记录审批</h1>
查看申报记录(审核中黄色,通过绿色,未通过红色)
处理申报请求 -->
<div style="width: 100%;height: 200px;background-color: red">
管理员登录成功
<h1>登录用户管理</h1>
用户禁用
删除用户
查看用户
修改用户
<h1>教师管理</h1>
增加教师账户
删除教师
查看教师信息及申报记录
修改教师信息
<h1>申报记录审批</h1>
查看申报记录(审核中黄色,通过绿色,未通过红色)
处理申报请求
</div>
<div style="width:100%;height: 800px;">
        <div  style="width: 200px;height: 800px;float: left;border: none;background-color: chartreuse">
            <ul>
                <li><a href="pages/AdminUserManager.jsp?${zhanghao} " target="ifre"><h5>登录用户管理</h5></a></li>
                <li> <a href="pages/AdminTeaManage.jsp" target="ifre"><h5>教师管理</h5></a></li>
                <li> <a href="pages/AdminDeclareManage.jsp" target="ifre"><h5>申报记录管理</h5></a></li>
               
            </ul>
    </div>
    <div class="content-left" style="width: 1500px;height: 800px;float: left">
        <iframe style="width: 1500px;height: 800px;margin: 0px 7px" name="ifre" scrolling="auto" frameborder="0"></iframe>
    </div>

</html>