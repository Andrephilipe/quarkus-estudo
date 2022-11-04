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

import acc.br.model.Fruta;

@Path("/frutas")
public class FrutasResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Fruta> list() {
        return Fruta.listAll();
    }
    
    @POST
    @Transactional
    public void addFrutas(Fruta fruta) {
        fruta.persist();
    }

    @DELETE
    @Transactional
    public void delete(Fruta fruta) {
        Fruta f  = Fruta.findById(fruta.id);
        if(f!=null){
            Fruta.deleteById(fruta.id);
        }else{
            throw new NotFoundException("Unknown fruit id : " + fruta.id);
        }
    }


}
