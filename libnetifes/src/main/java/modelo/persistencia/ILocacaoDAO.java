

package modelo.persistencia;


import java.util.List;
import modelo.Locacao;

/**
 *
 * @author felipe
 */
public interface ILocacaoDAO extends IGenericDAO<Locacao> {
    
       public List<Locacao> buscaClientesApartirDoAno(int ano);
       
    
}
