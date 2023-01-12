package de.fhws.booking.resource;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import de.fhws.booking.control.HardWorkerService;

@Path("hard")
public class HardWorkerResource {
	
	@Inject
	HardWorkerService hws;
	
	@GET
	@Path("a")
	public String startA() {
		return hws.serviceAIsWorkingTimeByTime();
	}
	
	
	@GET
	@Path("c")
	public String startC() {
		return hws.serviceC();
	}

}
