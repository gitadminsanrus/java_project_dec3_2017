
public class BankAccountDemo {

	public static void main(String[] args) {
		
		Thread.setDefaultUncaughtExceptionHandler(new CustomUncaughtExceptionThreadHandler());
		
		BankAccount bankAccount = new BankAccount("Chequing Account", 100);
		DebitTask debitTask = new DebitTask(bankAccount);
		CreditTask creditTask = new CreditTask(bankAccount);
		
		Thread t1 = new Thread(debitTask, "T1");
		Thread t2 = new Thread(debitTask, "T2");
		Thread t3 = new Thread(creditTask, "T3");
		Thread t4 = new Thread(creditTask, "T4");
		Thread t5 = new Thread(creditTask, "T5");
		
		t1.setUncaughtExceptionHandler(new ThreadLevelUncaughtExceptionHandler());
		t2.setUncaughtExceptionHandler(new ThreadLevelUncaughtExceptionHandler());
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		

	}

}
