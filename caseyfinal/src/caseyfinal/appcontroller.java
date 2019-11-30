package caseyfinal;

import java.util.Scanner;

public class appcontroller {
	public static String firstname = "FIRSTNAME";
	public static String lastname = "LASTNAME";
	public static String gender = "GENDER";
	public static void appcontroller() {
		
		Scanner input = new Scanner(System.in);
		controller fullname = new controller();
		String changes;
		System.out.println("--------------------------");
		System.out.println("What would you like to change about this user profile?");
		System.out.println("\n 1. Change first name\n 2. Change last name\n 3. Change gender\n 4. Quit and display info");
		System.out.println("--------------------------");

		int request = input.nextInt();
		
		switch(request) {
		case 1:
			System.out.println("--------------------------");
			System.out.println("Please enter the firstname");
			firstname = input.next();
			changes = fullname.handleRequest(request, firstname, lastname, gender);
			System.out.println("--------------------------");
			System.out.println("Profile: " + changes);
			appcontroller();
			break;
		case 2:
			System.out.println("--------------------------");
			System.out.println("Please enter the lastname");
			lastname = input.next();
			changes = fullname.handleRequest(request, firstname, lastname, gender);
			System.out.println("--------------------------");
			System.out.println("Profile: " + changes);
			appcontroller();
			break;
		case 3:
			System.out.println("--------------------------");
			System.out.println("Please enter the gender");
			gender = input.next();
			changes = fullname.handleRequest(request, firstname, lastname, gender);
			System.out.println("--------------------------");
			System.out.println("Profile: " + changes);
			appcontroller();
			break;
		case 4:
			changes = fullname.handleRequest(request, firstname, lastname, gender);
			System.out.println("--------------------------");
			System.out.println("Profile: " + changes);
			System.out.println("--------------------------");
			System.out.println("Exiting");
			 System.exit(0);
			break;
			
			default:
				System.out.println("Enter a vaild selection and try again");

		}
		input.close();
	}
}
