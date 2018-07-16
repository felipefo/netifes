
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * Classe de adpatação para de Map<String,String[]> para Map<String,String[]>
 * @author felipe
 */
public class ParameterAdapter implements Map {

    Map<String, String[]> mapaParaAdaptar = null;

    public ParameterAdapter(Map<String, String[]> mapaParaAdaptar) {
        this.mapaParaAdaptar = mapaParaAdaptar;
    }
    
    
    public Object get(Object o) {
        String[] arg = (String[]) this.mapaParaAdaptar.get(o);
        String valor = null;
        if (arg.length > 0) {
            valor = arg[0];
        }
        return valor;
    }

    public boolean isEmpty() {
        return this.mapaParaAdaptar.isEmpty();
    }

    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean containsKey(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean containsValue(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object put(Object k, Object v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Set keySet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Collection values() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Set entrySet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
