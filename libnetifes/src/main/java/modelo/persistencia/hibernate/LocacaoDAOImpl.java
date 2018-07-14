
package modelo.persistencia.hibernate;


import java.util.List;
import modelo.Locacao;

/**
 * @author felipe
 */
public class LocacaoDAOImpl  extends GenericDAOImpl<Locacao> implements LocacaoDAO {

        public List<Locacao> buscaClientesApartirDoAno(int ano){            
            sessao = HibernateUtil.getSession();
            transacao = sessao.beginTransaction();                        
            List<Locacao> lista = sessao.createQuery("from locacao where ano >= " + ano).list();
            transacao.commit();            
            sessao.close();
            return lista;
        }
    
}
