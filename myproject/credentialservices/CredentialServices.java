package myproject.credentialservices;

import java.util.Random; 

import myproject.model.Employee;  

public class CredentialServices {
	
	public String createdEmailAddress(String firstName,String lastName,String department) {  // createdEmailAddress() method will generate email adress.
		return firstName+lastName+"@"+department+".google.com";
		
		
	}



	public String createdPassword() {             
		String uppercaseAlphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseAlphabets = "abcdefghijklmnopqrstuvwxys";
		String digits = "0123456789";
		String specialCharacters="&*()!@#$%^_+"; 
		
		String bigString = uppercaseAlphabets+lowerCaseAlphabets+digits+specialCharacters;
		Random random = new Random();
		char [] password = new char[10];
		for(int i=0;i<10;++i) {
			
			password[i]=bigString.charAt(random.nextInt(bigString.length()));
			
	}
		 
		
	return new String (password);  
	
		
	}
	
	
	
	public void showCredentials(Employee emp,String email,String password) {   // showCredentials() method  to display the Credentials of Employee.
		
		System.out.println("Dear"+ " " +emp.getFirstName()+" " + emp.getLastName() + " "+  "your generated credential are as follows  ");
		System.out.println("Email--->>>"+email);
		System.out.println("Password--->>>"+password);
	}
	

}
