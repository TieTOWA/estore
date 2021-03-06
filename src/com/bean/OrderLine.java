package com.bean;
/**
 * 订单项
 */
public class OrderLine {
	private int id;
	/*订单的数量*/
	private int num;
	/* 订单项维护的产品 */
	private Product product;
	/*订单项从属于的订单*/
	private Order order;
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
}
