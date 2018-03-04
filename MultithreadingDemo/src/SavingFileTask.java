
public class SavingFileTask implements Runnable {
	
	
	@Override
	public void run() {
		
		for (int index = 0; index < 100000; index++) {
			
			System.out.println("SavingFileTask => [" + index + "]");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
