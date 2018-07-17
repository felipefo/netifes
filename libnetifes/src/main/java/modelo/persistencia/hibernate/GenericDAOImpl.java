package modelo.persistencia.hibernate;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

public abstract class GenericDAOImpl<T> implements GenericDAO<T> {

    protected Session sessao;
    protected Transaction transacao;

    
    /**
     * Creates a new instance of GenericDAO
     */
    public void inserir(T obj) throws Exception {
        try {
            HibernateUtil hibernate = new HibernateUtil();        
            this.sessao = hibernate.getSession();
            transacao = sessao.beginTransaction();
            sessao.save(obj);
            sessao.flush();
            transacao.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        } finally {
            sessao.close();
        }
    }

    public void alterar(T obj) throws Exception {
        try {
            HibernateUtil hibernate = new HibernateUtil();        
            this.sessao = hibernate.getSession();
            transacao = sessao.beginTransaction();
            sessao.update(obj);
            sessao.flush();
            transacao.commit();

        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        } finally {
            sessao.close();
        }
    }

    public void deletar(T obj) throws Exception {
        try {
            HibernateUtil hibernate = new HibernateUtil();        
            this.sessao = hibernate.getSession();
            transacao = sessao.beginTransaction();
            sessao.delete(obj);
            sessao.flush();
            transacao.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        } finally {
            sessao.close();
        }
    }

    public List<T> listar(Class clazz) throws Exception {
        List objts;
        try {
            HibernateUtil hibernate = new HibernateUtil();        
            this.sessao = hibernate.getSession();
            transacao = sessao.beginTransaction();            
            objts = null;
            Criteria selectAll = sessao.createCriteria(clazz);
            transacao.commit();
            objts = selectAll.list();      
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        } finally {
            sessao.close();
        }
        return objts;
    }

    public T listar(Class clazz, String pk) throws Exception {
        Object ob;
        try {
            HibernateUtil hibernate = new HibernateUtil();        
            this.sessao = hibernate.getSession();
            transacao = sessao.beginTransaction();
            //Object objt = sessao.load(clazz, new Integer(Integer.parseInt(pk)) );
            ob = sessao.load(clazz, new Integer(Integer.parseInt(pk)));
            transacao.commit();
            sessao.flush();
            return (T) ob;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        } finally {
            sessao.close();
        }
    }

    public void rollBack() {
        transacao.rollback();
        sessao.close();
    }

}
