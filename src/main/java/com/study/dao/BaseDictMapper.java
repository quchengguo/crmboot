package com.study.dao;

import java.util.List;

import com.study.pojo.BaseDict;

/*
* @author quchengguo
* @version 2018年4月26日 上午11:37:11
*/
public interface BaseDictMapper {
	List<BaseDict> getCustomerByCode(String customerSource);
}
