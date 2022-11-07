package acc.br;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import acc.br.model.Vendedores;

@Path("/vendedores")
public class VendedoresResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Vendedores> list() {
        return Vendedores.listAll();
    }
    
    @POST
    @Transactional
    public void addFrutas(Vendedores vendedores) {
            vendedores.persist();
    }

    @DELETE
    @Transactional
    public void delete(Vendedores vendedores) {
        Vendedores f  = Vendedores.findById(vendedores.id);
        if(f!=null){
            Vendedores.deleteById(vendedores.id);
        }else{
            throw new NotFoundException("Unknown fruit id : " + vendedores.id);
        }
    }


}
