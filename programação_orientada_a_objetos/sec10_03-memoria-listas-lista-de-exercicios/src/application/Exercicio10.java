package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Exercicio10 {

	// Problema: aprovados
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		Aluno[] alunos = new Aluno[n];

		for (int i = 0; i < alunos.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "º aluno:");
			sc.nextLine();
			String name = sc.nextLine();
			double scoreA = sc.nextDouble();
			double scoreB = sc.nextDouble();

			alunos[i] = new Aluno(name, scoreA, scoreB);
		}

		System.out.println("Alunos aprovados:");
		for (int i = 0; i < alunos.length; i++) {
			double average = (alunos[i].getScoreA() + alunos[i].getScoreB()) / 2.0;
			if (average >= 6.0) {
				System.out.println(alunos[i].getName());
			}
		}

		sc.close();

	}

}
