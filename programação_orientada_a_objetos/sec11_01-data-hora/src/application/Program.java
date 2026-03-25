package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
		Instant d06 = Instant.parse("2026-03-25T17:57:58Z");
		
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		
		// Converte de local (GMT-3) para global (GMT-0)
		Instant d07 = Instant.parse("2026-03-25T17:57:58-03:00");
		
		System.out.println("d07 = " + d07);
		
		// Texto em formato customizado
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 15:54", fmt2);
		
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		
		LocalDate d10 = LocalDate.of(2026, 3, 25);
		LocalDateTime d11 = LocalDateTime.of(2026, 3, 25, 15, 54);
		
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
		
	}

}
