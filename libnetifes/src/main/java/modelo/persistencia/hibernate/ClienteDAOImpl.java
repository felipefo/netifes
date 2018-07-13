

package modelo.persistencia.hibernate;


import java.util.List;
import model.Cliente;


/**
 *
 * @author felipe
 */
public class ClienteDAOImpl  extends GenericDAOImpl<Cliente> implements ClienteDAO {

        public List<Cliente> buscaClientesApartirDoAno(int ano){            
            sessao = HibernateUtil.getSession();
            transacao = sessao.beginTransaction();                        
            List<Cliente> lista = sessao.createQuery("from Cliente where ano >= " + ano).list();
            transacao.commit();            
            sessao.close();
            return lista;
        }
    
}
