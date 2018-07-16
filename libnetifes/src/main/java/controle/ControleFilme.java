
package controle;

import modelo.persistencia.hibernate.FilmeDAOImpl;

public class ControleFilme<Filme> extends ControleGenerico<Filme> {
       
    public ControleFilme() {
        super(new FilmeDAOImpl(), modelo.Filme.class);
    }    
   
}
