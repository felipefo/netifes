

package modelo.persistencia.hibernate;


import java.util.List;
import modelo.Locacao;

/**
 *
 * @author felipe
 */
public interface ILocacaoDAO extends GenericDAO<Locacao> {
    
       public List<Locacao> buscaClientesApartirDoAno(int ano);
       
    
}
