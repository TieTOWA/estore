package com.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.ShopCartItem;
import com.bean.User;
import com.service.IShopCartItemService;
import com.service.impl.ShopCartItemServiceImpl;

/**
 * Servlet implementation class ShopCart
 */
@WebServlet("/ShopCart")
public class ShopCart extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		IShopCartItemService service = new ShopCartItemServiceImpl();
		List<ShopCartItem> list  = service.listAllShopCartItem(user);
		session.setAttribute("ShopCartLists", list);
		response.sendRedirect("shopCart.jsp");
	}

}
