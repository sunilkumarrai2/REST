package com.sunil.restws.client;

import java.net.URI;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class Test {

	private static URI getBaseURI() {
	   // return UriBuilder.fromUri("http://localhost:8080/de.vogella.jersey.first").build();
	    return UriBuilder.fromUri("http://localhost:8080/RESTfulWS").build();
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client=Client.create(new DefaultClientConfig());
		WebResource service=client.resource(getBaseURI());
		
		System.out.println(service.path("rest").path("UserInfoService").path("name").path("Sunil").accept(MediaType.TEXT_XML).get(ClientResponse.class).toString());
	}

}
