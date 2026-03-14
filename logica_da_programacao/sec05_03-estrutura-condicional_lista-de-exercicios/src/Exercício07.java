import java.util.Locale;
import java.util.Scanner;

public class Exercício07 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de duas coordenadas (x, y):");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if (x == 0 && y == 0) { // origem
			System.out.println("Origem");
		} else if (x > 0 && y > 0) { // q1
			System.out.println("Q1");
		} else if (x < 0 && y > 0) { // q2
			System.out.println("Q2");
		} else if (x < 0 & y < 0) { // q3
			System.out.println("Q3");
		} else { // q4
			System.out.println("Q4");
		}
		
		sc.close();

	}

}
