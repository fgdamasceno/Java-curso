import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			double resultado = 0.0;
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (b == 0) {
				System.out.println("divisão impossível");
			} else {
				resultado = a / b;
				System.out.printf("%.1f%n", resultado);
			}
		}
		
		sc.close();
		
	}

}
