import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		// Expressão condicional ternária
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int x = sc.nextInt();		
		
		String parOuImpar = (x % 2 == 0) ? "par" : "impar";
		
		System.out.printf("O número %d é um número %s.%n", x, parOuImpar);
		
		sc.close();

	}

}
