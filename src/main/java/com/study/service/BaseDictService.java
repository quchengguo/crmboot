package com.study.service;

import java.util.List;

import com.study.pojo.BaseDict;

/*
* @author quchengguo
* @version 2018年4月26日 上午11:40:13
*/
public interface BaseDictService {

	List<BaseDict> getCustomerList(String customerSource);

}
