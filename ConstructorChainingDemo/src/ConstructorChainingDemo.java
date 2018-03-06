
public class ConstructorChainingDemo {

	public static void main(String[] args) {
		
		Person person = new Person("PersonFirstName", "PersonLastName");
		
		System.out.println("-----------------------------");
		
		Customer customer = new Customer("First1", "Last1", "CUST001");
		System.out.println("-----------------------------");
		Employee employee = new Employee("EMP001", "EMP_FIRST_NAME", "EMP_LAST_NAME");
		System.out.println("-----------------------------");
//		Customer customer1 = new Customer("First2", "Last2", "CUST002");
//		Customer customer2 = new Customer("First3", "Last3", "CUST003");
//		Customer customer3 = new Customer("First4", "Last4", "CUST004");
		

	}

}
