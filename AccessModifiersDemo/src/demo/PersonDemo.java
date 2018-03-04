package demo;

import customers.Customer;
import persons.Person;

public class PersonDemo {

	public static void main(String[] args) {
		
		//Person constructor is protected = default + subclasses in any package
		Person p = new Person("ABC", "PQR");
		
		
		Person p2 = new Person("ABC");
		Person.NonStaticInnerClass nonStaticInnerClass = p2.new NonStaticInnerClass();
		
		Person.StaticInnerClass staticInnerClass = new Person.StaticInnerClass();
		
		Customer customer = new Customer("FIRST", "LAST", "CUST-001");
		customer.gender = 'F';

	}

}
