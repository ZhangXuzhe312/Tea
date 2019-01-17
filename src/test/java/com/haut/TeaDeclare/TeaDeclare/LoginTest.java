package com.haut.TeaDeclare.TeaDeclare;


import com.haut.entity.LoginUser;
import com.haut.service.LoginMethods;
public class LoginTest {
	
	
public static void main(String[] args) {
	
	
	
	LoginUser u = new LoginUser(111);
	LoginMethods loginMethods = new LoginMethods();

	//登录校验
	/*int checkLoginImpl = loginMethods.checkLoginImpl(u);
	System.out.println(checkLoginImpl);*/
/*	
 * 注册校验
	boolean regeistTea = loginMethods.regeistTea(u);
	System.out.println(regeistTea);*/
	
	//ajax验证
	System.out.println(loginMethods.ajaxCheck(u));


	
	
}


}
