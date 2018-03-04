
public class DebitTask implements Runnable {
	
	private BankAccount bankAccount;
	
	public DebitTask(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public void run() {
		if (bankAccount != null) {
			bankAccount.debit(5);
			
//			String threadName = Thread.currentThread().getName();
//			System.out.println("[" + threadName + "]" + bankAccount.getCurrentBalance());
		}
	}

}
