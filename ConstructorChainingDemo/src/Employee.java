
public class Employee extends Person {

	String employeeId;
	String role;
	String department;
	
	Employee(String employeeId, String firstName, String lastName) {
		super(firstName, lastName);
		System.out.println("Employee(String, String, String)");
		
		this.employeeId = employeeId;
		
	}
	
}
