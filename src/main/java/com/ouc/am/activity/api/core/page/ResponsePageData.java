package com.ouc.am.activity.api.core.page;

import java.io.Serializable;
import java.util.List;

public class ResponsePageData<T> implements Serializable {
	private static final long serialVersionUID = 1L;
	private int pageSize;
	private int currentPage;
	private int count;
	private int totalPages;
	private List<T> list;
	public ResponsePageData(List<T> list,Integer count,Integer pageSize,Integer currentPage){
		this.setList(list);
		this.setCount(count);
		this.setPageSize(pageSize);
		this.setCurrentPage(currentPage);
		if(count != 0 && count%pageSize == 0)
			this.setTotalPages(count/pageSize);
		else
			this.setTotalPages(count/pageSize + 1);
		
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
}
