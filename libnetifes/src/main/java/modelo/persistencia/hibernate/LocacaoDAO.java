

package modelo.persistencia.hibernate;


import java.util.List;
import modelo.Locacao;

/**
 *
 * @author felipe
 */
public interface LocacaoDAO extends GenericDAO<Locacao> {
    
       public List<Locacao> buscaClientesApartirDoAno(int ano);
       
    
}
