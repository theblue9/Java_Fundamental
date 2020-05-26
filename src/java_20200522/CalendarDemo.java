package java_20200522;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		cal.setTimeInMillis(1589167571153l);
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DATE);
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(year+","+month+","+day);
		System.out.println(hour+","+minute+","+second);
		
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd a hh:mm:ss E요일"); //패턴을 설정할 수 있다.
		String date = sdf.format(cal.getTime());
		System.out.println(date);
		
		
		
		
		
		
	}

}
