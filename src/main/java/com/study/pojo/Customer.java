package com.study.pojo;

import java.util.Date;

/*
* @author quchengguo
* @version 2018年4月26日 上午10:49:19
*/
public class Customer {
	private Long custId;
	private String custName;
	private Long custUserId;
	private Long custCreateId;
	private String custSource;
	private String custIndustry;
	private String custLevel;
	private String custLinkman;
	private String custPhone;
	private String custMobile;
	private String custZipcode;
	private String custAddress;
	private Date custCreatetime;
	
	public Customer() {	}

	public Customer(Long custId, String custName, Long custUserId, Long custCreateId, String custSource,
			String custIndustry, String custLevel, String custLinkman, String custPhone, String custMobile,
			String custZipcode, String custAddress, Date custCreatetime) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custUserId = custUserId;
		this.custCreateId = custCreateId;
		this.custSource = custSource;
		this.custIndustry = custIndustry;
		this.custLevel = custLevel;
		this.custLinkman = custLinkman;
		this.custPhone = custPhone;
		this.custMobile = custMobile;
		this.custZipcode = custZipcode;
		this.custAddress = custAddress;
		this.custCreatetime = custCreatetime;
	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Long getCustUserId() {
		return custUserId;
	}

	public void setCustUserId(Long custUserId) {
		this.custUserId = custUserId;
	}

	public Long getCustCreateId() {
		return custCreateId;
	}

	public void setCustCreateId(Long custCreateId) {
		this.custCreateId = custCreateId;
	}

	public String getCustSource() {
		return custSource;
	}

	public void setCustSource(String custSource) {
		this.custSource = custSource;
	}

	public String getCustIndustry() {
		return custIndustry;
	}

	public void setCustIndustry(String custIndustry) {
		this.custIndustry = custIndustry;
	}

	public String getCustLevel() {
		return custLevel;
	}

	public void setCustLevel(String custLevel) {
		this.custLevel = custLevel;
	}

	public String getCustLinkman() {
		return custLinkman;
	}

	public void setCustLinkman(String custLinkman) {
		this.custLinkman = custLinkman;
	}

	public String getCustPhone() {
		return custPhone;
	}

	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}

	public String getCustMobile() {
		return custMobile;
	}

	public void setCustMobile(String custMobile) {
		this.custMobile = custMobile;
	}

	public String getCustZipcode() {
		return custZipcode;
	}

	public void setCustZipcode(String custZipcode) {
		this.custZipcode = custZipcode;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public Date getCustCreatetime() {
		return custCreatetime;
	}

	public void setCustCreatetime(Date custCreatetime) {
		this.custCreatetime = custCreatetime;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custUserId=" + custUserId
				+ ", custCreateId=" + custCreateId + ", custSource=" + custSource + ", custIndustry=" + custIndustry
				+ ", custLevel=" + custLevel + ", custLinkman=" + custLinkman + ", custPhone=" + custPhone
				+ ", custMobile=" + custMobile + ", custZipcode=" + custZipcode + ", custAddress=" + custAddress
				+ ", custCreatetime=" + custCreatetime + "]";
	}
	
}
