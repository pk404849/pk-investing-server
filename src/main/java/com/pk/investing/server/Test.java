package com.pk.investing.server;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		long timestampMillis = System.currentTimeMillis();
		System.out.println(timestampMillis);
//1747501085642
//1747459428456069
		// Convert to LocalDateTime
		LocalDateTime localDateTime = Instant.ofEpochMilli(timestampMillis).atZone(ZoneId.systemDefault()) // Use
																											// system's
																											// default
																											// timezone
				.toLocalDateTime();
		System.out.println("LocalDateTime: " + localDateTime);
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("datetime : " + dateTime);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

		String formattedTime = dateTime.format(formatter);

		System.out.println("Formatted Time: " + formattedTime);
		System.out.println(strToDateTime(formattedTime));

//		String dateTimeStr = "2025-05-18 14:30:45"; // format: yyyy-MM-dd HH:mm:ss
//
//		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//		LocalDateTime dateTime1 = LocalDateTime.parse(dateTimeStr, formatter1);
//
//		System.out.println("Parsed LocalDateTime: " + dateTime1);

		
	}

	public static LocalDateTime strToDateTime(String dateStr) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); 
		if(!dateStr.contains(":")) {
			dateStr = dateStr +" 00:00";
		}
		return LocalDateTime.parse(dateStr, formatter);
		
	}
	

}
