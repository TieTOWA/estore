package com.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.User;
import com.common.exception.UserException;
import com.service.IUserService;
import com.service.impl.UserServiceImpl;

@WebServlet("/Update")
public class Update extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String zip = request.getParameter("zip");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		User user = new User(name, password, zip, address, phone, email);
		IUserService userService = new UserServiceImpl();
		try {
			userService.updateUserInfo(user);
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
		} catch (UserException e) {
			e.printStackTrace();
		}
	}
}
