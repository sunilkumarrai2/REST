package com.sunil.restws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;;

//@Path here defines class level path. Identifies the URI path that a resource class will serve requests for.
@Path("UserInfoService")
public class UserInfo {

	@GET
	@Path("/name/{i}")
	@Produces(MediaType.TEXT_XML)
	public String userName(@PathParam("i") String i){
		String name=i;
		return "<User>"+"<Name>"+name+"</Name>"+"</User>";
	}
	
	@GET
	@Path("/age/{j}")
	@Produces(MediaType.TEXT_XML)
	public String userAge(@PathParam("j") int j){
		int age=j;
		return "<User>" + "<Age>" + age + "</Age>" + "</User>";
	}
}
