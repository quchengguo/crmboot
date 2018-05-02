package com.study.dao;

import java.util.List;

import com.study.pojo.BaseDict;
import com.study.pojo.Customer;
import com.study.pojo.QueryVo;
import com.study.utils.Page;

/*
* @author quchengguo
* @version 2018年4月26日 上午11:38:03
*/
public interface CustomerMapper {
	
	/**
	 * 查询客户信息列表
	 * @param queryVo
	 */
	List<Customer> getCustomerList(QueryVo queryVo);
	
	/**
	 * 查询客户列表总页数
	 * @param queryVo
	 */
	int getTotalResult(QueryVo queryVo);
	
	/**
	 * 通过id查询客户
	 * @param id
	 */
	Customer getCustomerListById(Long id);
	
	/**
	 * 更新客户信息
	 * @param customer
	 */
	void updateCustomer(Customer customer);

	/**
	 * 删除客户
	 * @param id
	 */
	void deleteCustomer(Long id);
}
