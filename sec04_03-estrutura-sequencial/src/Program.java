import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		// AULA ENTRADA DE DADOS
		Scanner sc = new Scanner(System.in);

		String name;
		int anoNascimento, anoAtual, idade;
		double salario;

		anoAtual = 2026;

		System.out.println("Digite o seu nome:");
		name = sc.next(); // recebe String

		System.out.println("Digite seu ano de nascimento:");
		anoNascimento = sc.nextInt(); // recebe int

		System.out.println("Digite o seu salário:");
		salario = sc.nextDouble(); // recebe double
		idade = anoAtual - anoNascimento;

		System.out.printf("%nO nome digitado é %s.", name);
		System.out.printf("%nIdade é %d.", idade);
		System.out.printf("%nO salário digitado é $ %.2f.", salario);

		// Entrada de dados até a quebra de linha - o usuário aperta a tecla ENTER
		String nomeCompleto;

		System.out.println("Digite seu nome completo:");
		sc.nextLine(); // Consome linha pendente gerada pelo quebra de linha anterior
		nomeCompleto = sc.nextLine();

		System.out.printf("Nome Completo: %s%n", nomeCompleto);

		sc.close();

	}

}
