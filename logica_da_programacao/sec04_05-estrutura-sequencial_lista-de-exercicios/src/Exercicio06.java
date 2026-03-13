import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double PI = 3.14159;

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		double triangulo = (a * c) / 2; // a - base; c = altura
		double circulo = PI * (c * c); // c = raio
		double trapezio = ((a + b) * c) / 2; // a e b = bases; c = altura
		double quadrado = b * b; // b = lados
		double retangulo = a * b; // a e b = lados

		System.out.printf("TRIANGULO = %.3f%n", triangulo);
		System.out.printf("CIRCULO = %.3f%n", circulo);
		System.out.printf("TRAPEZIO = %.3f%n", trapezio);
		System.out.printf("QUADRADO = %.3f%n", quadrado);
		System.out.printf("RETANGULO = %.3f%n", retangulo);

		sc.close();

	}

}
