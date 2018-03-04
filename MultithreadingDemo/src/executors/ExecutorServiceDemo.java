package executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceDemo {

	public static void main(String[] args) {
		
		ExecutorService sequentialExecutor = Executors.newSingleThreadExecutor();
		ExecutorService fourPoolSizeExecutor = Executors.newFixedThreadPool(2);
		
		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 4, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
		
		
		for (int i = 0; i < 100; i++) {
//			sequentialExecutor.execute(new ExecutorTask("[Task : " + (i + 1) + "]"));
			threadPoolExecutor.submit(new ExecutorTask("[Task : " + (i + 1) + "]"));
		}
		
		System.out.println("end of main method");

	}

}
