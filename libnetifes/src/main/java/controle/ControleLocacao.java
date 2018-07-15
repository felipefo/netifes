package controle;

import modelo.persistencia.hibernate.LocacaoDAOImpl;


public class ControleLocacao<Locacao> extends ControleGenerico<Locacao> {

    public ControleLocacao() {             
        super(new LocacaoDAOImpl(),modelo.Locacao.class);
    }
    
    
}
