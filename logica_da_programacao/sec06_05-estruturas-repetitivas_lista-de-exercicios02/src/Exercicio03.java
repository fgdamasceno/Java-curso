import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int pesoA = 2;
		int pesoB = 3;
		int pesoC = 5;
		
		double mediaPonderada = 0.0;
		for (int i = 0; i < n; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			mediaPonderada = ((a * pesoA) + (b * pesoB) + (c * pesoC)) / (pesoA + pesoB + pesoC);
			System.out.printf("%.1f%n", mediaPonderada);
		}		
		
		sc.close();
		
	}

}
