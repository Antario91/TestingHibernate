package HibernateTesting;

import com.sun.corba.se.spi.servicecontext.UEInfoServiceContext;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 */
public class App
{
   SessionFactory sessionFactory;
   final static Logger logger = Logger.getLogger(App.class);

   public App()
   {
      Configuration configuration = new Configuration();
      configuration.configure(new File("src/main/resources/hibernate.cfg_HSQLDB.xml"));
      ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(
            configuration.getProperties()).buildServiceRegistry();
      sessionFactory = configuration.buildSessionFactory(serviceRegistry);
   }

   public static void main(String[] args) throws ParseException
   {
      App app = new App();
      Session session = app.getSessionFactory().getCurrentSession();
      session.beginTransaction();

      User alex = new User("Alex", app.getDate("16-01-2017"));
      User stas = new User("Stas", app.getDate("17-01-2017"));
      User eugene = new User("Eugene", app.getDate("19-01-2017"));
      User kostya = new User("Kostya", app.getDate("20-01-2017"));

      session.persist(alex);
      session.persist(stas);
      session.persist(eugene);
      session.persist(kostya);
      session.getTransaction().commit();

      System.out.println("new Transaction");

      session = app.getSessionFactory().getCurrentSession();
      session.beginTransaction();
      System.out.println("Alex's date = " + alex.getDay());

      app.removeOutdatedItems(new Integer(1));

      session.getTransaction().commit();

//         String str = "abc";

//       str.compareTo(null);

//        alex = (User) session.get(User.class, 10L);
//        System.out.println(alex);

//        Set<User> child = new HashSet<User>();
//        child.add(stas);
//        child.add(eugene);
//        child.add(kostya);

//        Set<User> parent = new HashSet<User>();
//        parent.add(stas);
//        parent.add(kostya);
//        parent.add(eugene);

//        alex.setChild(child);
//        User user = (User) session.get(User.class, 10L);
//        user.setParent(parent);
//        user.setChild(child);
//        session.update(user);
//        session.getTransaction().commit();

   }

   private SessionFactory getSessionFactory()
   {
      return sessionFactory;
   }

   public void removeOutdatedItems(Integer countOfHours)
   {
      try
      {
         Session session = getSessionFactory().getCurrentSession();
         session.createQuery("delete from User u where u.day < sysdate - :countOfHours").setDouble("countOfHours", countOfHours / 24)
               .executeUpdate();
      }
      catch (Exception e)
      {
         System.out.println("Could not delete outdated items. Exception: " + e);
      }
   }

   public Date getDate(String dateInString) throws ParseException
   {
      SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
      Date date = sdf.parse(dateInString);
      return date;
   }
}
