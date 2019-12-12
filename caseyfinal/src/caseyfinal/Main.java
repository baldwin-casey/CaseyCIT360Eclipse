package caseyfinal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author cbald
 */

public class Main {
   public static void main(String[] args) throws Exception {
        System.out.println("Enter a number to access a program\n 1. Collections\n 2. HTTPConnection\n 3. Threads\n 4. JUNIT\n 5. Trees\n 6. MVC\n 7. Hibernate\n 8. Queue\n 9. Set\n 10. Application Controller\n 11. Executors\n 12. Map\n 13. Servlet"); // Display the string.
         Scanner in = new Scanner(System.in);
          int a = in.nextInt();
          switch(a){
              case 1: 
              collections.collection();
          break;
              case 2:
                  try {
                  httpconnection.section();
                  }
                  catch (Exception e) {
                      
                  }
                  break;
              case 3:
            	  threads.thread();
            	  break;
              case 4:
            	  junittest test = new junittest();
            	  test.test();
            	  break;
              case 5:
            	  trees.trees();
            	  break;
              case 6:
            	  mvc.mvc();
            	  break;
              case 7:
            	  hibernate.hibernate();
            	  break;
              case 8: 
            	  queue.queue();
            	  break;
              case 9:
            	  set.set();
            	  break;
              case 10:
            	  appcontroller.appcontroller();
            	  break;
              case 11: 
            	  execute.execute();
            	break;  
              case 12: 
            	  map.map();
            	break;  

            	break;  
              default:
    System.out.println("Enter a vaild selection and try again");
}
          in.close();
}
}