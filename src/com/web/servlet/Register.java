package com.web.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.User;
import com.common.exception.UserException;
import com.dao.impl.UserDaoImpl;
import com.service.IUserService;
import com.service.impl.UserServiceImpl;


/**
 * Servlet implementation class register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String zip = request.getParameter("zip");
		String address = request.getParameter("address");
		String telephone = request.getParameter("telephone");
		String email = request.getParameter("email");
		System.out.println("servlet"+name);
		System.out.println("servlet"+password);
		User user = new User(name,password,zip,address,telephone,email);
		IUserService userService = new UserServiceImpl();
		try {
			boolean flag = userService.checkUser(user);
			if (flag) {
				userService.registerUser(user);
				response.sendRedirect("index.jsp");
			}else {
				response.setContentType("text/html;charset=utf-8");
				response.getWriter().print("<script language='javascript'>alert('你有一项没填写哦QAQ');window.location.href='register.jsp';</script>");
			}
		} catch (UserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
