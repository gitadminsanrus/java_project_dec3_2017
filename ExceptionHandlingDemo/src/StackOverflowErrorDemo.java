
public class StackOverflowErrorDemo {

	public static void main(String[] args) {
		
		try {
			method1(10);
		}
		catch (Error e) {
			System.out.println(e.getMessage());
		}

	}
	
	private static void method1(int x) {
		method1(x);
	}

}
