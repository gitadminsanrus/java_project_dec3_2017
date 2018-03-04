
public class BankAccount {
	
	private String name;
	private double balance;
	
	public BankAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public synchronized void debit(double amount) {
		
		synchronized(BankAccount.class) 
		{
			//class level synchronization
		}
		
		synchronized(this)
		{
			//object level synchronization
		}
		
		
		if (balance <= 100) {
			throw new RuntimeException("DEBIT FAILED. INSUFFICIENT FUNDS");
		}
		
		balance = balance - amount;
		System.out.println("[" + Thread.currentThread().getName() + "] (DEBIT) Current Balance => " + this.balance);
	}
	
	public synchronized void credit(double amount) {
		balance = balance + amount;
		System.out.println("[" + Thread.currentThread().getName() + "] (CREDIT) Current Balance => " + this.balance);
	}
	
	public double getCurrentBalance() {
		return balance;
	}

}
