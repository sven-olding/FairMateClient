package com.gi.crm.fairmate.rest;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.http.client.ClientProtocolException;
import org.junit.BeforeClass;
import org.junit.Test;

import com.gi.crm.fairmate.model.LeadList;
import com.gi.crm.fairmate.model.Ping;

public class FairMateRestClientTest
{

	private static FairMateRestClient fairMateClient;

	@BeforeClass
	public static void setUp() throws Exception
	{
		fairMateClient = new FairMateRestClient("https", "lt-staging-web.dimedis.de", "example_fair2017",
				"admin_code_11", "lic_example_fair2017_117");
	}

	@Test
	public void testPing() throws ClientProtocolException, IOException, URISyntaxException
	{
		Ping ping = fairMateClient.ping();
		assertThat(ping, is(not(nullValue())));
		assertThat(ping.getTimestamp(), is(not(nullValue())));
	}

	@Test
	public void testGetLeads() throws ClientProtocolException, URISyntaxException, IOException
	{
		LeadList leadList = fairMateClient.getLeadList(0, 10);
		assertThat(leadList, is(not(nullValue())));
	}
}
