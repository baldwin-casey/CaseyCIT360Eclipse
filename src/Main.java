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
        System.out.println("Enter a number to access a program\n 1. Collections\n 2. HTTPConnection"); // Display the string.
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
        default:
    System.out.println("Enter a vaild selection and try again");
}
          in.close();
}
}