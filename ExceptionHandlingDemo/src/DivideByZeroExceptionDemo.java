
public class DivideByZeroExceptionDemo {

	public static void main(String[] args) {
		
		
		int x = 10;
		int y = 20;
		
		
		//Divide by zero without try-catch block, results into java.lang.ArithmeticException object
		try 
		{
			//Divide by zero exception is caught and handled in catch (ArithmeticException e) block
			double result = method1(x, y);
			System.out.println("Result = " + result);
			
			int[] data = new int[5];
			System.out.println(data[-1]);
		}
		catch (ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("Divide by zero exception is handled in this catch block, hence no app crash.");
			System.out.println(e.getMessage());
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bounds exception occurred and is handled in this catch block");
			
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Finally block executed...");
		}
		
		
		System.out.println("Main method ended");
	
	}
	
	private static double method1(double x, double y) {
		return div1(x, y);
	}
	
	private static double div1(double x, double y) {
		return (x/y);
	}

}
