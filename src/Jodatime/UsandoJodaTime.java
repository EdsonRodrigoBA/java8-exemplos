package Jodatime;

import java.time.LocalDateTime;
import java.util.Locale;

import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.LocalDate;

public class UsandoJodaTime {

	public static void main(String[] args) {
		
		DateTime data = new DateTime();
		//Pegando o mes que estamos em texto e colocando em ingles.
		System.out.println(data.monthOfYear().getAsShortText(Locale.ENGLISH));
		//pegando so o ultimos dois ditito do ano ex: 2016, retorna 16
		System.out.println(data.yearOfCentury());
		

	}

}
