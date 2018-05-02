package com.study.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.study.pojo.BaseDict;
import com.study.pojo.Customer;
import com.study.pojo.QueryVo;
import com.study.service.BaseDictService;
import com.study.service.CustomerService;
import com.study.utils.Page;

/*
* @author quchengguo
* @version 2018年4月26日 上午10:12:32
*/
@Controller
@RequestMapping("/customer")
public class CustomController {
	private final Logger log = LoggerFactory.getLogger(CustomController.class);
	
	// 客户来源
	@Value("${customer_source}")
	private String customerSource;
	// 客户行业
	@Value("${customer_industry}")
	private String customerIndustry;
	// 客户级别
	@Value("${customer_level}")
	private String customerLevel;
	
	@Autowired
	private BaseDictService baseDictService;
	@Autowired
	private CustomerService customerService;
	
	
	/**
	 * 显示custom.jsp页面
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping("/list")
	public ModelAndView getCustomList(Model model, QueryVo queryVo) throws UnsupportedEncodingException {
//		 转换模糊查询是字符乱码，直接修改tomcat的server.xml文件中的编码也是可以的
//		if(StringUtils.isNotBlank(queryVo.getCustName())) {
//			String custName = new String(queryVo.getCustName().getBytes("ISO-8859-1"), "UTF-8");
//			queryVo.setCustName(custName);
//		}
		
		List<BaseDict> customerList = baseDictService.getCustomerList(customerSource);
		List<BaseDict> customerIndustryList = baseDictService.getCustomerList(customerIndustry);
		List<BaseDict> customerLevelList = baseDictService.getCustomerList(customerLevel);
		ModelAndView view = new ModelAndView();
		
		log.info("*********customerList size: " + customerList.size());
		// 显示下拉框数据
		view.addObject("fromType", customerList);
		view.addObject("industryType", customerIndustryList);
		view.addObject("levelType", customerLevelList);
		view.setViewName("customer");
		
		// 展示客户信息列表
		Page<Customer> queryCustomerList = customerService.getCustomerList(queryVo);
		model.addAttribute("page", queryCustomerList);
		model.addAttribute("custName", queryVo.getCustName());
		model.addAttribute("custSource", queryVo.getCustSource());
		model.addAttribute("custIndustry", queryVo.getCustIndustry());
		model.addAttribute("custLevel", queryVo.getCustLevel());
		return view;
	}
	
	/**
	 *修改时回显数据 
	 */
	@RequestMapping("/edit")
	@ResponseBody
	public Customer getCustomerById (Long id) {
		Customer getCustomerById = customerService.getCustomerListById(id);
		log.info(getCustomerById.toString());
		return getCustomerById;
	}
	
	/**
	 * 保存修改之后的数据
	 */
	@RequestMapping("/update")
	@ResponseBody
	public String updateCustomer(Customer customer) {
		customerService.updateCustomer(customer);
		return "success";
	}
	
	/**
	 * 删除客户信息
	 */
	@RequestMapping("/delete")
	@ResponseBody()
	public String deleteCustomer(Long id) {
		log.info(id.toString());
		customerService.deleteCustomer(id);
		return "success";
	}
	
}
