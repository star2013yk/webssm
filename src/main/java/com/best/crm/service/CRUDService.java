package com.best.crm.service;

import com.best.crm.common.persistence.BaseEntity;
import com.best.crm.common.util.PagerBean;
import com.best.crm.dao.CrudDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * 使用泛型实现业务逻辑的增删改查
* @desc: crm-rbac
* @author: 李凯
* @createTime: 2017年3月1日 下午4:10:04
* @history:
* @version: v1.0
* @param <T>
* @param <D>
*/
public class CRUDService<D extends CrudDao<T>,T extends BaseEntity<T>> {
	
	/**
	 * 
	 */
	@Autowired
	private D dao;

	public T get(T t) {
		return dao.get(t);
	}

	/**
	 * @param t 泛型
	 * @return 业务结果
	 */
	@Transactional(readOnly = false)
	public int delete(T t) {
		int rlt = dao.delete(t);
		return rlt;
	}

	@Transactional(readOnly = false)
	public int insert(T emp) {
		int rlt = dao.insert(emp);
		return rlt;
	}

	@Transactional(readOnly = false)
	public int update(T t) {
		int rlt = dao.update(t);
		return rlt;
	}

	/**
	 * @param t 泛型
	 * @return 业务结果
	 */
	public PagerBean<T> findPager(T t) {
		PagerBean<T> pager = t.getPager();
		pager.setRows(dao.findList(t));
		pager.setTotal(dao.count(t));
		return pager;
	}

	/**
	 * @param t 泛型
	 * @return 业务结果
	 */
	public int save(T t) {
		if (!t.isNew()) {
			return dao.update(t);
		} else {
			return dao.insert(t);
		}

	}
	public List<T> findList(T t) {
		return dao.findList(t);
	}

}