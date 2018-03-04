
public class BankAccountDemo {

	public static void main(String[] args) {
		
		BankAccount chequingAccount = new BankAccount(null, 50);
		
		try 
		{
			chequingAccount.debit(-100);
		}
		catch (InvalidDebitException e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
