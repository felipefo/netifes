

package modelo.persistencia.hibernate;


import java.util.List;
import modelo.Cliente;

/**
 *
 * @author felipe
 */
public interface ClienteDAO extends GenericDAO<Cliente> {
    
       public List<Cliente> buscaClientesApartirDoAno(int ano);
       
    
}
