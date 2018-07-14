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
import com.service.IProductService;
import com.service.impl.ProductServiceImpl;


@WebServlet("/searchSerlvet")
public class searchSerlvet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public searchSerlvet() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=(String)request.getParameter("key").trim();
		if(name==null||name=="") {
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().print("<script language='javascript'>alert('您的搜索为空');window.location.href='index.jsp';</script>");
		}else {
			try {
				
				IProductService productService=new ProductServiceImpl();
				List<Product> searchProduct=productService.getProductByName(name);
				
				HttpSession session=request.getSession();
				session.removeAttribute("searchProducts");
				session.setAttribute("searchProducts", searchProduct);
				response.sendRedirect("viewBooklist.jsp");		
			} catch (ProductException e) {
				e.printStackTrace();
			}
		}	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
