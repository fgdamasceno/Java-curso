import java.util.Locale;
import java.util.Scanner;

public class Exercício08 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double cotaA = 2000.0;
		double cotaB = 3000.0;
		double cotaC = 4500.0;
		
		double baseFaixaB = cotaB - cotaA;
		double baseFaixaC = cotaC - cotaB;		
		
		double taxaB = 0.08;
		double taxaC = 0.18;
		double taxaD = 0.28;
		
		double imposto;
		
		System.out.println("Digite o valor do salário:");
		double salario = sc.nextDouble();
		
		
		if (salario <= cotaA) {
			System.out.println("Isento");
		} else if (salario > cotaA && salario <= cotaB) {
			imposto = (salario - cotaA) * taxaB;
			System.out.printf("R$ %.2f%n", imposto);
		} else if (salario > cotaB && salario < cotaC) {
			imposto = (baseFaixaB * taxaB) + ((salario - cotaB) * taxaC);
			System.out.printf("R$ %.2f%n", imposto);
		} else {
			imposto = (baseFaixaB * taxaB) + (baseFaixaC * taxaC) + ((salario - cotaC) * taxaD);
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();		

	}

}
