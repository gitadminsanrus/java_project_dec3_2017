
public class PersonDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person("First", "Last");
		Person p2 = new Person("First", "Last");
		System.out.println("String representation of Person p1 object:- " + p1);
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));

	}

}
