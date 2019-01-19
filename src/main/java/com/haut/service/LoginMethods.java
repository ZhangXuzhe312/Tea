package com.haut.service;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;


import com.haut.dao.UserDao;
import com.haut.entity.LoginUser;

import com.haut.util.DBSession;

public class LoginMethods {

	//校验登录
	public int  checkLoginImpl(LoginUser u){
		List<LoginUser> checkLogin =null;
				SqlSession openSession = null;
				try {
					openSession = DBSession.openSession();
					UserDao mapper = openSession.getMapper(UserDao.class);
					checkLogin = mapper.checkLogin(u);
					if(checkLogin.isEmpty()){
						return -1;
					}
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					openSession.close();
				}
				return checkLogin.get(0).getFlag();
	}
	
	//ajax验证
	public boolean ajaxCheck(LoginUser u){
		SqlSession openSession = null;
		try {
			openSession = DBSession.openSession();
			UserDao mapper = openSession.getMapper(UserDao.class);
			LoginUser ajaxCheck = mapper.ajaxCheck(u);
			if(ajaxCheck==null){	
				return false;
			}	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			openSession.close();
		}
			return true;
		
	}
	
	

	//注册
	public static boolean regeistTea(LoginUser u){
		SqlSession openSession=null;
		 try {
			 openSession = DBSession.openSession();
			UserDao mapper = openSession.getMapper(UserDao.class);
			boolean teaRegeist = mapper.teaRegeist(u);
			
			if(teaRegeist){
				openSession.commit();
				return true;
			}		
		} catch (IOException e) {
			
		}finally{
			openSession.close();
		}
		return false;
	}
	
	

	
	
	
}
