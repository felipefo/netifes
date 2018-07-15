package controle;

import java.sql.Time;
import java.util.Date;
import junit.framework.TestCase;
import modelo.Locacao;

/**
 *
 * @author felipe
 */
public class ControleLocacaoTest extends TestCase {
    
    public ControleLocacaoTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getClientes method, of class ControleCliente.
     */
    public void testGetClientes() throws Exception {
        
        Locacao novaLocacao = new Locacao();
        novaLocacao.setData(new Date());       
        ControleLocacao<Locacao> controleLocacao = new ControleLocacao<Locacao>();                
        controleLocacao.inserir(novaLocacao);
                        
        System.out.println(controleLocacao.pegarTodos());        
        
    }
    
}
