
public class CreditTask implements Runnable {
	
	private BankAccount bankAccount;
	
	public CreditTask(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public void run() {
		if (bankAccount != null) {
			bankAccount.credit(5);
			
//			String threadName = Thread.currentThread().getName();
//			System.out.println("[" + threadName + "]" + bankAccount.getCurrentBalance());
		}
	}

}
