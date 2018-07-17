package modelo.persistencia.hibernate;


import java.util.Properties;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 *
 * @author felipe
 */
public final class HibernateUtil {

    private SessionFactory sessionFactory;
    private ServiceRegistry serviceRegistry = null;

    private SessionFactory getSessionFactory() throws HibernateException {
        Configuration configuration = new Configuration();
        configuration.configure();
        Properties properties = configuration.getProperties();
        serviceRegistry = new ServiceRegistryBuilder().applySettings(properties).buildServiceRegistry();
            
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);            
        return sessionFactory;
    }

    public Session getSession() {
        return getSessionFactory().openSession();
    }
}
