package krasa.cxf.bug;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import org.slf4j.*;

@Path("/rest/")
public class Endpoint {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@POST
	public Response create() {
		return Response.serverError().build();
	}
}