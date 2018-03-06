
public class ThisKeywordDemo {
	
	Box box2 = new Box();

	public static void main(String[] args) {

		Box box1 = new Box();
//		System.out.println(box1.this);
	}
	
	void method1() {
		//'box2' belongs to local scope
		Box box2 = new Box();
		
		//'box2' variable referring to 'object' scope
		this.box2.width = 50;
		
		//'this' keyword can be used only on instance members (variables + methods)
		this.method1();
	}

}
