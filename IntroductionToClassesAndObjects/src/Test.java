
public class Test {
	
	void display()
	{
		
		int a = 20;
		
		if ( a > 10) {
			return;
		}
		
		System.out.println("display() method is executed");
	}
	
	int getValue() {
		
		int z = (1 + 2);
		
		if(z > 10) {
			return 'C';			
		} else {
			return 'D';
		}
		
		
//		return 'E'; => unreachable code compile error
		
	}
	
	double getValue1() {
		return 0.5;
	}
	
	int getValue2() {
		return (int) 0.5;
	}

}