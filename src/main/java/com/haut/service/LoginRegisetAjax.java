package com.haut.service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haut.entity.LoginUser;
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
		
		int parseInt = Integer.parseInt(request.getParameter("name"));	
		LoginUser loginUser = new LoginUser(parseInt);
		LoginMethods loginMethods = new LoginMethods();
		boolean ajaxCheck = loginMethods.ajaxCheck(loginUser);
		System.out.println(ajaxCheck+"++++++++++++++++"+parseInt);
	/*	JSONUtil.writeJSON("200", "账号不存在", response);*/
		
		
		
	}

}
