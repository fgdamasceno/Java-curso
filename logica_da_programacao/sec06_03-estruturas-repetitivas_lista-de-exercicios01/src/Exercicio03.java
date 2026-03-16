import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while (codigo != 4) {
			
			if (codigo == 1) {
				alcool++;
			} else if (codigo == 2) {
				gasolina++;
			} else if (codigo == 3){
				diesel++;
			} else {
				System.out.println("MUITO OBRIGADO!");
			}
			
			codigo = sc.nextInt();
			
		}
		
		System.out.println("Álcool = " + alcool);
		System.out.println("Gasolina = " + gasolina);
		System.out.println("Diesel = " + diesel);
		
		sc.close();
	}

}
