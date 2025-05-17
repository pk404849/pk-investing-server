package com.pk.investing.server;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Test {

	public static void main(String[] args) {
		 long timestampMillis = System.currentTimeMillis();
System.out.println(timestampMillis);
//1747501085642
//1747459428456069
	        // Convert to LocalDateTime
	        LocalDateTime localDateTime = Instant.ofEpochMilli(timestampMillis)
	                .atZone(ZoneId.systemDefault()) // Use system's default timezone
	                .toLocalDateTime();

	        System.out.println("LocalDateTime: " + localDateTime);
	}

}
