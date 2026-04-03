package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Program {
	
	// Data-hora
	public static void main(String[] args) {
		
		// https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/format/DateTimeFormatter.html		
		// Instanciação
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now(); // global
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		
		// Converte String para Data-Hora
		LocalDate d04 = LocalDate.parse("2026-03-25"); // Texto ISO 8601
		LocalDateTime d05 = LocalDateTime.parse("2026-03-25T14:57:09");
		Instant d06 = Instant.parse("2026-03-25T01:30:58Z");
		
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		
		// Converte de local (GMT-3) para global (GMT-0)
		Instant d07 = Instant.parse("2026-03-25T17:57:58-03:00");
		
		System.out.println("d07 = " + d07);
		
		// Texto em formato customizado
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 15:54", fmt2);
		
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		
		LocalDate d10 = LocalDate.of(2026, 3, 25);
		LocalDateTime d11 = LocalDateTime.of(2026, 3, 25, 15, 54);
		
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
		
		System.out.println("---------------");
		
		// Formatação: d04, d05, d06
		// Convertendo para texto
		
		System.out.println("d04 = " + d04.format(fmt1));
		System.out.println("d04 = " + fmt1.format(d04));
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("d05 = " + d05.format(fmt1));
		System.out.println("d05 = " + d05.format(fmt2));
		System.out.println("d05 = " + d05.format(fmt4));
		
		// Instant necessita de formatação com zona!
		System.out.println("d06 = " + fmt3.format(d06)); // Por que Instant não possui o método format()
		System.out.println("d06 = " + fmt5.format(d06)); 
		
		// Conversão: d04, d05, d06
		
		// obtendo ZoneIds
//		for (String s : ZoneId.getAvailableZoneIds()) {
//			System.out.println(s);
//		}
		
		// Instant para local considerando horário do computador
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		
		System.out.println("Resultado 1 = " + r1);
		System.out.println("Resultado 2 = " + r2);
		System.out.println("Resultado 2 = " + r3);
		System.out.println("Resultado 2 = " + r4);
		
		// Obtenção de dados (dia, mês, ano, horário): d04, d05
		
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 mês = " + d04.getMonthValue());
		System.out.println("d04 ano = " + d04.getYear());
		System.out.println("d05 hora = " + d05.getHour());
		System.out.println("d05 minuto = " + d05.getMinute());
		
		// Calculo com data-hora: d04, d05, d06
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
//		Instant pastWeekLocalInstant = d06.minus(Duration.ofDays(7));
		Instant pastWeekLocalInstant = d06.minus(7, ChronoUnit.DAYS);
//		Instant nextWeekLocalInstant = d06.plus(Duration.ofDays(7));
		Instant nextWeekLocalInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
		System.out.println("pastWeekLocalInstant = " + pastWeekLocalInstant);
		System.out.println("nextWeekLocalInstant = " + nextWeekLocalInstant);
		
		// Duração entre horas: d05
		
		// LocalDate, por não ter horas, necessita de conversão
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
//		Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atTime(0, 0));
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t3 = Duration.between(pastWeekLocalInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekLocalInstant); // valores invertidos
		
		System.out.println("Duration t1 = " + t1.toDays());
		System.out.println("Duration t2 = " + t2.toDays());
		System.out.println("Duration t3 = " + t3.toDays());
		System.out.println("Duration t4 = " + t4.toDays());
		
	}

}
