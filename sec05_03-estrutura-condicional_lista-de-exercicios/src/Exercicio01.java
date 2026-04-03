import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int x = sc.nextInt();
		
		if (x > 0) {
			System.out.printf("O número %d é positivo.%n", x);
		} else {
			System.out.printf("O número %d é negativo.%n", x);
		}
		
		sc.close();

	}

}
