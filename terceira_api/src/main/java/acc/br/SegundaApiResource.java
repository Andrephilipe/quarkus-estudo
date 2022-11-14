package acc.br;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.inject.Inject;

@Path("/ola")
public class SegundaApiResource {
    
    @Inject
    SegundaCDI segundaCDI;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String ola(){
        return segundaCDI.getSecond();
    }
}
