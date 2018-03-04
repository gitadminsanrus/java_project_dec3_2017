public class MultipleCatchClausesDemo {
	
	public static void main(String[] args) {
		
		try {
			int[] data = new int[5];
			System.out.println(data[-1]);
			
			String str1 = null;
			str1.toString();
			
			
			String str = "ABC";
			System.out.println(str.charAt(10));
		}
		catch(NullPointerException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch (RuntimeException e) {
			System.out.println("Runtime exception -- generic message");
		}
		catch(Exception e) 
		{
			
		}
		
		
		System.out.println("end of main method");
		
	}

}
