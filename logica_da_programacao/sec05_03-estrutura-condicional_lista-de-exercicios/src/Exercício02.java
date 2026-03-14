import java.util.Scanner;

public class Exercício02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int x = sc.nextInt();
		
		if (x % 2 == 0) {
			System.out.printf("O número %d é par.%n", x);
		} else {
			System.out.printf("O número %d é impar.%n", x);			
		}
		
		sc.close();

	}

}
