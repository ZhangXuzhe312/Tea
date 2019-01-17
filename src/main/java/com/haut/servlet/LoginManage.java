package com.haut.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haut.entity.LoginUser;
import com.haut.service.LoginMethods;

@WebServlet("/LoginManage")
public class LoginManage extends HttpServlet {
	private static final long serialVersionUID = 1L;    
 
    public LoginManage() {
        super();
       
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String parameter = request.getParameter("flag");
		if("regeist".equals(parameter)){
			response.sendRedirect("./pages/Regeist.jsp");
		}else{
			response.sendRedirect("./pages/UpdatePass.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//解决账号可能为空字符串(前端可以解决)
		int zhanghao;
		if(request.getParameter("username")==""){
			 zhanghao=0;
		}else{
			 zhanghao = Integer.parseInt(request.getParameter("username"));
		}
		
		String upwd = request.getParameter("upwd");
		LoginUser loginUser = new LoginUser(zhanghao,upwd);
		LoginMethods loginMethods = new LoginMethods();
		int flag = loginMethods.checkLoginImpl(loginUser);
		if(flag==-1){
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}else if(flag==0){
			request.getRequestDispatcher("./pages/AdminSuc.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("./pages/TeaSuc.jsp").forward(request, response);
		}
	}
	
	public static String na(){
		String result="爸爸";
		return result;
	}

}
