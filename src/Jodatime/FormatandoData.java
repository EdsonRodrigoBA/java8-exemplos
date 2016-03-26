package Jodatime;


import java.time.format.DateTimeFormatter;

import org.joda.time.DateTime;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;

public class FormatandoData {
	public static void main(String[] args) {
		DateTime localDateTime = new DateTime();
		org.joda.time.format.DateTimeFormatter formater = DateTimeFormat.forPattern("dd/MM/yyyy");
		System.out.println(localDateTime.toString(formater));
		
		/**
		 * Testando quantas horas faltam para o ano chamando os metodos abaixo
		 * Testando tambem quantas horas faltam para o aniversario
		 */
		System.out.println(horasAnoNovo(localDateTime, 2017));
		System.out.println(diaAniversario(new DateTime(2017,7,24,0,0)));
		
	
	}
	//Metodo que verifica quanto tempo falta para o ano novo.
	//para ver os dias usa a classe Days e segue o mesmo processo
	public static int horasAnoNovo(DateTime data, int ano){
		DateTime dataFinal = new DateTime(ano,1,1,0,0);
		return Hours.hoursBetween(data, dataFinal).getHours();
	}
	
	public static String diaAniversario(DateTime dateTime){
		return dateTime.dayOfWeek().getAsText();
	}
}
