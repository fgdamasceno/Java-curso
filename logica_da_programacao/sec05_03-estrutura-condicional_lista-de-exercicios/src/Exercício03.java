import java.util.Scanner;

public class Exercício03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro número:");
		int x = sc.nextInt();

		System.out.println("Digite o segundo número:");
		int y = sc.nextInt();

		int restante;

		if (x > y) {
			restante = x % y;
		} else {
			restante = y % x;
		}

		if (restante == 0) {
			System.out.println("São múltiplos.");
		} else {
			System.out.println("Não são múltiplos.");
		}

		sc.close();

	}

}
