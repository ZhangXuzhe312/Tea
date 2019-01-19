package com.haut.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haut.util.JSONUtil;

@WebServlet("/RegeistUser")
public class RegeistUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RegeistUser() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String parameter = request.getParameter("id");
		String parameter2 = request.getParameter("pass");
		System.out.println(parameter+parameter2);
		JSONUtil.writeJSON("200", "账号正确", response);
		response.sendRedirect("index.jsp");
	}

}
