
public class InheritanceDemo {

	public static void main(String[] args) {
		
		B b1 = new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
		System.out.println(b1.toString());
		
		A a1 = (A) b1;//extracting A object from b1
		a1.i = 40;
	
		//a1.j = 30;//compile error
		
		A a2 = new A();
		
		System.out.println(b1 instanceof B);
		System.out.println(b1 instanceof A);
		System.out.println(b1 instanceof Object);
		
		System.out.println(a2 instanceof B);
		
		//if check is required to prevent java.lang.ClassCastException
		//as a2 is NOT instanceof B
		if(a2 instanceof B) {
			B b2 = (B) a2;
			
			System.out.println(b2.j);
		}
		
		System.out.println("============Super Keyword Demo===========");
		
		C c1 = new C();
		c1.printI();
			
			

	}

}
