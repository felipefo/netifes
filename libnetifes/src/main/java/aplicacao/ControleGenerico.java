
package aplicacao;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import dominio.persistencia.IGenericDAO;

/**
 * Controlador Generico para ser utilizado por todos os cruds
 * @author felipe
 */
public abstract class ControleGenerico<T> implements IControle<T> {
            
 
    private IGenericDAO dao;
    private Class type;    
    

    public IGenericDAO getDao() {
        return dao;
    }
    
    public void setDAO(IGenericDAO object) throws Exception {
        this.dao = object;
    }
         
    
    public ControleGenerico(IGenericDAO dao, Class type) {
        this.dao = dao;
        this.type = type;      
    }

    public ControleGenerico(Class type) {        
        this.type = type;      
    }

    

    @Override
    public String pegarTodos() throws Exception {
        //conversao para json.              
        List<T> lista = this.dao.listar(type);
        ObjectMapper mapper = new ObjectMapper();
        String jsonLocacoes = mapper.writeValueAsString(lista);
        return jsonLocacoes;
    }

    @Override
    public void inserir(T obj) throws Exception {
        this.dao.inserir(obj);
    }

    @Override
    public void remover(T obj) throws Exception {
        this.dao.deletar(obj);
    }

}
