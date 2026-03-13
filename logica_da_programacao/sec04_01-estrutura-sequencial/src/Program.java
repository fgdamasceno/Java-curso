import java.util.Locale;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // Padrão decimal com ponto US
		
		String nome = "Fernando";
		int anoNascimento = 1982;
		int anoAtual = 2026;
		int idade = anoAtual - anoNascimento;
		
		System.out.println(idade);
		
		double salario = 3500.5678;	
		
		// printf print formatted
		System.out.printf("%.2f%n", salario); // %.2f quantidade decimais; %n quebra de linha
		
		// printf + concatenação de elementos
		System.out.printf("Meu nome é %s, nasci em %d e tenho %d anos.", nome, anoNascimento, idade);
		
	}
}
