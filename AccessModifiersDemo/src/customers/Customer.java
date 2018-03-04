package customers;

import persons.Person;

public class Customer extends Person {
	
	protected String customerId;
	
	public Customer(String firstName, String lastName, String customerId)
	{
		super(firstName, lastName);
		this.customerId = customerId;
	}

}
