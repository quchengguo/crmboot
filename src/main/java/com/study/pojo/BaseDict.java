package com.study.pojo;
/*
* @author quchengguo
* @version 2018年4月26日 上午10:42:29
*/
public class BaseDict {
	private String dictId;
	private String dictTypeCode;
	private String dictTypeName;
	private String dictItemName;
	private String dictItemCode;
	private Integer dictSort;
	private Boolean dictEnable;
	private String dictMemo;
	
	public BaseDict() {	}

	public BaseDict(String dictId, String dictTypeCode, String dictTypeName, String dictItemName, String dictItemCode,
			Integer dictSort, Boolean dictEnable, String dictMemo) {
		this.dictId = dictId;
		this.dictTypeCode = dictTypeCode;
		this.dictTypeName = dictTypeName;
		this.dictItemName = dictItemName;
		this.dictItemCode = dictItemCode;
		this.dictSort = dictSort;
		this.dictEnable = dictEnable;
		this.dictMemo = dictMemo;
	}
	

	public String getDictId() {
		return dictId;
	}

	public void setDictId(String dictId) {
		this.dictId = dictId;
	}

	public String getDictTypeCode() {
		return dictTypeCode;
	}

	public void setDictTypeCode(String dictTypeCode) {
		this.dictTypeCode = dictTypeCode;
	}

	public String getDictTypeName() {
		return dictTypeName;
	}

	public void setDictTypeName(String dictTypeName) {
		this.dictTypeName = dictTypeName;
	}

	public String getDictItemName() {
		return dictItemName;
	}

	public void setDictItemName(String dictItemName) {
		this.dictItemName = dictItemName;
	}

	public String getDictItemCode() {
		return dictItemCode;
	}

	public void setDictItemCode(String dictItemCode) {
		this.dictItemCode = dictItemCode;
	}

	public Integer getDictSort() {
		return dictSort;
	}

	public void setDictSort(Integer dictSort) {
		this.dictSort = dictSort;
	}

	public Boolean getDictEnable() {
		return dictEnable;
	}

	public void setDictEnable(Boolean dictEnable) {
		this.dictEnable = dictEnable;
	}

	public String getDictMemo() {
		return dictMemo;
	}

	public void setDictMemo(String dictMemo) {
		this.dictMemo = dictMemo;
	}

	@Override
	public String toString() {
		return "BaseDict [dictId=" + dictId + ", dictTypeCode=" + dictTypeCode + ", dictTypeName=" + dictTypeName
				+ ", dictItemName=" + dictItemName + ", dictItemCode=" + dictItemCode + ", dictSort=" + dictSort
				+ ", dictEnable=" + dictEnable + ", dictMemo=" + dictMemo + "]";
	}
}
