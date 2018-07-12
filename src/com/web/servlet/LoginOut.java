package com.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * 登出商城
 * */

@WebServlet("/Loginout")
public class LoginOut extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(false);
		if (session == null) {
			response.sendRedirect("index.jsp");
		}else {
			session.removeAttribute("user");
			session.invalidate();
			response.sendRedirect("index.jsp");
		}
	}



}
