package org.tnsindia.datetime;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateTime {

	public static void main(String[] args) {
		LocalDate d=LocalDate.now();
		LocalTime obj=LocalTime.now();
		LocalDateTime obj1=LocalDateTime.now();
		LocalDate obj2=LocalDate.of(2022, 2, 28);
		System.out.println(d);
		System.out.println(obj);
		
		System.out.println(obj1);
		System.out.println(obj2);
	}

	private static LocalDateTime now() {
		return null;
	
	}

}
