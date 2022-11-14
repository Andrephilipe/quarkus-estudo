package acc.br;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class PrimeiraCDI {
    
    public String getFirst(){
        return "Hello, CDI";
    }
}
