package com.service;

import java.util.List;

import com.bean.ShopCartItem;
import com.bean.User;

public interface IShopCartItemService {
	/**
	 * 保存到购物车
	 * @return
	 */
	public void saveShopCartItem(ShopCartItem shopCartItem);
	
	/**
	 * 获取用户的购物车列表
	 * @param user
	 * @return List<ShopCartItem>
	 */
	public List<ShopCartItem> listAllShopCartItem();
}
