/* This program is a part of a simple hibernate example used for CIT-360
   It is written by Troy Tuckett.  BYUI.EDU
 */

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.*;

//There is no way that I would have some up with this on my own. I modified it for my purposes.
public class hibernatecontroller {

    SessionFactory factory = null;
    Session session = null;

    private static hibernatecontroller single_instance = null;

    private hibernatecontroller()
    {
        factory = HibernateUtils.getSessionFactory();
    }

    /** This is what makes this class a singleton.  You use this
     *  class to get an instance of the class. */
    public static hibernatecontroller getInstance()
    {
        if (single_instance == null) {
            single_instance = new hibernatecontroller();
        }

        return single_instance;
    }

//Like I said above, there is no way I came up with this on my own.
    public List<hibernateemployee> gethibernateemployees() {

        try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from hibernateemployee";
            List<hibernateemployee> cs = (List<hibernateemployee>)session.createQuery(sql).getResultList();
            session.getTransaction().commit();
            return cs;

        } catch (Exception e) {
            e.printStackTrace();
            // Rollback in case of an error occurred.
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }

    }

    /** Used to get a single hibernateemployee from database */
    public hibernateemployee gethibernateemployee(int number) {

        try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from hibernateemployee where id=" + Integer.toString(number);
            hibernateemployee c = (hibernateemployee)session.createQuery(sql).getSingleResult();
            session.getTransaction().commit();
            return c;

        } catch (Exception e) {
            e.printStackTrace();
            // Rollback in case of an error occurred.
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }

}
