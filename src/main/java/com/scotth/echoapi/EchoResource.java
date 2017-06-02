package com.scotth.echoapi;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("echo")
public class EchoResource {

	@GET
	@Path("/{echoinput}")
	@Produces("application/json")
	public Response getEcho(@PathParam("echoinput") String echoinput) {
		Echo echoResponse = new Echo();
		echoResponse.setTimestamp(new Date());
		if (echoinput != null) {
			echoResponse.setEcho(echoinput);
		}
		return Response.status(200).entity(echoResponse).build();
	}
}
