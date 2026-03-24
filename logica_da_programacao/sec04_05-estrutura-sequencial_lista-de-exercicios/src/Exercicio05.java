import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Peça A
//		int codigoA = sc.nextInt();
		int quantidadeA = sc.nextInt();
		double precoA = sc.nextDouble();

		double valorTotalA = quantidadeA * precoA;

		// Peça B
//		int codigoB = sc.nextInt();
		int quantidadeB = sc.nextInt();
		double precoB = sc.nextDouble();

		double valorTotalB = quantidadeB * precoB;

		double valorFinal = valorTotalA + valorTotalB;

		System.out.printf("VALOR A PAGAR = R$ %.2f%n", valorFinal);

		sc.close();

	}

}
