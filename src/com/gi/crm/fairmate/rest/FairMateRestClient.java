package com.gi.crm.fairmate.rest;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.utils.URIBuilder;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.gi.crm.fairmate.model.LeadList;
import com.gi.crm.fairmate.model.Ping;
import com.gi.rest.SimpleRestClient;

/**
 * REST client for access to FairMate data
 * 
 * @author SOL
 */
public class FairMateRestClient extends SimpleRestClient
{

	/** API route to get scanned leads from */
	private static final String		LEADS_PATH				= "/leads";

	/** API route to test if server is available */
	private static final String		PING_PATH				= "/ping";

	/** Jackson ObjectMapper instance to deserialize JSON data */
	private ObjectMapper			objectMapper			= null;

	/** date format for use in data structure to append as URL parameter for the service calls */
	private static SimpleDateFormat	dataTimestampDateFormat	= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

	/** the uri scheme, should be either http or https */
	private String					scheme					= null;

	/** the target host for the requests */
	private String					targetHost				= null;

	/** the fair id that will be added as request header */
	private String					fairId					= null;

	/** the admin code that will be added as request header */
	private String					adminCode				= null;

	/** the license code that will be added as request header */
	private String					licenseCode				= null;

	/**
	 * Constructor
	 * 
	 * @param baseUrl the base url for the REST service
	 * @param fairId the fair id
	 * @param adminCode the admin code
	 * @param licenseCode the license code
	 */
	public FairMateRestClient(String scheme, String targetHost, String fairId, String adminCode, String licenseCode)
	{
		super();
		setScheme(scheme);
		setTargetHost(targetHost);
		setFairId(fairId);
		setAdminCode(adminCode);
		setLicenseCode(licenseCode);
	}

	/**
	 * test if the service endpoint is available
	 * 
	 * @return the repsonse code and message from the ping request
	 * @throws IOException
	 * @throws ClientProtocolException
	 * @throws URISyntaxException
	 */
	public Ping ping() throws ClientProtocolException, IOException, URISyntaxException
	{
		URI uri = new URIBuilder().setScheme(getScheme()).setHost(getTargetHost()).setPath(PING_PATH).build();

		String response = doGet(uri.toString(), getFairMateRequestHeaders());

		return getObjectMapper().readValue(response, Ping.class);
	}

	/**
	 * get the synced leads from fair server
	 * 
	 * @param offset the record offset
	 * @param pageSize indicating how many leads shall be returned
	 * @return the list of leads
	 * @throws URISyntaxException
	 * @throws IOException
	 * @throws ClientProtocolException
	 */
	public LeadList getLeadList(int offset, int pageSize)
			throws URISyntaxException, ClientProtocolException, IOException
	{
		URI uri = new URIBuilder().setScheme(getScheme()).setHost(getTargetHost()).setPath(LEADS_PATH)
				.addParameter("data", createGetLeadsDataStructure(offset, pageSize)).build();

		String response = doGet(uri.toString(), getFairMateRequestHeaders());

		return getObjectMapper().readValue(response, LeadList.class);
	}

	/**
	 * create URL encoded data structure for use as URL parameter
	 * 
	 * @param offset
	 * @param pageSize
	 * @return the data
	 * @throws UnsupportedEncodingException
	 */
	private String createGetLeadsDataStructure(int offset, int pageSize) throws UnsupportedEncodingException
	{
		ObjectNode jsonObj = getObjectMapper().createObjectNode();
		jsonObj.put("offset", offset);
		jsonObj.put("page_size", pageSize);
		jsonObj.put("timestamp", dataTimestampDateFormat.format(new Date()));
		jsonObj.put("direction", "desc");

		return jsonObj.toString();
	}

	/**
	 * get request headers necessary for fairmate
	 * 
	 * @return a map containing the necessary header data
	 */
	private HashMap<String, String> getFairMateRequestHeaders()
	{
		HashMap<String, String> props = new HashMap<String, String>();
		props.put("Accept", "application/json");
		props.put("X-Admin-Code", getAdminCode());
		props.put("X-Fair-Id", getFairId());
		props.put("X-License-Code", getLicenseCode());
		return props;
	}

	/**
	 * @return the ObjectMapper
	 */
	public ObjectMapper getObjectMapper()
	{
		if (objectMapper == null) {
			objectMapper = new ObjectMapper().configure(JsonParser.Feature.ALLOW_COMMENTS, true);
		}
		return objectMapper;
	}

	/**
	 * @return the fairId
	 */
	public String getFairId()
	{
		return fairId;
	}

	/**
	 * @param fairId the fairId to set
	 */
	public void setFairId(String fairId)
	{
		this.fairId = fairId;
	}

	/**
	 * @return the adminCode
	 */
	public String getAdminCode()
	{
		return adminCode;
	}

	/**
	 * @param adminCode the adminCode to set
	 */
	public void setAdminCode(String adminCode)
	{
		this.adminCode = adminCode;
	}

	/**
	 * @return the licenseCode
	 */
	public String getLicenseCode()
	{
		return licenseCode;
	}

	/**
	 * @param licenseCode the licenseCode to set
	 */
	public void setLicenseCode(String licenseCode)
	{
		this.licenseCode = licenseCode;
	}

	/**
	 * @return the scheme
	 */
	public String getScheme()
	{
		return scheme;
	}

	/**
	 * @param scheme the scheme to set
	 */
	public void setScheme(String scheme)
	{
		this.scheme = scheme;
	}

	/**
	 * @return the targetHost
	 */
	public String getTargetHost()
	{
		return targetHost;
	}

	/**
	 * @param targetHost the targetHost to set
	 */
	public void setTargetHost(String targetHost)
	{
		this.targetHost = targetHost;
	}

}
