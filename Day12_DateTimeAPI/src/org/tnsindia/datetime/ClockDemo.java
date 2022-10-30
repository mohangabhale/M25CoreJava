package org.tnsindia.datetime;

import java.time.Clock;

public class ClockDemo {

	public static void main(String[] args) {
		Clock c=Clock.systemUTC();
		Clock c1=Clock.systemDefaultZone();
		System.out.println(c1);
		
	}

}
