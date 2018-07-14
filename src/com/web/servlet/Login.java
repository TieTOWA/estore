package com.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.bean.User;
import com.common.exception.UserException;
import com.service.IUserService;
import com.service.impl.UserServiceImpl;

import sun.rmi.server.Dispatcher;

@WebServlet("/Login")
public class Login extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		IUserService userService = new UserServiceImpl();
		try {
			User user = userService.loginUser(name, password);
			if (user != null) {
				HttpSession session = request.getSession();
				session.setAttribute("user", user);
				response.sendRedirect("indexSuccess.jsp");
			}
		} catch (UserException e) {
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().print("<script language='javascript'>alert('你有一项没填写哦QAQ');window.location.href='login.jsp';</script>");
		}
	}

}
