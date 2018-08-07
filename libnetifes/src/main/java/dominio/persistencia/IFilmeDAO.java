

package dominio.persistencia;


import java.util.List;
import dominio.Filme;

/**
 *
 * @author felipe
 */
public interface IFilmeDAO extends IGenericDAO<Filme> {
    
       public List<Filme> buscaClientesApartirDoAno(int ano);
       
    
}
