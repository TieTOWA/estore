package com.web.listener;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.catalina.startup.Tomcat;

import com.bean.Product;
import com.common.exception.ProductException;
import com.service.IProductService;
import com.service.impl.ProductServiceImpl;

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
         try {
			List<Product> list = productService.listAllProduct();
			ServletContext application;
			application = sce.getServletContext();
			application.setAttribute("allProducts", list);
		} catch (ProductException e) {
			e.printStackTrace();
		}
    }
	
}
