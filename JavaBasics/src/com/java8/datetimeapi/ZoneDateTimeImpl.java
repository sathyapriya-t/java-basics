package com.java8.datetimeapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeImpl {

	public static void main(String[] args) {

		// "ZonedDateTime !!"
		System.out.println("ZonedDateTime  !!");
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println("ZonedDateTime " + zonedDateTime);
		System.out.println("Zoned Offset" + zonedDateTime.getOffset());
		ZoneId.getAvailableZoneIds().stream().filter(z -> z.startsWith("Asia")).forEach(zone -> {
			System.out.println(zone);
		});

		// ZonedDateTime with ZoneID
		System.out.println("ZonedDateTime with ZoneID  !!");
		ZonedDateTime zonedDateTimeWithID = ZonedDateTime.now(ZoneId.of("Asia/Istanbul"));
		System.out.println("zonedDateTimeWithID " + zonedDateTimeWithID);

	}

}
