package com.best.crm.common.util;

import com.alibaba.fastjson.JSONObject;
import com.best.crm.common.constant.Constant;

import java.util.List;

/**
 * 分页
 * 
 * @history:
 * @version: v1.0
 * @param <T>
 */
public class PagerBean<T> {
	/**
	 * 默认当前页
	 */
	private int page;

	/**
	 * 每页大小
	 */
	private int pageSize= Constant.PAGE_SIZE;
	/**
	 * 查询的结果总数
	 */
	private long total;
	/**
	 * 每页的分页数据
	 */
	private List<T> rows;

	public PagerBean() {

	}



	public int getPage() {
		return page;
	}

	public void setPage(int pageNo) {
		this.page = pageNo;
	}

	/**
	 * @return the pageSize
	 */
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * @param pageSize
	 *            the pageSize to set
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * @return the total
	 */
	public long getTotal() {
		return total;
	}

	/**
	 * @param total
	 *            the total to set
	 */
	public void setTotal(long total) {
		this.total = total;
	}

	/**
	 * @return the rows
	 */
	public List<T> getRows() {
		return rows;
	}

	/**
	 * @param rows
	 *            the rows to set
	 */
	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return JSONObject.toJSONString(this);
	}

}
