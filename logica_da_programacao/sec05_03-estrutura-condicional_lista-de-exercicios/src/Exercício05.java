import java.util.Scanner;

public class Exercício05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código e a quantidade:");
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double cachorroQuente = 4.0;
		double xSalada = 4.5;
		double xBacon = 5.0;
		double torradaSimples = 2.0;
		double refrigerante = 1.5;
		
		double valorTotal;
		
		if (codigo == 1) {
			valorTotal = cachorroQuente * quantidade;
			System.out.printf("Total: R$ %.2f%n", valorTotal);			
		} else if (codigo == 2) {
			valorTotal = xSalada * quantidade;
			System.out.printf("Total: R$ %.2f%n", valorTotal);			
		} else if (codigo == 3) {
			valorTotal = xBacon * quantidade;
			System.out.printf("Total: R$ %.2f%n", valorTotal);			
		} else if (codigo == 4) {
			valorTotal = torradaSimples * quantidade;
			System.out.printf("Total: R$ %.2f%n", valorTotal);			
		} else {
			valorTotal = refrigerante * quantidade;
			System.out.printf("Total: R$ %.2f%n", valorTotal);			
		}
		
		sc.close();

	}

}
