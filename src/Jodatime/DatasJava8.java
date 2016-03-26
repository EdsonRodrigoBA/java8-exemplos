package Jodatime;

import java.time.format.DateTimeFormatter;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;

public class DatasJava8 {

	public static void main(String[] args) {
		/**
		 * Pegando a data do Sistema operacional. no formato dd-MM-yy
		 * usando um formatador para imprimir no formato dd/MM/yyyy
		 */
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		org.joda.time.format.DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern("dd/MM/yyyy");
		System.out.println(localDate.toString(dateTimeFormatter));
		
		DateTime dateTime = new DateTime();
		System.out.println(dateTime.plusDays(1));
		
	}

}
