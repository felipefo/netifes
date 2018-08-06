
package modelo.persistencia.jdbc;


import modelo.persistencia.IFilmeDAO;
import java.util.List;
import modelo.Filme;

/**
 * @author felipe
 */
public class FilmeDAOImpl implements IFilmeDAO {

    
    public void inserir(Filme obj) throws Exception {
        //todo salvar o objeto filme.
        System.out.println("Salvar o objeto filme");
    }

    public void alterar(Filme obj) throws Exception {
        System.out.println("Alterar o objeto filme");
    }

    public void deletar(Filme obj) throws Exception {
        System.out.println("Remover o objeto filme");
    }
      

    public void rollBack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Filme> buscaClientesApartirDoAno(int ano) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Filme> listar(Class clazz) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Filme listar(Class clazz, String pk) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
