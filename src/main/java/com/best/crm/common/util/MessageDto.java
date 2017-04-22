package com.best.crm.common.util;
/**
 * message类用于删除时存储返回的json数据信息
* @desc: crm-teacher
* @author: 李凯
* @createTime: 2017年2月28日 下午7:05:41
* @history:
* @version: v1.0
* @param <T>
*/
public class MessageDto<T> {
	/**
	* 返回信息类型 0：成功 1：失败
	*/
	private String code;
	/**
	* 返回的信息
	*/
	private String msg;
	/**
	* 包装信息
	*/
	private T data;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
