package com.study.pojo;
/*
* @author quchengguo
* @version 2018年4月27日 下午7:19:30
* 客户信息列表对象
*/
public class QueryVo {
	private String custName;
	private String custSource;
	private String custIndustry;
	private String custLevel;
	
	private Integer page = 1;
	private Integer start;
	private Integer size = 10;
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
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
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "QueryVo [custName=" + custName + ", custSource=" + custSource + ", custIndustry=" + custIndustry
				+ ", custLevel=" + custLevel + ", page=" + page + ", start=" + start + ", size=" + size + "]";
	}
}