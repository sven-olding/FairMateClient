package com.gi.crm.fairmate.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ping implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 50486767801260914L;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	private Date	timestamp;

	@JsonProperty("timestamp_config")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	private Date	timestampConfig;

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
	 * @return the timestampConfig
	 */
	public Date getTimestampConfig()
	{
		return timestampConfig;
	}

	/**
	 * @param timestampConfig the timestampConfig to set
	 */
	public void setTimestampConfig(Date timestampConfig)
	{
		this.timestampConfig = timestampConfig;
	}

	/**
	 * @return the version
	 */
	public String getVersion()
	{
		return version;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(String version)
	{
		this.version = version;
	}

	private String	version;
}
