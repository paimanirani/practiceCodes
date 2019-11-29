package com.ptg.hibernatedemoapplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	// read a date string and covert it to a date
	public static Date parseDate(String date) throws ParseException {
		return sdf.parse(date);
	}

	// read date and convert it to string
	public static String formatDate(Date date) {
		String result = null;
		if (date != null) {
			result = sdf.format(date);
		}
		return result;
	}

}
