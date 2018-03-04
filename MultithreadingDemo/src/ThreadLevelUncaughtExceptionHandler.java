
public class ThreadLevelUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable arg1) {
		System.out.println(this + " =>" + t.getName() + " => " + arg1);
	}
	

}
