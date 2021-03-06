package com.bean;
/**
 * 购物车商品项
 */
public class ShopCartItem {
	
	private int id;
	/*购物车商品项属于用户*/
	private User user;
	/*购物车商品项包含的产品*/
	private Product product;
	/*购物车商品项购买的数量*/
	private int num;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
}
