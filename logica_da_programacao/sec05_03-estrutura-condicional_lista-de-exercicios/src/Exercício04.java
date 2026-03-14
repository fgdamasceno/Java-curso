import java.util.Scanner;

public class Exercício04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual a hora inicial do jogo?");
		int inicio = sc.nextInt();
		
		System.out.println("Qual a hora final do jogo?");
		int termino = sc.nextInt();		
		
		int totalHoras;
		
		if (termino > inicio) {
			totalHoras = termino - inicio;
			System.out.printf("O JOGO DUROU %d HORA(S).%n", totalHoras);
		} else if (termino == inicio) {
			totalHoras = termino - inicio;
			System.out.printf("O JOGO DUROU %d HORA(S).%n", totalHoras);
		} else {
			totalHoras = (24 - inicio) + termino;
			System.out.printf("O JOGO DUROU %d HORA(S).%n", totalHoras);
		}
		
		sc.close();
		
	}

}
