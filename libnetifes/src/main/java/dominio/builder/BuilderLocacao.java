
package dominio.builder;

import dominio.Cliente;
import dominio.Filme;
import dominio.ItemLocado;
import dominio.Locacao;
import dominio.pagamento.PagamentoBoleto;
import dominio.pagamento.PagamentoCartao;
import dominio.pagamento.ProcessaPagamento;
import util.Inativo;
import util.Indisponivel;

/**
 *
 * @author felipe
 */
public class BuilderLocacao {

    private Filme filme;
    private Locacao locacao;
    private Cliente cliente;
    
    public BuilderLocacao(Locacao locacao, Filme filme , Cliente cliente){
       this.locacao = locacao;
       this.filme = filme;
       this.cliente = cliente;
    }
    
    public void adicionarItemLocado(double valor, float desconto){        
        ItemLocado newItemLocado = new ItemLocado();
        newItemLocado.setDesconto(desconto);
        newItemLocado.setValor(valor);
        this.locacao.setItemLocado(newItemLocado);              
    } 
    
    public void filmeEstaDisponivel() throws Exception{        
        if(!this.filme.estaDisponivel()){
            throw new Indisponivel("Filme Indisponivel");
        }
    }
    
    public void adicionarFilme() throws Exception{        
        if(this.filme.estaDisponivel()){
            ItemLocado itemLocado = this.locacao.getItemLocado();
            itemLocado.setFilmeLocado(filme);                
        }else{
            throw new Indisponivel("Filme Indisponivel");
        }        
    }        
    public void adicionarCliente() throws Exception{        
        if(this.cliente.isAtivo()){                        
            this.locacao.setCliente(cliente);
        }else{
            throw new Inativo("Cliente não está ativo");
        }        
    }          
     public void adicionarPagamento(String tipoPagamento) throws Exception{                  
        System.out.println("Adicionar pagamento a essa locacao");  
        if(tipoPagamento.equalsIgnoreCase("cartão")){
            PagamentoCartao pagamentoCartao = new PagamentoCartao(locacao);            
        }else if(tipoPagamento.equalsIgnoreCase("boleto")){
            PagamentoBoleto pagamentoBoleto = new PagamentoBoleto(locacao);            
        }        
    }      
}
