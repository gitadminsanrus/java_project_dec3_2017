
public class PersonDemo {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		String firstName = "";
		
		try {
			person.setFirstName(firstName);
		}
		catch (InvalidFieldException e) {
			System.exit(0);
			System.out.println(e.getMessage());
		}
		
		if (firstName != null 
				&& !"".equals(firstName)) {
			person.setFirstName(firstName);
		}
		
		System.out.println("end of main method");
		
		

	}

}
