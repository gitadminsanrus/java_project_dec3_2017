
public class TestDemo {

	public static void main(String[] args) {
		
		Test testObject = new Test();
		testObject.display();
		
		int abc = testObject.getValue2();
		
		System.out.println((char) testObject.getValue());
		
		Box b = new Box();
		Box b1 = new Box(5);
		Box b2 = new Box(5, 10.5);
		Box b3 = new Box(5, 10.5, 2.5);

	}

}
