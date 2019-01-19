package com.haut.dao;
import java.util.List;



import com.haut.entity.LoginUser;


public interface UserDao {
	
	//验证登录
	List<LoginUser> checkLogin(LoginUser u);
	
	//ajax验证
	LoginUser ajaxCheck(LoginUser u);
	
	//教师账号注册(前提是输入账号的时候已经判断过该账号可以使用)
	
	boolean teaRegeist(LoginUser u);
	
	
	//修改找回密码
	boolean findBackPass(LoginUser u);
	
	
	/*
	LoginUser selUser(@Param("uid")int uid,@Param("upass")String upass);
	//注册用户
	boolean addUser(LoginUser u);
	//修改密码
	boolean updateUser(LoginUser u);
	
	//删除用户
	boolean delUser(LoginUser u);
	
	@Select("select * from  t_loginuser where uid=#{uid}")
	LoginUser sel(int uid);
	*/
}
