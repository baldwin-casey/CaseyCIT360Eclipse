import java.io.Serializable;

import javax.persistence.*;
@Entity
@Table(name = "employee")
public class hibernateemployee implements Serializable {
    
	@Id
	@Column(name = "number")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int number;
	
	@Column(name = "employeename")
	public String employeename;
	
	@Column(name = "hourlypayrate")
	public float hourlypayrate;
	
	public float gethourlypayrate() {
		return hourlypayrate;
	}
	
	public void sethourlypayrate(float hourlypayrate) {
		this.hourlypayrate = hourlypayrate;
	}
	
	@Column(name = "employeephonenum")
	public long employeephonenum;
	
	public long getemployeephonenum() {
		return employeephonenum;
	}
	
	public void setemployeephonenum(long employeephonenum) {
		this.employeephonenum = employeephonenum;
	}
	
	public int getnumber() {
		return number;
	}
	
	public void setnumber(int number) {
		this.number = number;
	}
	
	public String getname() {
		return employeename;
	}
	
	public void setname(String employeename) {
		this.employeename = employeename;
	}
	
	public String toString() {
		return "Record Number: " + Integer.toString(number) + ", Name: " + employeename + ", Payrate: " + hourlypayrate + ", Phone Number: " + employeephonenum ;
	}
}
