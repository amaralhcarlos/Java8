import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate localDate = LocalDate.now();

		LocalDate cyberpunkEra = LocalDate.of(2099, Month.JANUARY, 25);

		Period dias = Period.between(localDate, cyberpunkEra);

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println(localDate.format(dateTimeFormatter));
		System.out.println(cyberpunkEra.format(dateTimeFormatter));
	}

}
