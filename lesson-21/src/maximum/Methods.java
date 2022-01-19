package maximum;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class Methods {

	Date d = new Date();

	public void toLocalDate(Date date) {
		LocalDate ld = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).toLocalDate();
		System.out.println("LocalDate: " + ld);
	}

	public void toLocalTime(Date date) {
		LocalTime lt = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).toLocalTime();
		System.out.println("LocalTime: " + lt);
	}

	public void toLocalDateTime(Date date) {
		LocalDateTime ldt = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
		System.out.println("LocalDateTime: " + ldt);
	}
}
