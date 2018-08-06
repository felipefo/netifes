
package controle;

import modelo.persistencia.IGenericDAO;


/**
 *
 * @author felip_kja6gpn
 */
public interface IControle<T> {
    
    
        public String pegarTodos() throws Exception;
        public void inserir(T objeto) throws Exception;
        public void remover(T object) throws Exception;
        public void setDAO(IGenericDAO object) throws Exception;

}
