//unchecked exception; 
//compiler will still compile if this exception is not handled using try-catch block
public class InvalidFieldException extends RuntimeException {
	
	public InvalidFieldException(String message) {
		super(message);
	}

}
