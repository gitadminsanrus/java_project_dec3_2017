
public class Person {

	String firstName;
	String lastName;
	int age;
	char gender;
	
	
	Person(String firstName, String lastName) {
		System.out.println("Person(String, String)");
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	Person(String firstName, String lastName, int age) {
		this(firstName, lastName);
		this.age = age;		
	}
	
}
