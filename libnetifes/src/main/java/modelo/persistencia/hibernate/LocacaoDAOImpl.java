
package modelo.persistencia.hibernate;


import modelo.persistencia.ILocacaoDAO;
import java.util.List;
import modelo.Locacao;

/**
 * @author felipe
 */
public class LocacaoDAOImpl  extends GenericDAOImpl<Locacao> implements ILocacaoDAO {

        public List<Locacao> buscaClientesApartirDoAno(int ano){            
            transacao = sessao.beginTransaction();                        
            List<Locacao> lista = sessao.createQuery("from locacao where ano >= " + ano).list();
            transacao.commit();            
            sessao.close();
            return lista;
        }
    
}
