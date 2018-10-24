
package dominio.pagamento;

import dominio.Locacao;


public class PagamentoBoleto extends ProcessaPagamento{
    public PagamentoBoleto(Locacao locacao) {
        super(locacao);
    }
    protected void geraPagamento() {
        System.out.println("Gerando um boleto para locaca��o:" + locacao.getId());
        //Qual a diferen�a dessa senten�a para a senten�a de baixo?
        System.out.println("Valor do boleto a ser gerado:" +  locacao.getTotal());                
        System.out.println("Valor do boleto a ser gerado:" +  locacao.getItemLocado().getTotal());                
        //Lei de Demeter diz. Ela sugere que evitemos o uso de invoca��es em cadeia.
        //O que ganhamos com isso? Encapsulamento. E o que eu ganho com encapsulamento? 
        //Diminuo propaga��o de mudan�as                
    }
    @Override
    protected boolean confirmaPagamento() {
        //todo: verificar se o boleto foi pago com o banco.
        return true;
    }
    @Override
    protected void registraAprovacaoPagamento() {         
         System.out.println("Pagamento da loca��o via "+ this.locacao.getId() + 
                 " foi aprovado" + locacao.getId());
         log.info("Iniciando forma de pagamento escolhida:" + this.getClass().getSimpleName());                
   }
    
}
