
package dominio.pagamento;

import dominio.Locacao;


public class PagamentoCartao extends ProcessaPagamento{
    public PagamentoCartao(Locacao locacao) {
        super(locacao);
    }
    protected void geraPagamento() {
        System.out.println("Gerando um pagando no cartao para locaca��o:" + locacao.getId());        
        //System.out.println("Valor do cartao a ser gerado:" +  locacao.getCartao());                
        System.out.println("Valor do cartao a ser gerado:" +  locacao.getTotal());                
        System.out.println("Valor do cartao a ser gerado:" +  locacao.getItemLocado().getTotal());                
        //Lei de Demeter diz. Ela sugere que evitemos o uso de invoca��es em cadeia.
        //O que ganhamos com isso? Encapsulamento. E o que eu ganho com encapsulamento? 
        //Diminuo propaga��o de mudan�as                
    }
    @Override
    protected boolean confirmaPagamento() {
        //todo: verificar com a operadora de cart�o se o pagamento foi aceito
        return true;
    }
    @Override
    protected void registraAprovacaoPagamento() {         
         System.out.println("Pagamento da loca��o via "+ this.locacao.getId() + 
                 " foi aprovado" + locacao.getId());
         log.info("Iniciando forma de pagamento escolhida:" + this.getClass().getSimpleName());                
   }
    
}
