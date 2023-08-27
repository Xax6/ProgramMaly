package main;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateFormatValidator {
	private static String DATE_FORMAT = "yyyy-MM-dd";
	
	public static boolean isValid(String date) {
        DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        dateFormat.setLenient(false);
        try {
        	dateFormat.parse(date);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
}
