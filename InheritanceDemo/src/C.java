
public class C extends B {

	//C's 'i' is hiding the inherited variable 'i' from A & B
	int i = 1000;
	
	void printI() {
		System.out.println("C's i => " + i);
		System.out.println("B's i => " + super.i);
		System.out.println("A's i => " + ((A) this).i);
		
		super.methodA();
	}
	
}
