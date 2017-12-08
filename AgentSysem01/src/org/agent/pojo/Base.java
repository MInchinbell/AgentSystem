package org.agent.pojo;

import java.util.Date;

public class Base {

	private Integer id;
	private Integer starName;// 分页的起始页
	private Integer pageSize;// 页显示条数
	private Date startTime;
	private Date entTime;
	private String searchStr;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStarName() {
		return starName;
	}

	public void setStarName(Integer starName) {
		this.starName = starName;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEntTime() {
		return entTime;
	}

	public void setEntTime(Date entTime) {
		this.entTime = entTime;
	}

	public String getSearchStr() {
		return searchStr;
	}

	public void setSearchStr(String searchStr) {
		this.searchStr = searchStr;
	}
}
