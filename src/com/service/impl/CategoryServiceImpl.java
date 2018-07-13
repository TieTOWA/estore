package com.service.impl;

import java.util.List;

import com.bean.Category;
import com.service.ICategoryService;
import com.utils.BaseDao;

public class CategoryServiceImpl implements ICategoryService{

	@Override
	public List<Category> listCategory() {
		BaseDao baseDao = new BaseDao();
		String sql = "select * from s_cate";
		Object[] params = {};
		List<Category> list = baseDao.find(sql, params, Category.class);
		return list;
	}

	@Override
	public void saveCategory(Category category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delCategory(Long categoryId) {
		// TODO Auto-generated method stub
		
	}

}
