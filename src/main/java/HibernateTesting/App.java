package HibernateTesting;

import com.sun.corba.se.spi.servicecontext.UEInfoServiceContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory = getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        User alex = new User("Alex");
        User stas = new User("Stas");
        User eugene = new User("Eugene");
        User kostya = new User("Kostya");

        session.save(alex);
        session.save(stas);
        session.save(eugene);
        session.save(kostya);
        session.getTransaction().commit();

        session = sessionFactory.getCurrentSession();
        session.beginTransaction();

//        alex = (User) session.get(User.class, 10L);
//        System.out.println(alex);

//        Set<User> child = new HashSet<User>();
//        child.add(stas);
//        child.add(eugene);
//        child.add(kostya);

        Set<User> parent = new HashSet<User>();
        parent.add(stas);
        parent.add(kostya);
        parent.add(eugene);

//        alex.setChild(child);
        User user = (User) session.get(User.class, 10L);
        user.setParent(parent);
        session.update(user);
        session.getTransaction().commit();

    }

    private static SessionFactory getSessionFactory()
    {
        Configuration configuration = new Configuration().configure(new File("src/main/resources/hibernate.cfg_Oracle.xml"));
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
                .applySettings(configuration.getProperties())
                .buildServiceRegistry();
        return configuration.buildSessionFactory(serviceRegistry);
    }
}
