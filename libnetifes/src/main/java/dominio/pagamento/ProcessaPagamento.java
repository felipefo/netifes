
package dominio.pagamento;

import dominio.Locacao;
import org.apache.log4j.Logger;


public abstract class ProcessaPagamento {
               
    static Logger log = Logger.getLogger(ProcessaPagamento.class.getName());

    protected Locacao locacao;
    
    public ProcessaPagamento(Locacao locacao){        
        this.locacao = locacao;
        this.registraFormadePagamento();
        this.geraPagamento();
        if(this.confirmaPagamento()){
            this.registraAprovacaoPagamento();
        }
    }    
    protected void registraFormadePagamento(){
        log.info("Iniciando forma processamento de pagamento para locacao "+  locacao.getId() 
                + " cliente:" + locacao.getCliente().getNome());        
        log.info("Iniciando forma de pagamento escolhida:" + this.getClass().getSimpleName());        
    }                                     
    protected abstract void geraPagamento();
    protected abstract boolean confirmaPagamento();
    protected abstract void registraAprovacaoPagamento();
    
}
