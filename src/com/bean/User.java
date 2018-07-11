package com.bean;

import java.util.Date;
import java.util.Set;

/**
 * 用户表
 */
public class User {
	/**
	 * 用户编号
	 */
	private int id;
	/*用户名*/
	private String username;
	/*密码*/
	private String password;
	/*邮编*/
	private String zip;
	/*地址值*/
	private String address;
	/*电话号码*/
	private String phone;
	/*邮件*/
	private String email;
	/*注册时间*/
	private Date dob;
	/*用户所拥有的订单*/
	private Set<Order> orders;
	/*用户加入到购物车的所有商品项*/
	private Set<ShopCatItem> cartItem;
	/*用户关注的降价通知商品项*/
	private Set<Reduce> reduces;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Set<Order> getOrders() {
		return orders;
	}
	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}
	public Set<ShopCatItem> getCartItem() {
		return cartItem;
	}
	public void setCartItem(Set<ShopCatItem> cartItem) {
		this.cartItem = cartItem;
	}
	public Set<Reduce> getReduces() {
		return reduces;
	}
	public void setReduces(Set<Reduce> reduces) {
		this.reduces = reduces;
	}
	
	public User() {
		super();
	}
	/**
	 * 
	 * @param password
	 * @param zip
	 * @param address
	 * @param phone
	 * @param email
	 */
	public User(String password, String zip, String address, String phone, String email) {
		super();
		this.password = password;
		this.zip = zip;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	/**
	 * 
	 * @param username
	 * @param password
	 * @param zip
	 * @param address
	 * @param phone
	 * @param email
	 */
	public User(String username, String password, String zip, String address, String phone, String email) {
		super();
		this.username = username;
		this.password = password;
		this.zip = zip;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	
}
