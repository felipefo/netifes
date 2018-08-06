

package modelo.persistencia;


import java.util.List;
import modelo.Cliente;

/**
 *
 * @author felipe
 */
public interface IClienteDAO extends IGenericDAO<Cliente> {
    
       public List<Cliente> buscaClientesApartirDoAno(int ano);
       
    
}
