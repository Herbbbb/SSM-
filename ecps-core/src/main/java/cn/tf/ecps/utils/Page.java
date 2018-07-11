package cn.tf.ecps.utils;

import java.util.List;

public class Page {
	/**
	 * 当前页码
	 */
	private int pageNo = 1;
	/**
	 * 每页记录数
	 */
	private int pageSize = 10;
	
	
	/**
	 * 指定查询条件下的记录数
	 */
	private int totalCount = 0;
	
	/**
	 * 指定查询条件下的总页数
	 */
	private int totalPage = 1;
	
	/**
	 * 开始行号和结束行号
	 */
	private int endNum = 0;
	/**
	 * 
	 */
	private int startNum = 0;
	
	/**
	 * 结果集
	 */
	
	private List<?> list;

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	/**
	 * 
	 * pageSize		totalCount 		totalPage	
	 *     10			0				1
	 *     10			93				10
	 *     10			100				10
	 * 
	 * @return
	 */
	public int getTotalPage() {
		totalPage = totalCount/pageSize;
		if(totalCount == 0 || totalCount%pageSize != 0){
			totalPage++;
		}
		return totalPage;
	}

	
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	/**
	 * 获得结束行号
	 * @return
	 */
	public int getEndNum() {
		return pageNo * pageSize + 1;
	}

	/**
	 * 获得开始行号
	 * @param endNum
	 */
	public void setEndNum(int endNum) {
		this.endNum = endNum;
	}

	public int getStartNum() {
		return (pageNo - 1)*pageSize;
	}

	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}

	public List<?> getList() {
		return list;
	}

	public void setList(List<?> list) {
		this.list = list;
	}
	
	
	
	
 
	
	
	

}
