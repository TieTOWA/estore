package com.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Product;
import com.common.exception.ProductException;
import com.service.ICategoryDetailService;
import com.service.ICategoryService;
import com.service.IProductService;
import com.service.impl.CategoryServiceImpl;
import com.service.impl.ProductServiceImpl;

/**
 * Servlet implementation class listServlet
 */
@WebServlet("/listServlet")
public class listServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = new Integer(request.getParameter("cateId"));
		IProductService productService = new ProductServiceImpl();
		try {
			List<Product> hots = productService.listHotProducet();
			List<Product> cateProducts = productService.listProductByCategoryId(id);
			HttpSession session = request.getSession();
			session.setAttribute("hots", hots);
			session.setAttribute("cateProducts", cateProducts);
			response.sendRedirect("list.jsp");
		} catch (ProductException e) {
			e.printStackTrace();
		}
	}

}
