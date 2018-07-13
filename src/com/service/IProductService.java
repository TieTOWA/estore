package com.service;

import java.util.List;
import java.util.Set;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;

import com.bean.Product;
import com.common.exception.ProductException;


public interface IProductService {
	
	/**
	 * 获取所有商品
	 */
	public List<Product> listAllProduct() throws ProductException;

	/**
	 * 获取热卖商品
	 * */
	public List<Product> listHotProducet() throws ProductException;
	
	/**
	 * 根据一级菜单ID获取商品
	 * */
	public List<Product> listProductByCategoryId(int id) throws ProductException;
	
	/**
	 * 根据二级菜单ID获取商品
	 * */
	public List<Product> listProductByCategoryDetailId(int id) throws ProductException;
	
	/**
	 * 获取出版社信息
	 * */
	public Set<String> listPublish() throws ProductException;
	
	/**
	 * 根据商品ID获取商品信息
	 * */
	public Product getProductById(int id) throws ProductException;
	
	/**
	 * 根据商品ID获取类别信息
	 * */
	public List<String> getCateInfoByProductId(int id)  throws ProductException;

	public List<Product> getProductByName(String name) throws ProductException;
	
	
}