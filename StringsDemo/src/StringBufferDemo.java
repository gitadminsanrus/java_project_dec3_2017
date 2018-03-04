
public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		sb.append("A");
		sb.append("B");
		
		String str = sb.toString();
		
		sb.append(" DFGHJK");
		str = sb.toString();

	}

}
