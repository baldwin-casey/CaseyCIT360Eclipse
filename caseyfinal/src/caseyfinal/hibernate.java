package caseyfinal;

import javax.persistence.*;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import java.util.*;
import java.util.Scanner;

public class hibernate {
	public static Scanner in = new Scanner(System.in);
	public static void hibernate() {
		System.out.println("1: Read records, 2: Write a record");
		 int a = in.nextInt();
		switch(a){
             case 1:
        hibernatecontroller t = hibernatecontroller.getInstance();

        List<hibernateemployee> c = t.gethibernateemployees();
        for (hibernateemployee i : c) {
            System.out.println(i);
        }
        break;
        
             case 2:
            	 System.out.println("Enter the employee name");
            	 String name = in.next();
            	 System.out.println("Enter the employee phone number");
            	 long phone = in.nextLong();
            	 System.out.println("Enter the employee payrate");
            	 int payrate = in.nextInt();
            	 
            	 Session session = HibernateUtils.getSessionFactory().openSession();
                 session.beginTransaction(); 
                 
                 hibernateemployee h = new hibernateemployee();
                 h.setname(name);
                 h.setemployeephonenum(phone);
                 h.sethourlypayrate(payrate);
                 System.out.println(h.getemployeephonenum() + " " + h.gethourlypayrate());
                  
                 //Save the employee in database
                 session.save(h);
          
                 //Commit the transaction
                 session.getTransaction().commit();
                 HibernateUtils.shutdown();
                 System.out.println("Write complete!");
                 break;
                 default: System.out.println("Please try again!");
    }
}
}

