package com.pk.investing.server.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Util {

	public static Boolean isEmpty(String str) {
		return str == null || str.isEmpty() ? true : false;
	}

	public static LocalDateTime strToDateTime(String dateStr) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		if (!dateStr.contains(":")) {
			dateStr = dateStr + " 00:00";
		}
		return LocalDateTime.parse(dateStr, formatter);
	}

	public static LocalDate strToDate(String dateStr) {
		// DateTimeFormatter formatter = DateTimeFormat.forPattern("YYYY-MM-dd HH:mm");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		return LocalDate.parse(dateStr, formatter);
	}

	public static String localDateTimeToString() {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("datetime : " + localDateTime);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String dateTime = localDateTime.format(formatter);
		return dateTime;
	}
}
