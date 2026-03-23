package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Exercicio03 {

	
	// Problema: alturas
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		Pessoa[] pessoa = new Pessoa[n];
		
		for (int i = 0; i < pessoa.length; i++) {
			System.out.println("Dados da " + (i + 1) + "ª pessoa:");
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			pessoa[i] = new Pessoa(name, age, height);
		}
		
		double sum = 0.0;
		for (int i = 0; i < pessoa.length; i++) {
			sum += pessoa[i].getHeight();
		}		
		double avg = sum / pessoa.length;
		
		int lessThanSixteen = 0;
		for (int i = 0; i < pessoa.length; i++) {
			if (pessoa[i].getAge() < 16) {
				lessThanSixteen++;
			}			
		}		
		double lessThanSixteenPercentage = lessThanSixteen * 100 / pessoa.length;
		
		System.out.println();
		System.out.printf("Altura média: %.2f%n", avg);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", lessThanSixteenPercentage);
		
		for (int i = 0; i < pessoa.length; i++) {
			if (pessoa[i].getAge() < 16) {
				System.out.println(pessoa[i].getName());
			}
		}
		
		sc.close();

	}

}
