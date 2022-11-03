package acc.br;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/helloworld")
public class TestNew {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String teste() {
        return "Hello World";
    }
}