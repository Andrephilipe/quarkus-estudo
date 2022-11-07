package acc.br.model;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Vendedores extends PanacheEntity {

	public String nome;
	public String endereco;
    public String documento;
    public int idade;
}
