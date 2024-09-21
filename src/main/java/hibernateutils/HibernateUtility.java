package hibernateutils;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public final class HibernateUtility {

    private HibernateUtility() {
    }

    public static SessionFactory sessionFactory = null;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();
                configuration.configure();
                sessionFactory = configuration.buildSessionFactory();
                return sessionFactory;
            } catch (HibernateException e) {
                e.printStackTrace();
                return sessionFactory;
            }
        } else {
            return sessionFactory;
        }
    }


}
