/**
 * 
 */
package com.bhaskar.practiceproject;

import java.sql.Timestamp;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @author Bhaskara S
 *
 */
public class UnixEpochToTimeConverter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalDateTime localDateTime = new Timestamp((long) 1626241077.2315953).toLocalDateTime();
		LocalDateTime localDateTime1 = new Timestamp((long) 1626241091.173891).toLocalDateTime();
		System.out.println(localDateTime);
		System.out.println(localDateTime1);
		long diff = Duration.between(localDateTime, localDateTime1).toMillis();
		System.out.println(diff);
		System.out.println("-------");
		System.out.println(Instant.ofEpochMilli((long) 1626241077.2315953).until(Instant.ofEpochMilli((long) 1626241091.173891), ChronoUnit.MILLIS));
	}

}
