import org.json.JSONException;
import org.json.JSONObject;
import java.io.FileNotFoundException; 
import java.io.PrintWriter;

public class mvc {
   public static void mvc() throws FileNotFoundException, JSONException {
      //fetch student record based on his roll no from the database
      Student model  = retriveStudentFromDatabase();
      //Create a view : to write student details on console
      StudentView view = new StudentView();
      StudentController controller = new StudentController(model, view);
      controller.updateView();
   }
   private static Student retriveStudentFromDatabase() throws JSONException, FileNotFoundException{
	   String filename = "StudentJSON.json";
      Student student = new Student();
      student.setName("Casey");
      student.setLastName("Baldwin");
      student.setRollNo("10");
      student.setAddress("456 Main St");
      //Exporting to JSON
	   JSONObject studentjson = new JSONObject();
	   studentjson.put("First Name", student.getName());
	   studentjson.put("Last Name", student.getLastName());
	   studentjson.put("Address", student.getAddress());
	   studentjson.put("Roll Number", student.getRollNo());
	   PrintWriter pw = new PrintWriter(filename);
	   pw.write(studentjson.toString());
	   pw.flush(); 
       pw.close(); 
	   System.out.printf("JSON has been saved to: " + filename);
	   return student;
   }

}