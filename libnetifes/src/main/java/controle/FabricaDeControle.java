package controle;

import modelo.Cliente;
import modelo.Filme;
import modelo.Locacao;

public class FabricaDeControle {

    /*
      Método static responsavel por instanciar a classe de controle  dado o 
    tipo do controle que deve ser isntanciado. Esse método é a implmentação do 
    padrão método fábrica dos padrões GOF.
     */
    public static IControle getControle(String nomeControle) {
        IControle controle = null;
        if (nomeControle.equals("locacao")) {            
            controle = new ControleLocacao<Locacao>();
        } else if (nomeControle.equals("cliente")) {
            controle = new ControleCliente<Cliente>();
        }else if (nomeControle.equals("filme")) {
            controle = new ControleFilme<Filme>();
        }
        return controle;
    }
}
