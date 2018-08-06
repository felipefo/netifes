
package modelo.persistencia;

import java.util.List;

/**
 *
 * @author felipe
 */
public interface IGenericDAO<T> {
 
    public void inserir( T obj ) throws Exception;
    public void alterar( T obj ) throws Exception;
    public void deletar( T obj ) throws Exception; 
    public List<T> listar(Class clazz) throws Exception;
    public T listar(Class clazz, String pk) throws Exception;
    public void rollBack();
}
