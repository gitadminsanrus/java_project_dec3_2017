
public class SequentialThread extends Thread {
	
	private Runnable[] tasks;
	
	public SequentialThread(Runnable[] tasks) {
		this.tasks = tasks;
	}
	
	public void run() {
		if (tasks != null && tasks.length > 0) {
			for (int index = 0; index < tasks.length; index++) {
				Runnable task = tasks[index];
				task.run();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
