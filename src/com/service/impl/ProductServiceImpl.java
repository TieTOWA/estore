package com.service.impl;

import java.util.List;
import java.util.Set;
import com.bean.Product;
import com.common.exception.ProductException;
import com.service.IProductService;
import com.utils.BaseDao;

public class ProductServiceImpl implements IProductService {
	/**
	 * 获取所有商品
	 */
	@Override
	public List<Product> listAllProduct() throws ProductException {
		BaseDao baseDao = new BaseDao();
		String sql = "select * from s_product";
		Object[] params = {};
		List<Product> list = baseDao.find(sql, params, Product.class);
		return list;
	}

	/**
	 * 获取热卖商品
	 */
	@Override
	public List<Product> listHotProducet() throws ProductException {
		BaseDao baseDao = new BaseDao();
		String sql = "select id,name,price,img from s_product where hot = ?";
		Object[] params = {1};
		List<Product> list = baseDao.find(sql, params, Product.class);
		if (list.size() != 0) {
			return list;
		}else {
			return null;
		}
	}

	/**
	 * 根据一级菜单获取商品
	 */
	@Override
	public List<Product> listProductByCategoryId(int id) throws ProductException {
		BaseDao baseDao = new BaseDao();
		String sql = "select * from s_product where cate_detail_id"
				+ " in (select id from s_cate_detail "
				+ "where category_id = ?)";
		Object[] params = {id};
		List<Product> list = baseDao.find(sql, params, Product.class);
		if (list.size() != 0) {
			return list;
		}else {
			return null;
		}
	}

	/**
	 * 根据二级菜单获取商品
	 */
	@Override
	public List<Product> listProductByCategoryDetailId(int id) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 获取出版社信息
	 */
	@Override
	public Set<String> listPublish() throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 根据商品ID获取商品信息
	 */
	@Override
	public Product getProductById(int id) throws ProductException {
		BaseDao baseDao = new BaseDao();
		String sql = "select * from s_product where id = ?";
		Object[] params = {id};
		List<Product> list = baseDao.find(sql, params, Product.class);
		Product product = list.get(0);
		return product;
	}

	/**
	 * 根据商品ID获取类别信息
	 */
	@Override
	public List<String> getCateInfoByProductId(int id) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Product> getProductByName(String name) throws ProductException {
		BaseDao baseDao=new BaseDao();
		String sql="select * from s_product where name like'%"+name+"%'";
		Object[] params= {name};
		Class clazz=Product.class;
		List<Product> list=
				baseDao.find(sql, params, clazz);
		if (list==null) {
			System.out.println("list is null");		
		}else {
			System.out.println("list ok!");
		}	
		return list;
	}

	

}
