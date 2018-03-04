
public class RunnableTaskDemo {

	public static void main(String[] args) {
		
		DownloadTask downloadTask = new DownloadTask();
		SavingFileTask savingFileTask = new SavingFileTask();
		
		Thread t1 = new Thread(downloadTask);
		Thread t2 = new Thread(savingFileTask);
		
		t1.setDaemon(true);
		
		t1.start();
		t2.start();
		
		System.out.println("End of main method()");

	}

}
