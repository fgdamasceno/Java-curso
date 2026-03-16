import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		// while loop
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();;
		int soma = 0;
		
		while (numero != 0) {
			soma += numero;
			numero = sc.nextInt();
		}
		
		System.out.println(soma);
	
		sc.close();
	}

}
