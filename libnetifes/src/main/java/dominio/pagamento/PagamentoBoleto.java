
package dominio.pagamento;

import dominio.Locacao;


public class PagamentoBoleto extends ProcessaPagamento{
    public PagamentoBoleto(Locacao locacao) {
        super(locacao);
    }
    protected void geraPagamento() {
        System.out.println("Gerando um boleto para locacação:" + locacao.getId());
        //Qual a diferença dessa sentença para a sentença de baixo?
        System.out.println("Valor do boleto a ser gerado:" +  locacao.getTotal());                
        System.out.println("Valor do boleto a ser gerado:" +  locacao.getItemLocado().getTotal());                
        //Lei de Demeter diz. Ela sugere que evitemos o uso de invocações em cadeia.
        //O que ganhamos com isso? Encapsulamento. E o que eu ganho com encapsulamento? 
        //Diminuo propagação de mudanças                
    }
    @Override
    protected boolean confirmaPagamento() {
        //todo: verificar se o boleto foi pago com o banco.
        return true;
    }
    @Override
    protected void registraAprovacaoPagamento() {         
         System.out.println("Pagamento da locação via "+ this.locacao.getId() + 
                 " foi aprovado" + locacao.getId());
         log.info("Iniciando forma de pagamento escolhida:" + this.getClass().getSimpleName());                
   }
    
}
