import org.hibernate.Session;
	public class test {
	   private hibernateemployee m;
	   private HibernateUtils helper;
	   private Session session;
	  private String name;
	   
	/*public String getName() {
	  session = helper.getSessionFactory().openSession();
	     session.beginTransaction();
	       m = (Members) session.get(Members.class, 1);
	       this.name = m.getName();
	       return name;
	   }*/
	   public void addMember(){
	       m = new hibernateemployee();
	       session = HibernateUtils.getSessionFactory().openSession();
	       session.beginTransaction();
	       session.save(m);
	       session.getTransaction().commit();
	       session.close();
	   }
	}

