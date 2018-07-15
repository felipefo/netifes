
package controle;

import modelo.persistencia.hibernate.ClienteDAOImpl;

public class ControleCliente<Cliente> extends ControleGenerico<Cliente> {
       
    public ControleCliente() {
        super(new ClienteDAOImpl(), modelo.Cliente.class);
    }    
   
}
