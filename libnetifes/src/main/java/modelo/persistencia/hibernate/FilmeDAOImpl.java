
package modelo.persistencia.hibernate;


import java.util.List;
import modelo.Cliente;

/**
 * @author felipe
 */
public class FilmeDAOImpl  extends GenericDAOImpl<Cliente> implements IClienteDAO {

       
    
    
        public List<Cliente> buscaClientesApartirDoAno(int ano){            
            HibernateUtil hibernate = new HibernateUtil();        
            this.sessao = hibernate.getSession();
            transacao = sessao.beginTransaction();                        
            List<Cliente> lista = sessao.createQuery("from cliente where ano >= " + ano).list();
            transacao.commit();            
            sessao.close();
            return lista;
        }
    
}
