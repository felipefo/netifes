

package modelo.persistencia.hibernate;


import java.util.List;
import modelo.Cliente;

/**
 *
 * @author felipe
 */
public interface IClienteDAO extends GenericDAO<Cliente> {
    
       public List<Cliente> buscaClientesApartirDoAno(int ano);
       
    
}
