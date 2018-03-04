package staticdemo;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class CircleDemo {

	public static void main(String[] args) {
		
		
		Circle blueCircle1 = new Circle("BLUE", 2.5);
		Circle blueCircle2 = new Circle("BLUE", 2.5);
		Circle blueCircle3 = new Circle("BLUE", 2.5);
		Circle blueCircle4 = new Circle("BLUE", 2.5);
		Circle blueCircle5 = new Circle("BLUE", 2.5);
		Circle blueCircle6 = new Circle("BLUE", 2.5);
		Circle blueCircle7 = new Circle("BLUE", 2.5);
		Circle blueCircle8 = new Circle("BLUE", 2.5);
		Circle blueCircle9 = new Circle("BLUE", 2.5);
		Circle blueCircle10 = new Circle("BLUE", 2.5);
		
		System.out.println("Area of blue circle => "+ blueCircle1.getArea());
		
		System.out.println("Number of circles created as of now => "+ Circle.getCount());
		
		
		//JVM level shared data
		System.setProperty("EXCEL_SHEET_FILE_NAME", "C:\\folder1\\data.xls");
		
//		SimpleDateFormat serverDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
//		Date date = serverDate.parse("2018-01-02'T'12:30:25.765'Z'+0530");
//		Calendar calendar = Calendar.getInstance(Locale.CANADA);
		
		
		
		

	}

}
