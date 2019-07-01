package controle;

import aplicacao.ControleCliente;
import aplicacao.ControleLocacao;
import aplicacao.FabricaDeControle;
import dominio.Cliente;
import java.sql.Time;
import java.util.Date;
import junit.framework.TestCase;
import dominio.Locacao;
import persistencia.hibernate.HibernateUtil;

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
        
       
       FabricaDeControle fabrica = new FabricaDeControle();
       fabrica.setEstrategia(FabricaDeControle.EstretegiaPersistencia.HIBERNATE);               
       Locacao novaLocacao = new Locacao();
       novaLocacao.setData(new Date());    
       Cliente novoCliente = new Cliente();
       novoCliente.setAtivo(true);
       novoCliente.setNome("Joao");
       novaLocacao.setCliente(novoCliente);
       ControleCliente controleCliente  = (ControleCliente) fabrica.getControle("cliente");            
       
       controleCliente.inserir(novoCliente);
                     
       //ControleLocacao controleLocacao  = (ControleLocacao) fabrica.getControle("locacao");   
                
       //controleLocacao.inserir(novaLocacao);
                        
        //System.out.println(controleCliente.pegarTodos());        
        
    }
    
}
