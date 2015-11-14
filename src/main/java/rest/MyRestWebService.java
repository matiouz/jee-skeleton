package rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/restsample")
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
public class MyRestWebService {

    // Available at this URL: http://localhost:8080/webAppTest/restsample/multiply/3/7
    // where 3 is the value for param1 and 7 is the value for param2
    @GET
    @Path("multiply/{param1}/{param2}")
    @Produces ({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String myMethod (
            @PathParam("param1") java.lang.Integer param1,
            @PathParam("param2") java.lang.Integer param2) {
        return  Integer.toString(param1 * param2);
    }

}
