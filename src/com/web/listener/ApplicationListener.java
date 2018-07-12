package com.web.listener;

import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;

import org.apache.catalina.startup.Tomcat;

import com.bean.Product;
import com.bean.Report;
import com.bean.ShopCartItem;
import com.bean.User;
import com.common.exception.ProductException;
import com.common.exception.ReportException;
import com.service.IProductService;
import com.service.IReportService;
import com.service.IShopCartItemService;
import com.service.impl.ProductServiceImpl;
import com.service.impl.ReportServiceImpl;
import com.service.impl.ShopCartItemServiceImpl;

@WebListener
public class ApplicationListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ApplicationListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         System.out.print("Tomcat destroyed");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         System.out.print("Tomcat init");
         IProductService productService = new ProductServiceImpl();
         IReportService reportService = new ReportServiceImpl();
         IShopCartItemService shopCartItemService = new ShopCartItemServiceImpl();
         try {
			List<Product> list1 = productService.listAllProduct();
			List<Report> list2 = reportService.listAllReport();
			ServletContext application;
			application = sce.getServletContext();
			application.setAttribute("allProducts", list1);
			application.setAttribute("reports", list2);
		} catch (ProductException e) {
			e.printStackTrace();
		} catch (ReportException e) {
			e.printStackTrace();
		}
    }
	
}
