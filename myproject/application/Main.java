package myproject.application;

import java.util.Scanner; // importing Scanner class from java.util.

import myproject.credentialservices.CredentialServices; // importing CredentialServices class from myproject.credentialservices
import myproject.model.Employee; // importing Employee class from package myproject.model.

public class Main  {
	
	// main method.

	public static void main(String[] args) {
		
		Employee emp = new Employee("Shivam", "kumar");      
		CredentialServices cs = new CredentialServices();            
		String createdEmail;                                                 
		String createdPassword;        
		
		
		/*
		 * Asking User to input a Department.
		 * 
		 * 
		 */
		
		System.out.println("Choose your Department from the following list:");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resourse");
		System.out.println("4.Legal");
		
		Scanner sc = new Scanner(System.in);  // Creating Scanner class object.
		int input = sc.nextInt();
		
		/*
		 * Switch case to Decide use output .
		 */
		
		switch (input) {
		
		case 1:{ 
				createdEmail=cs.createdEmailAddress(emp.getFirstName(), emp.getLastName(), "tec");
				createdPassword=cs.createdPassword();
				cs.showCredentials(emp, createdEmail, createdPassword);
			break;
		}
		case 2:{ 
				createdEmail=cs.createdEmailAddress(emp.getFirstName(), emp.getLastName(), "adm");
				createdPassword=cs.createdPassword();
				cs.showCredentials(emp, createdEmail, createdPassword);
			break;

}
			
		case 3 :{ 
				createdEmail=cs.createdEmailAddress(emp.getFirstName(), emp.getLastName(), "hr");
				createdPassword=cs.createdPassword();
				cs.showCredentials(emp, createdEmail, createdPassword);
			break;
}
			
		case 4:{ 
				createdEmail=cs.createdEmailAddress(emp.getFirstName(), emp.getLastName(), "leg");
				createdPassword=cs.createdPassword();
				cs.showCredentials(emp, createdEmail, createdPassword);
			break;
}
			
			
		
		 
		
		

	}

}
}
