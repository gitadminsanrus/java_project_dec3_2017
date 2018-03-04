package executors;

public class ExecutorTask implements Runnable {
	
	private String taskId;
	
	public ExecutorTask(String taskId) {
		this.taskId = taskId;
	}

	@Override
	public void run() {

		for (int i = 0; i < 20; i++) {
			
			System.out.println("TaskId = " + taskId + " run by " + Thread.currentThread().getName());
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	

}
