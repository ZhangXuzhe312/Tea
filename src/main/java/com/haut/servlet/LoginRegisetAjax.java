package com.haut.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haut.entity.LoginUser;
import com.haut.service.LoginMethods;
import com.haut.util.JSONUtil;

@WebServlet("/LoginRegisetAjax")
public class LoginRegisetAjax extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginRegisetAjax() {
        super();
     
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//登录页面 账号验证是否存在于loginuser表与teadetail表,同时存在则能用
		int parseInt = Integer.parseInt(request.getParameter("name"));	
		LoginUser loginUser = new LoginUser(parseInt);
		LoginMethods loginMethods = new LoginMethods();
		boolean ajaxCheck = loginMethods.ajaxCheck(loginUser);
		System.out.println(ajaxCheck+"++++++++++++++++"+parseInt);
		if(ajaxCheck){
			JSONUtil.writeJSON("200", "账号正确", response);
		}else{
			JSONUtil.writeJSON("201", "账号不存在", response);
		}

		
		
		
	}

}
