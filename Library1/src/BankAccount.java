
public class BankAccount {
	
	private double balance;
	private String accountName;
	
	public BankAccount (String accountName, double initialBalance) throws InvalidBankAccountException {
		
		if (accountName == null || accountName.equals("") || accountName.matches("^\\s+$")) {
			throw new InvalidBankAccountException("Invalid account name.");
		} else if (initialBalance < 0) {
			throw new InvalidBankAccountException("Initial balance cannot be negative");
		}
		
		this.accountName = accountName;
		this.balance = initialBalance;
	}
	
	public A debit (double balance) throws InvalidDebitException
	{
		
		if (balance <= 0)
		{
			InvalidDebitException invalidDebitException = new InvalidDebitException("Debit balance is less than or equals to zero");
			
			throw invalidDebitException;
		}
		
		
		this.balance -= balance;
		
		return null;
	}

}
