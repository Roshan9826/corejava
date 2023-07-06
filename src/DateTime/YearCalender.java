package DateTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class YearCalender {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String str = args[0];
		Date todey = new Date();

		Calendar cal = Calendar.getInstance();

		cal.setTime(todey);

		for (int i = 1; i <= 12; i++) {
			cal.add(Calendar.DATE, 30);

			System.out.println(sdf.format(cal.getTime()));

		}
	}

}
