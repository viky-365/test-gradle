package com.abc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path(value = "/hello")
public class HelloWorldController {

	@GET
	@Path("/{name}")
	public Response getMessage(@PathParam("name") String name, Object s) {
		String msg = "Hello, " + name;

		List<String> l1 = Arrays.asList("Larry", "Moe", "Curly");
		String l2 = l1.stream().map(e -> e.toUpperCase())
				.collect(Collectors.toList()).toString();

		return Response.status(200).entity(msg + "...." + l2).build();
	}
}
