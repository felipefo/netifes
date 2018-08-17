
package dominio.builder;

import dominio.Cliente;
import dominio.Filme;
import dominio.Locacao;

/**
 *
 * @author felipe
 */
public class DiretorLocacao {
    
    public DiretorLocacao(){                
    }                                    
    public Locacao builder(Filme filme, Cliente cliente) throws Exception{
        Locacao locacao = new Locacao();
        BuilderLocacao builderLocacao = new BuilderLocacao(locacao,filme, cliente);        
        //verifica se o cliente esta ativo e adiciona a locacao
        builderLocacao.adicionarCliente();
        //veririca se o filme esta ativo
        builderLocacao.filmeEstaDisponivel();
        //adiciona um item locado         
        builderLocacao.adicionarItemLocado(0, 0);
        //adiciona o filme que o cliente escolheu        
        builderLocacao.adicionarFilme();
        //adicona o pagamento a locacao
        builderLocacao.adicionarPagamento();
        return locacao;
        }
    }
                    
