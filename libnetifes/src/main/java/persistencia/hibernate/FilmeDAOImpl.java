
package persistencia.hibernate;


import dominio.persistencia.IClienteDAO;
import java.util.List;
import dominio.Cliente;

/**
 * @author felipe
 */
public class FilmeDAOImpl  extends GenericDAOImpl<Cliente> implements IClienteDAO {

       
    
    
        public List<Cliente> buscaClientesApartirDoAno(int ano){            
            this.sessao = HibernateUtility.getSession();
            
            transacao = sessao.beginTransaction();                        
            List<Cliente> lista = sessao.createQuery("from cliente where ano >= " + ano).list();
            transacao.commit();            
            sessao.close();
            return lista;
        }
    
}
