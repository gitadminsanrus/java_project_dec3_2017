
public class DownloadTask implements Runnable {

	@Override
	public void run() {
		
		for (int index = 0; index < 100000; index++) {
			
			System.out.println("DownloadTask => [" + index + "]");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
