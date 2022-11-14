package acc.br;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class SegundaCDI {
   
    public String getSecond(){
        return "Hello";
    }
}
