import java.util.Locale;

public class StringDemo {

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = new String("Hello");
		String str3 = "Hello";
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str2 == str3);
		
		str2 = "Hello";
		System.out.println(str2 == str3);
		System.out.println(str1 == str2);
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		char[] targetArray = new char[2];
		"ABCDE".getChars(1, 3, targetArray, 0);
		
		System.out.println(targetArray[0]);
		System.out.println(targetArray[1]);
		
		System.out.println("ABC.getBytes()");
		byte[] bytes = "ABC".getBytes();
		System.out.println(bytes[0]);
		System.out.println(bytes[1]);
		System.out.println(bytes[2]);
		
		System.out.println("ACDGEH".compareTo("ABCD"));
		
		System.out.println("ABBCDZ".indexOf('B'));
		System.out.println("ABBCDZZZZZZZ".lastIndexOf('Z'));
		
		System.out.println("apparaître".toUpperCase(Locale.CANADA_FRENCH));
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
