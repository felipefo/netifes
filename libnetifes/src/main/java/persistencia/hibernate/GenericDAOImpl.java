package persistencia.hibernate;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import dominio.persistencia.IGenericDAO;

public abstract class GenericDAOImpl<T> implements IGenericDAO<T> {

    protected Session sessao;
    protected Transaction transacao;

    
    /**
     * Creates a new instance of GenericDAO
     */
    public void inserir(T obj) throws Exception {
          
        try {           
            this.sessao = HibernateUtil.getSession();    
            transacao = sessao.beginTransaction();
            sessao.save(obj);
            sessao.flush();
            transacao.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        } finally {
            
            //HibernateUtil.closeSession();
        }
    }

    public void alterar(T obj) throws Exception {
        
        try {            
            this.sessao = HibernateUtil.getSession();    
            transacao = sessao.beginTransaction();
            sessao.update(obj);
            sessao.flush();
            transacao.commit();

        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        } finally {
            //hib.closeSession();
        }
    }

    public void deletar(T obj) throws Exception {
         //HibernateUtil hib = new HibernateUtil();
        try {           
            this.sessao = HibernateUtil.getSession();    
            transacao = sessao.beginTransaction();
            sessao.delete(obj);
            sessao.flush();
            transacao.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        } finally {
          //  hib.closeSession();
        }
    }

    public List<T> listar(Class clazz) throws Exception {
        List objts;
         
        try {                        
            this.sessao = HibernateUtil.getSession();    
            objts = null;
            Criteria selectAll = sessao.createCriteria(clazz);            
            objts = selectAll.list();
            sessao.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        } finally {
            //hib.closeSession();
        }
        return objts;
    }

    public T listar(Class clazz, String pk) throws Exception {
        Object ob;
        
        try {            
            this.sessao = HibernateUtil.getSession();    
            //Object objt = sessao.load(clazz, new Integer(Integer.parseInt(pk)) );
            ob = sessao.load(clazz, new Integer(Integer.parseInt(pk)));            
            sessao.flush();
            return (T) ob;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        } finally {
           // hib.closeSession();
        }
    }

    public void rollBack() {
        transacao.rollback();
        sessao.close();
    }

}
