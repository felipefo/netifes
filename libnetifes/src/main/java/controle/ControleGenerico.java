/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import modelo.persistencia.hibernate.GenericDAO;

/**
 * Controlador Generico para ser utilizado por todos os cruds
 * @author felipe
 */
public abstract class ControleGenerico<T> implements IControle<T> {
            
    private final GenericDAO dao;
    private final Class type;

    public ControleGenerico(GenericDAO dao, Class type) {
        this.dao = dao;
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
