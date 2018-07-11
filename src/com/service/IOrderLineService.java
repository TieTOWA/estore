package com.service;

import com.bean.OrderLine;
import com.common.exception.OrderException;

public interface IOrderLineService {
	/**
	 * 保存订单明细
	 * */
	public void saveOrder(OrderLine order) throws OrderException;
	/**
	 * 根据ID删除订单明细
	 * */
	public void delOrder(Long orderid) throws OrderException;

}