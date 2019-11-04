public class StudentController {
   private Student model;
   private StudentView view;
   public StudentController(Student model, StudentView view){
      this.model = model;
      this.view = view;
   }
   public void setStudentName(String name){
      model.setName(name);
   }
   public String getStudentName(){
      return model.getName();
   }
   public void setStudentRollNo(String rollNo){
      model.setRollNo(rollNo);
   }
   public String getStudentRollNo(){
      return model.getRollNo();
   }
   public void setStudentLastName(String lastname){
	      model.setLastName(lastname);
   }
   public String getStudentLastName(){
	      return model.getLastName();
   }
   public void setStudentAddress(String address){
	      model.setAddress(address);
   }
		   public String getStudentAddress(){
		      return model.getAddress();
		   }
   public void updateView(){
      view.printStudentDetails(model.getName(), model.getLastName(), model.getAddress(), model.getRollNo());
   }
}