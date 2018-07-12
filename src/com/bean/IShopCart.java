package com.bean;

import java.math.BigDecimal;
import java.util.Iterator;

public interface IShopCart {
	
	void addProduct(Product product) throws Exception;
	
	void removeProduct(int productid) throws Exception;
	
	void removeAllProducts() throws Exception;
	
	void updateProduct(int productid,Integer number) throws Exception;
	
	BigDecimal getTotalPrice() throws Exception;
	
	Iterator<OrderLine> getOrderlines() throws Exception;
	
	int getShopCartSize()throws Exception;;
	
}






