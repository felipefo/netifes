package dominio;


import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Felipe Frechiani
 */
@Entity
@Table(name = "locacao")
public class Locacao {
    
    @Id
    @GeneratedValue(generator = "increment")    
    @GenericGenerator(name = "increment", strategy = "increment")
    private  int id;
    private  Date data;
    private  Time time;
    private ItemLocado  itemLocado = new ItemLocado();
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    public double getTotal(){
        return this.itemLocado.getTotal();
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
