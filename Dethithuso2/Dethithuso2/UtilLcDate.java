package Dethithuso2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UtilLcDate {
	public static LocalDate stringToDate(String str) {
		LocalDate date = null;
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		try {
			date = LocalDate.parse(str, dateTimeFormatter);
			return date;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static String dateToString(LocalDate date) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String string = date.format(dateTimeFormatter);
		return string;
	}
}
