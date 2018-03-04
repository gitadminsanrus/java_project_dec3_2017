
public class SavingsAccount extends BankAccount {

	public SavingsAccount(String accountName, double initialBalance) throws InvalidBankAccountException {
		super(accountName, initialBalance);
	}

	@Override
	public B debit(double balance) throws InvalidSavingsAccountDebitException {
//		super.debit(balance);
		
		return null;
	}
	

}
