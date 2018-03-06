
public class SwitchDemo {

	public static void main(String[] args) {
		
		int x = 12;
		
		switch (x)
		{
			default:
				System.out.println("default");
				break;
			case 0:
			case 1:
			case 2:
				System.out.println("0");
				System.out.println("1");
			case 5:
				System.out.println("5");
			case 10:
				System.out.println("10");
			
		}

	}

}
