package com.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.bean.User;
import com.service.IShopCartItemService;
import com.service.impl.ShopCartItemServiceImpl;
import com.web.view.ShopItemInfo;

/**
 * 点击去购物车结算跳转的Servlet
 */
@WebServlet("/ShopCart")
public class ShopCart extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		if (user != null) {
			int uid = user.getId();
			IShopCartItemService service = new ShopCartItemServiceImpl();
			List<ShopItemInfo> list  = service.listItemByUserId(uid);
			session.setAttribute("ShopCartLists", list);
			response.sendRedirect("shopCart.jsp");
		}else {
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().print("<script language='javascript'>alert('未登录哦~~');window.location.href='login.jsp';</script>");
		}
		
	}

}
