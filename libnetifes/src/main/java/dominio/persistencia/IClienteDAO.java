

package dominio.persistencia;


import java.util.List;
import dominio.Cliente;

/**
 *
 * @author felipe
 */
public interface IClienteDAO extends IGenericDAO<Cliente> {
    
       public List<Cliente> buscaClientesApartirDoAno(int ano);
       
    
}
