package myproject.model;

public class Employee {   // creating a Employee class.
	private String firstName;
	private String lastName;
	public Employee(String firstName, String lastName) {   // creating a parameterize constructor.
		
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {  // get method to get the first name.
		
		return firstName;   // return first name.
	}
	public void setFirstName(String firstName) { // set method to set first name.
		
		this.firstName = firstName;
	}
	public String getLastName() {  // get method to get last name.
		
		return lastName;  // return last name.
	}
	public void setLastName(String lastName) {  // set method to set last name .
		
		this.lastName = lastName; // return last name.
	}
	
	

}
