package Jodatime;


import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
public class ConvertendoDatas {

	public static void main(String[] args) {
		
		//Convertendo uma strin para o formato dd-MM-yyyy
		String data = "24/07/1994";
		DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern("dd/MM/yyyy");
		LocalDate localDate = LocalDate.parse(data, dateTimeFormatter);
		System.out.println(localDate);
	}

}
