package org.tnsindia.datetime;

import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {

	public static void main(String[] args) {
		String x="15-10-2022 21:00";
		DateTimeFormatter df=DateTimeFormatter.ofPattern("DD-MM-YYYY HH:MM");
		//LocalDateTime l = LocalDateTime.parse(x, df);
		//LocalDateTime 2 = LocalDateTime.now();
		
		//DateTimeFormatter df1=DateTimeFormatter.ofPattern(" MM-DD-YYYY HH:MM");
		//String x1=l.format(df1);
		
		System.out.println(x);

	}	

}
