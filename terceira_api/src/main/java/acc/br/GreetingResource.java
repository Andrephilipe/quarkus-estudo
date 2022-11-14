package acc.br;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.inject.Inject;

@Path("/hello")
public class GreetingResource {

    @Inject
    PrimeiraCDI primeiraCDI;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return primeiraCDI.getFirst();
    }

}