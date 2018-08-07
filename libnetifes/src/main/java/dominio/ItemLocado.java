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
    
    
}
