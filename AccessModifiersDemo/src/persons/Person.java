package persons;

public class Person {

	//firstName and lastName can be accessed from within its Person class
	private String firstName;
	private String lastName;
	
	//age has default access.
	int age;
	
	protected char gender;
	
	//only Person can create its own object
	private Person() {
		
	}
	
	//only classes from default + subclasses in any package can access this constructor
	protected Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	//default access level provided to the Person(String, String, int) constructor
	Person(String firstName, String lastName, int age) {
		this(firstName, lastName);
		this.age = age;
	}
	
	public Person(String firstName) {
		
	}
	
	
	//only Person class can access getFirstName()
	private String getFirstName() 
	{
		return firstName;
	}
	
	
	
	
	
	
	public static class StaticInnerClass{
		
	}
	
	public class NonStaticInnerClass {
		
	} 
	
}
