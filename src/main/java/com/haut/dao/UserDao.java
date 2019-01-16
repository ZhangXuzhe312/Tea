package com.haut.dao;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haut.entity.LoginUser;

public interface UserDao {
	
	//验证登录
	List<LoginUser> checkLogin(LoginUser u);
	//教师账号注册
	List<LoginUser> yanChong(LoginUser u);
	int teaRegeist(LoginUser u);
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
