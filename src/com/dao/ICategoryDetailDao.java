package com.dao;

import com.bean.CategoryDetail;

public interface ICategoryDetailDao {
	/**
	 * 通过大类来查找小类
	 * @param name
	 * @return CategoryDetail
	 */
	public CategoryDetail selectByCategory(String name);
}