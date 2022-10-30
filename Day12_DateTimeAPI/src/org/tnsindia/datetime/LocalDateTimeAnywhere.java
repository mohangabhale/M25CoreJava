package org.tnsindia.datetime;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalDateTimeAnywhere {

	public static void main(String[] args) {
		LocalTime t=LocalTime.now(ZoneId.of("US/Alaska"));
		System.out.println(t);
		for(String  s:ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
		}
	}

}
