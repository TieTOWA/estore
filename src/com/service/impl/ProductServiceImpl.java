package com.service.impl;

import java.util.List;
import java.util.Set;

import com.bean.Product;
import com.common.exception.ProductException;
import com.service.IProductService;
import com.utils.BaseDao;

public class ProductServiceImpl implements IProductService {

	@Override
	public List<Product> listHostProducet() throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> listProductByCategoryId(int id) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> listProductByCategoryDetailId(int id) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> listPublish() throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductById(int id) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getCateInfoByProductId(int id) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> listAllProduct() throws ProductException {
		BaseDao baseDao = new BaseDao();
		String sql = "select * from s_product";
		Object[] params = {
				
		};
		List<Product> list = baseDao.find(sql, params, Product.class);
		return list;
	}

}