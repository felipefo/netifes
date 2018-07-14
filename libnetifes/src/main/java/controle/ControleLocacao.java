
package controle;

import modelo.persistencia.hibernate.LocacaoDAOImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import modelo.Locacao;
import modelo.persistencia.hibernate.LocacaoDAO;


public class ControleLocacao {
        
    public LocacaoDAO clienteDao = new LocacaoDAOImpl();    
//    public enum FORMATO { JSON, XML };
//    private FORMATO formatoResposta;
//    
//    public ControleLocacao(FORMATO formatoResposta){
//////        this.formatoResposta = formatoResposta;        
//    }
//    
    public String getLocacoes() throws Exception{
        //conversao para json.
        List<Locacao> locacoes = clienteDao.listar(Locacao.class);
        ObjectMapper mapper = new ObjectMapper();
        String jsonLocacoes = mapper.writeValueAsString(locacoes);        
        return jsonLocacoes;        
    }    
    public void inserir(Locacao locacao) throws Exception{
        clienteDao.inserir(locacao);                
    }        
    public void remover(Locacao locacao) throws Exception{
        clienteDao.deletar(locacao);                
    }
    
    
    
}
