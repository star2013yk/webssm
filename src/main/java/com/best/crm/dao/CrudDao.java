package com.best.crm.dao;

import java.util.List;

/**
 * 增删改查业务逻辑的抽象接口，由于映射mybatis的xml文件
 * 
 * @desc: crm-teacher
 * @author: 李凯
 * @createTime: 2017年2月28日 下午7:15:19
 * @history:
 * @version: v1.0
 * @param <T>
 */
public interface CrudDao<T> {
	/**
	 *
	 * @author: Administrator
	 * @createTime: 2017年2月28日 下午7:16:40
	 * @history:
	 * @param emp
	 *            查询业务的对象
	 * @return T 查询结果
	 */
	T get(T emp);

	/**
	 *
	 * @author: Administrator
	 * @createTime: 2017年2月28日 下午7:17:22
	 * @history:
	 * @param emp
	 *            删除业务的对象
	 * @return int 业务执行结果
	 */
	int delete(T emp);

	/**
	 *
	 * @author: Administrator
	 * @createTime: 2017年2月28日 下午7:17:53
	 * @history:
	 * @param emp
	 *            插入业务的对象
	 * @return int 业务执行结果
	 */
	int insert(T emp);

	/**
	 *
	 * @author: Administrator
	 * @createTime: 2017年2月28日 下午7:19:30
	 * @history:
	 * @param emp
	 *            更新业务的对象
	 * @return int 业务执行结果
	 */
	int update(T emp);

	/**
	 *
	 * @author: Administrator
	 * @createTime: 2017年2月28日 下午7:20:01
	 * @history:
	 * @param emp
	 *            更新业务的对象
	 * @return List<T> 查询数据的结果集
	 */
	List<T> findList(T emp);

	/**
	 *
	 * @author: Administrator
	 * @createTime: 2017年2月28日 下午7:20:24
	 * @history:
	 * @param emp
	 *            查询数据长度传入的对象
	 * @return Long 查询长度的结果
	 */
	Long count(T emp);
}
