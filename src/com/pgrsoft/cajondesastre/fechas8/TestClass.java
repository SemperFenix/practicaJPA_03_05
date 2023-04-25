package com.pgrsoft.cajondesastre.fechas8;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.time.ZoneId;

public class TestClass {

	public static void main(String[] args) {
		
		LocalDate localDate1 = LocalDate.now();
		LocalDate localDate2 = LocalDate.of(2020, 04, 01);
		LocalDate localDate3 = LocalDate.parse("2015-02-20");
		
		System.out.println(localDate1);
		System.out.println(localDate2);
		System.out.println(localDate3);
		
		System.out.println(localDate1.plusDays(100000L));
		System.out.println(localDate1.plusDays(-10L));

		DayOfWeek dia = LocalDate.parse("0000-01-01").getDayOfWeek();
		
		System.out.println(dia);
		
		boolean notBefore = LocalDate.parse("2016-06-12")
				  .isBefore(LocalDate.parse("2016-06-11"));
		
		System.out.println("la fecha no es anterior a...: " + notBefore);
		 
		// *************************************************+
		
		LocalTime now = LocalTime.now();
	
		System.out.println(now);
		System.out.println(LocalTime.now());
	
		ZoneId zoneId = ZoneId.of("Europe/Paris");
		
		System.out.println(zoneId);
		
	}

}
