package Jodatime;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.Interval;
import org.joda.time.Period;
import org.joda.time.Years;
/**
 * Classe que calcula diferencia de dias entre uma data e outra.
 * @author Edson
 *
 */
public class ComparandoData {
	public static void main(String[] args) {
		
		DateTime dataAnterior = new DateTime(2016,2,1,0,0);
		DateTime dateHoje = new DateTime();
		
		
		//classe responsavel por fazer diferenca de datas, chamando o daysBeteween.
		
		Days days = Days.daysBetween(dataAnterior, dateHoje);
		System.out.println("Diferenca em dias: " + days.getDays());
		
		Years years = Years.yearsBetween(dataAnterior, dateHoje);
		System.out.println("Diferença entre anos: " +  years.getYears());
		
		//deve ser do maior para o menor.
		Interval interval = new Interval(dataAnterior, dateHoje);
		System.out.println("Intervalo entre datas: " + interval.toString());
		
		/**
		 * Mexendo com intervalos de datas, notem que tempo por periodo e por duração.
		 * 
		 */
		Duration duration = interval.toDuration();
		System.out.println(duration.getStandardDays());
		System.out.println(duration.getStandardHours());
		System.out.println(duration.getStandardMinutes());
		
		
		Period period = interval.toPeriod();
		System.out.println(period.getMonths());
		System.out.println(period.getYears());
		

	}
}
