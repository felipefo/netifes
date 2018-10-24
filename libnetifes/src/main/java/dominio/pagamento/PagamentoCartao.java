
package dominio.pagamento;

import dominio.Locacao;


public class PagamentoCartao extends ProcessaPagamento{
    public PagamentoCartao(Locacao locacao) {
        super(locacao);
    }
    protected void geraPagamento() {
        System.out.println("Gerando um pagando no cartao para locacação:" + locacao.getId());        
        //System.out.println("Valor do cartao a ser gerado:" +  locacao.getCartao());                
        System.out.println("Valor do cartao a ser gerado:" +  locacao.getTotal());                
        System.out.println("Valor do cartao a ser gerado:" +  locacao.getItemLocado().getTotal());                
        //Lei de Demeter diz. Ela sugere que evitemos o uso de invocações em cadeia.
        //O que ganhamos com isso? Encapsulamento. E o que eu ganho com encapsulamento? 
        //Diminuo propagação de mudanças                
    }
    @Override
    protected boolean confirmaPagamento() {
        //todo: verificar com a operadora de cartão se o pagamento foi aceito
        return true;
    }
    @Override
    protected void registraAprovacaoPagamento() {         
         System.out.println("Pagamento da locação via "+ this.locacao.getId() + 
                 " foi aprovado" + locacao.getId());
         log.info("Iniciando forma de pagamento escolhida:" + this.getClass().getSimpleName());                
   }
    
}
