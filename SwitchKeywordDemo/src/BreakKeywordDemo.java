
public class BreakKeywordDemo {
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			
			for(int j = 1; j <= 20; j++) {
				
				for(int z = 1; z < 30; z++) {
					break;
				}
				
				if( i ==  9) {
					break;
				}
				
				System.out.println("(i, j) => ( "+ i + ", " + j + ")");
			}
			
			System.out.println("i = " + i);
			
		}
	}

}
