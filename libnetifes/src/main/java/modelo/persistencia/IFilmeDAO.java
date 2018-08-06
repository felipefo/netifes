

package modelo.persistencia;


import java.util.List;
import modelo.Filme;

/**
 *
 * @author felipe
 */
public interface IFilmeDAO extends IGenericDAO<Filme> {
    
       public List<Filme> buscaClientesApartirDoAno(int ano);
       
    
}
