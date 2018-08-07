package aplicacao;

import java.util.logging.Level;
import java.util.logging.Logger;
import dominio.Cliente;
import dominio.Filme;
import dominio.Locacao;

public class FabricaDeControle {

    public enum EstretegiaPersistencia {
        HIBERNATE, JDBC
    };
    private  EstretegiaPersistencia estrategia = EstretegiaPersistencia.HIBERNATE;

    public EstretegiaPersistencia getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(EstretegiaPersistencia estrategia) {
        this.estrategia = estrategia;
    }

    /*
      Método static responsavel por instanciar a classe de controle  dado o 
    tipo do controle que deve ser isntanciado. Esse método é a implmentação do 
    padrão método fábrica dos padrões GOF.
     */
    public IControle getControle(String nomeControle) {
        IControle controle = null;
        try {
            if (nomeControle.equals("locacao")) {
                controle = new ControleLocacao<Locacao>();
                if (this.estrategia == EstretegiaPersistencia.HIBERNATE) {
                    controle.setDAO(new persistencia.hibernate.LocacaoDAOImpl());
                }
            } else if (nomeControle.equals("cliente")) {
                controle = new ControleCliente<Cliente>();
                controle.setDAO(new persistencia.hibernate.ClienteDAOImpl());
            } else if (nomeControle.equals("filme")) {
                controle = new ControleFilme<Filme>();
                if (this.estrategia == EstretegiaPersistencia.HIBERNATE) {
                    controle.setDAO(new persistencia.hibernate.FilmeDAOImpl());
                } else {
                    controle.setDAO(new persistencia.jdbc.FilmeDAOImpl());
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(FabricaDeControle.class.getName()).log(Level.SEVERE, null, ex);
        }
        return controle;
    }
}
