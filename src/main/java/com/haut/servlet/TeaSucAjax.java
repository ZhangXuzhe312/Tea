package com.haut.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haut.entity.TeaDetail;
import com.haut.util.JSONUtil;

@WebServlet("/TeaSuc")
public class TeaSucAjax extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public TeaSucAjax() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String parameter = request.getParameter("zhanghao");
		System.out.println(parameter);
		TeaDetail teaDetail = new TeaDetail();
		JSONUtil.writeJSON("200", teaDetail, response);
/*		
		int tid = Integer.parseInt(request.getParameter("zhanghao"));
		String methods = request.getParameter("methods");
		if ("info".equals(methods)) {
			request.setAttribute("tid", tid);
			request.getRequestDispatcher("pages/TeaPersonInfo.jsp").forward(request, response);	
		}else if("record".equals(methods)){
			request.setAttribute("tid", tid);
			request.getRequestDispatcher("pages/TeaBaoZhang.jsp").forward(request, response);
		}else if("declare".equals(methods)){
			request.setAttribute("tid", tid);
			request.getRequestDispatcher("pages/TeaDeclare.jsp").forward(request, response);
		}
*/
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request,response);
	}

}
