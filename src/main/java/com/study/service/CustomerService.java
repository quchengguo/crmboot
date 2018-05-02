package com.study.service;

import com.study.pojo.Customer;
import com.study.pojo.QueryVo;
import com.study.utils.Page;

/*
* @author quchengguo
* @version 2018年4月26日 上午11:41:09
*/
public interface CustomerService {
	/*
	 * 展示客户信息列表
	 */
	Page<Customer> getCustomerList(QueryVo queryVo);
	
	/**
	 * 通过id查询客户信息
	 */
	Customer getCustomerListById(Long id);
	
	/**
	 * 更新客户信息
	 */
	void updateCustomer(Customer customer);
	
	/**
	 * 删除客户
	 */
	void deleteCustomer(Long id);

}
