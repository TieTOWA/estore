package com.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Product;
import com.common.exception.ProductException;
import com.service.IProductService;
import com.service.impl.ProductServiceImpl;

@WebServlet("/viewBookServlet")
public class viewBookServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//将request获取的id转换为int类型
		Integer id = new Integer(request.getParameter("productId"));
		IProductService productService = new ProductServiceImpl();
		try {
			Product product = productService.getProductById(id);
			HttpSession session = request.getSession();
			session.setAttribute("product", product);
			response.sendRedirect("viewBook.jsp");
		} catch (ProductException e) {
			e.printStackTrace();
		}
	}

}
