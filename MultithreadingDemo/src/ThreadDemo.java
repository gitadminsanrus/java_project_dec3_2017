
public class ThreadDemo {

	public static void main(String[] args) {
		
		//1. Create a thread object
		MyThread t1 = new MyThread();
		
		//2. start running a thread in new execution environment
		t1.start();
		
		for (int j = 0; j < 100000; j++) {
			System.out.println("MainThread => [j = " + j + "]");
		}
		
	}

}
