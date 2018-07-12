package com.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Product;
import com.bean.ShopCartItem;
import com.bean.User;
import com.common.exception.ProductException;
import com.service.IProductService;
import com.service.IShopCartItemService;
import com.service.impl.ProductServiceImpl;
import com.service.impl.ShopCartItemServiceImpl;

/**
 * 
 * 添加购物车时调用的servlet
 *
 */
@WebServlet("/addShopCart")
public class addShopCart extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//将request获取的id转换为int类型
		Integer productId = new Integer(request.getParameter("productId"));
		Integer productNum = new Integer(request.getParameter("productNum"));

		try {
			//从session获取当前用户
			HttpSession session = request.getSession();
			User user = (User) session.getAttribute("user");
			if (user == null) {
				//user为空，提示登陆
				response.getWriter().print("请先登陆！");
			}else {
				//user不为空，根据前台获取的productId获取product
				IProductService productService = new ProductServiceImpl();
				Product product = productService.getProductById(productId);
				
				//构造一个ShopCartItem对象，并赋值
				ShopCartItem sc = new ShopCartItem();
				sc.setUser(user);
				sc.setProduct(product);
				sc.setNum(productNum);
				
				//调用service层的保存方法
				IShopCartItemService shopCartItemService = new ShopCartItemServiceImpl();
				shopCartItemService.saveShopCartItem(sc);
				
				//响应添加购物车成功
				response.getWriter().print("添加购物车成功");
			}
		} catch (ProductException e) {
			e.printStackTrace();
		}	
	}
}
