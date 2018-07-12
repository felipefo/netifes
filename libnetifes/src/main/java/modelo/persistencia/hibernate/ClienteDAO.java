

package modelo.persistencia.hibernate;


import java.util.List;
import model.Cliente;

/**
 *
 * @author felipe
 */
public interface ClienteDAO extends GenericDAO<Cliente> {
    
       public List<Cliente> buscaClientesApartirDoAno(int ano);
       
    
}
