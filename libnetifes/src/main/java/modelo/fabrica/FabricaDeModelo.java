package modelo.fabrica;

import controle.ControleCliente;
import controle.ControleLocacao;
import controle.IControle;
import java.util.Map;
import modelo.Cliente;
import modelo.Locacao;

/**
 * Recebe um mapa de parametros e preenche as informaçoes para a criação da classe de
 * modelo especifica.
 * @author felipe
 */
public class FabricaDeModelo {

    Map parametros = null;
    

    public FabricaDeModelo(Map parametros) {
        this.parametros = parametros;
    }

    public Object getModelo(String nomeModelo) {
        Object objModelo = null;
        if (nomeModelo.equals("locacao")) {
            objModelo = new Locacao();
            Locacao locacao = (Locacao) objModelo;
            locacao.setNome((String) parametros.get("nome"));
        } else if (nomeModelo.equals("cliente")) {
            objModelo = new Cliente();
            Cliente cliente = (Cliente) objModelo;            
            cliente.setNome((String) parametros.get("nome"));
        }
        return objModelo;
    }

}
