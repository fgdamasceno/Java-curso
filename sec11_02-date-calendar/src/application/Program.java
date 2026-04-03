package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Program {
	
	public static void main(String[] args) throws ParseException {
		
		// Date
		// https://docs.oracle.com/javase/8/docs/api/java/util/Date.html
		// SimpleDateFormat
		// https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L * 60L * 5);
		
		Date y1 = sdf1.parse("25/06/2018");	
		Date y2 = sdf2.parse("25/06/2018 01:30:53");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println("X1 = " + x1);
		System.out.println("X2 = " + x1);
		System.out.println("X3 = " + x1);
		System.out.println("X4 = " + x1);
		
		System.out.println("Y1 = " + y1);
		System.out.println("Y2 = " + y1);
		
		System.out.println("Y1 = " + y1);
		System.out.println("Y2 = " + y2);
		
		System.out.println("Y3 = " + y3);
		
		System.out.println();
		
		System.out.println("X1 = " + sdf2.format(x1));
		System.out.println("X2 = " + sdf2.format(x1));
		System.out.println("X3 = " + sdf2.format(x1));
		System.out.println("X4 = " + sdf2.format(x1));
		
		System.out.println("Y1 = " + sdf2.format(y1));
		System.out.println("Y2 = " + sdf2.format(y1));
		
		System.out.println("Y1 = " + sdf2.format(y1));
		System.out.println("Y2 = " + sdf2.format(y2));
		
		System.out.println("Y3 = " + sdf2.format(y3));
		
		System.out.println();
		
		System.out.println("X1 = " + sdf3.format(x1));
		System.out.println("X2 = " + sdf3.format(x1));
		System.out.println("X3 = " + sdf3.format(x1));
		System.out.println("X4 = " + sdf3.format(x1));
		
		System.out.println("Y1 = " + sdf3.format(y1));
		System.out.println("Y2 = " + sdf3.format(y1));
		
		System.out.println("Y1 = " + sdf3.format(y1));
		System.out.println("Y2 = " + sdf3.format(y2));
		
		System.out.println("Y3 = " + sdf3.format(y3));
		
		System.out.println();
		
		// Calendar
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf4.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		
		System.out.println(sdf4.format(d)); // com adição de 4 horas
		
		int minutes = cal.get(Calendar.MINUTE);
		int month = cal.get(Calendar.MONTH) + 1; // mês de 0 a 11
		
		System.out.println("Minutes = " + minutes);
		System.out.println("Month = " + month);
		
		
		
	}

}
