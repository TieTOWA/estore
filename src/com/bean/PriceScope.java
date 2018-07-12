package com.bean;
/**
 * 价格大小分段的类
 */
public class PriceScope {
	private int id;
	/*定格区间的最小值*/
	private int min;
	/*定格区间的最大值*/
	private int max;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public long getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
}
