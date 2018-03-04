
public class CustomUncaughtExceptionThreadHandler implements Thread.UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable arg1) {
		System.out.println(t.getName() + " => " + arg1);
	}
	

}
