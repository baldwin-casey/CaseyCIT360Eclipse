package caseyfinal;

import org.json.JSONException;
import org.json.JSONObject;
import java.io.FileNotFoundException; 
import java.io.PrintWriter;
import java.util.Scanner;

public class mvc {
	public static Scanner in = new Scanner(System.in);
   public static void mvc() throws FileNotFoundException, JSONException {
      //fetch student record based on his roll no from the database
      Student model  = retriveStudentFromDatabase();
      //Create a view : to write student details on console
      StudentView view = new StudentView();
      StudentController controller = new StudentController(model, view);
      controller.updateView();
   }
   private static Student retriveStudentFromDatabase() throws JSONException, FileNotFoundException{
	   	System.out.println("------------------------------------");
	System.out.println("Enter the student information ");
	System.out.println("------------------------------------");
	   String filename = "StudentJSON.json";
	   System.out.println("First Name");
      Student student = new Student();
      student.setName(in.nextLine());
	  System.out.println("Last Name\n");
      student.setLastName(in.nextLine());
	  System.out.println("Student Number");
      student.setRollNo(in.nextLine());
	  System.out.println("Student Address");
      student.setAddress(in.nextLine());
	  	System.out.println("------------------------------------");
		System.out.println("You entered this info, is that correct? Y/N");
		System.out.println("Student: " + student.getName() + " " + student.getLastName());
		System.out.println("Student Number: " + student.getRollNo());
		System.out.println("Student Address: " + student.getAddress());
		System.out.println("------------------------------------");
		try {
          String choice = in.nextLine();
          switch(choice){
              case "Y": 
			  //Returns to program
          break;
              case "N":
              //Returns back to the start  
            	  retriveStudentFromDatabase();
              break;
        default:
    System.out.println("Enter a vaild selection and try again");
			}
		}
		
		catch (Exception e) {
     System.out.println("ERROR " + e);
}

      //Exporting to JSON
	   PrintWriter pw = new PrintWriter(filename);
	   JSONObject studentjson = new JSONObject();
	   studentjson.put("Full Name", student.getName() + " " + student.getLastName());
	   studentjson.put("Student Number", student.getRollNo());
	   studentjson.put("Student Address", student.getAddress());
	   pw.write(studentjson.toString());
	   pw.flush(); 
       pw.close(); 
	   System.out.printf("JSON has been saved to: " + filename);
	   System.out.printf("\n--------------------------------------\n");
	   return student;
	   
   }

}