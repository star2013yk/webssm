package com.best.crm.common.persistence;

import com.best.crm.common.util.PagerBean;

import java.io.Serializable;

/**
 * 序列化类用于分页
* @desc: crm-teacher
* @author: 李凯
* @createTime: 2017年2月28日 下午7:04:12
* @history:
* @version: v1.0
* @param <T>
*/
public abstract class BaseEntity<T> implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7442830741106472149L;
	/**
	* 范形，用于对不同的业务提供支持
	*/
	protected PagerBean<T> pager;

	public PagerBean<T> getPager() {
		return pager;
	}

	public void setPager(PagerBean<T> pager) {
		this.pager = pager;
	}
	public abstract boolean isNew();;
	
}
