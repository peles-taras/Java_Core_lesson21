package maximum;

import java.util.Date;

public class Application {
	public static void main(String[] args) {
		Methods m = new Methods();

		m.toLocalDate(new Date());
		m.toLocalTime(new Date());
		m.toLocalDateTime(new Date());
	}
}
