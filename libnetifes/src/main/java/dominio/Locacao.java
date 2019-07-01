package dominio;


import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Felipe Frechiani
 */
@Entity
@Table(name = "locacao")
public class Locacao implements Serializable {
    
    @Id
    @GeneratedValue(generator = "increment")    
    @GenericGenerator(name = "increment", strategy = "increment")
    private  int id;
    private  Date data;
    private  Time time;
    
   
    @OneToOne
    private ItemLocado  itemLocado;
    @ManyToOne
    private Cliente cliente;

    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    public double getTotal(){
        if(this.itemLocado!=null)
        return this.itemLocado.getTotal();
        return 0;
    }
    public ItemLocado getItemLocado() {
        return itemLocado;
    }

    public void setItemLocado(ItemLocado itemLocado) {
        this.itemLocado = itemLocado;
    }          
    
    //soh para testes.
    private  String nome;

     
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
     public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
    
    
    
    
    
}
