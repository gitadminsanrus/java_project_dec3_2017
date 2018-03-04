
public class Person {
	
	private String firstName;
	private String lastName;
	private int age;
	private char gender;
	
	public Person() {
		
	}
	
	public Person(String firstName, String lastName, 
									int age, char gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) throws InvalidFieldException {
		if (firstName == null 
				|| firstName.equals("")
				|| firstName.matches("^\\s+$")) {
			InvalidFieldException firstNameFieldInvalidException = new InvalidFieldException("First name is required");
			throw firstNameFieldInvalidException;
		}
		
		
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	
	
	

}
