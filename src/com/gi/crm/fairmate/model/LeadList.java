package com.gi.crm.fairmate.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LeadList implements Serializable
{

	/**
	 * 
	 */
	private static final long	serialVersionUID	= -2193183121321112676L;

	// @JsonSerialize(using = DateSerializerTimestampLeadList.class)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
	private Date				timestamp			= null;

	@JsonProperty("records")
	private Lead[]				leads;

	@JsonProperty("total_count")
	private int					totalCount;

	@JsonProperty("max_page_size")
	private int					maxPageSize;

	@JsonProperty("current_page_size")
	private int					currentPageSize;

	@JsonProperty("row_offset")
	private int					rowOffset;

	@JsonProperty("order_by")
	private String				orderBy;

	private String				direction;

	/**
	 * @return the timestamp
	 */
	public Date getTimestamp()
	{
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(Date timestamp)
	{
		this.timestamp = timestamp;
	}

	/**
	 * @return the leads
	 */
	public Lead[] getLeads()
	{
		return leads;
	}

	/**
	 * @param leads the leads to set
	 */
	public void setLeads(Lead[] leads)
	{
		this.leads = leads;
	}

	/**
	 * @return the totalCount
	 */
	public int getTotalCount()
	{
		return totalCount;
	}

	/**
	 * @param totalCount the totalCount to set
	 */
	public void setTotalCount(int totalCount)
	{
		this.totalCount = totalCount;
	}

	/**
	 * @return the maxPageSize
	 */
	public int getMaxPageSize()
	{
		return maxPageSize;
	}

	/**
	 * @param maxPageSize the maxPageSize to set
	 */
	public void setMaxPageSize(int maxPageSize)
	{
		this.maxPageSize = maxPageSize;
	}

	/**
	 * @return the rowOffset
	 */
	public int getRowOffset()
	{
		return rowOffset;
	}

	/**
	 * @param rowOffset the rowOffset to set
	 */
	public void setRowOffset(int rowOffset)
	{
		this.rowOffset = rowOffset;
	}

	/**
	 * @return the orderBy
	 */
	public String getOrderBy()
	{
		return orderBy;
	}

	/**
	 * @param orderBy the orderBy to set
	 */
	public void setOrderBy(String orderBy)
	{
		this.orderBy = orderBy;
	}

	/**
	 * @return the direction
	 */
	public String getDirection()
	{
		return direction;
	}

	/**
	 * @param direction the direction to set
	 */
	public void setDirection(String direction)
	{
		this.direction = direction;
	}


	/**
	 * @return the currentPageSize
	 */
	public int getCurrentPageSize()
	{
		return currentPageSize;
	}

	/**
	 * @param currentPageSize the currentPageSize to set
	 */
	public void setCurrentPageSize(int currentPageSize)
	{
		this.currentPageSize = currentPageSize;
	}
}
