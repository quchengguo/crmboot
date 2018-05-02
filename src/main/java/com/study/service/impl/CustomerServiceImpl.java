package com.study.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.study.dao.CustomerMapper;
import com.study.pojo.Customer;
import com.study.pojo.QueryVo;
import com.study.service.CustomerService;
import com.study.utils.Page;

/*
* @author quchengguo
* @version 2018年4月26日 上午11:41:20
*/
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	private final Logger log = LoggerFactory.getLogger(CustomerServiceImpl.class);

	@Autowired
	private CustomerMapper customerMapper;

	@Override
	public Page<Customer> getCustomerList(QueryVo queryVo) {
		Page<Customer> customerPage = new Page<Customer>();

		int start = queryVo.getPage() * queryVo.getSize() - queryVo.getSize();
		queryVo.setStart(start);
		// 查询我们分页的数据出来
		List<Customer> customerList = customerMapper.getCustomerList(queryVo);
		// 查询我们分页的总记录数

		int totalResult = customerMapper.getTotalResult(queryVo);
		customerPage.setPage(queryVo.getPage());
		customerPage.setRows(customerList);
		customerPage.setSize(queryVo.getSize());
		customerPage.setTotal(totalResult);
		return customerPage;
	}

	@Override
	public Customer getCustomerListById(Long id) {
		Customer customer = customerMapper.getCustomerListById(id);
		return customer;
	}

	@Override
	public void updateCustomer(Customer customer) {
		if(null != customer) {
			customerMapper.updateCustomer(customer);
		}else {
			log.info("customer为空，请检查!");
		}
	}

	@Override
	public void deleteCustomer(Long id) {
		if(null != id) {
			customerMapper.deleteCustomer(id);
		}else {
			log.info("删除时id为空，请检查");
		}
	}

}
