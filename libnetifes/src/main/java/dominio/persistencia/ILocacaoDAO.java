

package dominio.persistencia;


import java.util.List;
import dominio.Locacao;

/**
 *
 * @author felipe
 */
public interface ILocacaoDAO extends IGenericDAO<Locacao> {
    
       public List<Locacao> buscaClientesApartirDoAno(int ano);
       
    
}
