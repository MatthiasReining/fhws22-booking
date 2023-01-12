package de.fhws;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;

@Path("sample")
public class SampleResource {

	@Inject
	@ConfigProperty(name = "message")
	private String message;

	@GET
	public Response message() {
		return Response.ok(message).build();
	}

	/**
	 * Hello Message
	 * @return 
	 */
	@Operation(summary = "Hello message", description = "Simple stupid hello message")
	@APIResponses(value = {
			@APIResponse(responseCode = "200", description = "Hello Message", content = @Content(mediaType = MediaType.TEXT_PLAIN)),
			@APIResponse(responseCode = "404", description = "No hello") })
	@GET
	@Path("hello")
	public String helloMessage() {
		return "Hello THWS";
	}

}
