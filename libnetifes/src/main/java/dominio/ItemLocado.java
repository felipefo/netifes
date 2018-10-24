package dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * @author Felipe Frechiani
 */

@Entity
@Table(name = "item_locado")
public class ItemLocado {
    
    @Id
    @GeneratedValue(generator = "increment")    
    @GenericGenerator(name = "increment", strategy = "increment")
    private  int id;
    private  float desconto;
    private  double valor;
    private  float instanteParada;
    private Filme filmeLocado;

    public ItemLocado()       
    {
         this.instanteParada = 0;    
    }
            
            
    public double getTotal(){
        return (getValor() - getDesconto());
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public float getInstanteParada() {
        return instanteParada;
    }

    public void setInstanteParada(float instanteParada) {
        this.instanteParada = instanteParada;
    }

    public Filme getFilmeLocado() {
        return filmeLocado;
    }

    public void setFilmeLocado(Filme filmeLocado) {
        this.filmeLocado = filmeLocado;
    }
    
    
    
    
}
