

import controle.FabricaDeControle;
import controle.IControle;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import modelo.Locacao;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author felip_kja6gpn
 */
public class ServicoApiTest {
    
    public ServicoApiTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of processRequest method, of class ServicoApi.
     */
    @Test
    public void testProcessRequest() throws Exception {
    }

    /**
     * Test of doGet method, of class ServicoApi.
     */
    @Test
    public void testDoGet() throws Exception {
                
        IControle controleAction = FabricaDeControle.getControle("locacao");

        Locacao novaLocacao = new Locacao();
        novaLocacao.setData(new Date());                                                
        controleAction.inserir(novaLocacao);                               
        String json = controleAction.pegarTodos();
        System.out.println(json);
        
        
    }
    

    /**
     * Test of doPost method, of class ServicoApi.
     */
    @Test
    public void testDoPost() throws Exception {
    }

    /**
     * Test of getServletInfo method, of class ServicoApi.
     */
    @Test
    public void testGetServletInfo() {
    }
    
}
