
public class Customer extends Person {
	
	String customerId;
	String customerType;
	
	Customer(String firstName, String lastName, String customerId) {
		super(firstName, lastName);
		
		System.out.println("Customer(String, String, String)");
		this.firstName = customerId;
		
	}

}
