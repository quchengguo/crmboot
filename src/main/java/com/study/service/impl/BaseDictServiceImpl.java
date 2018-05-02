package com.study.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.study.dao.BaseDictMapper;
import com.study.pojo.BaseDict;
import com.study.service.BaseDictService;

/*
* @author quchengguo
* @version 2018年4月26日 上午11:40:34
*/
@Service
@Transactional
public class BaseDictServiceImpl implements BaseDictService{
	
	@Autowired
	private BaseDictMapper baseDictMapper;

	@Override
	public List<BaseDict> getCustomerList(String customerSource) {
		List<BaseDict> baseDictList = baseDictMapper.getCustomerByCode(customerSource);
		return baseDictList;
	}

}
