package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Exercicio11 {

	// Problema: dados_pessoas
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		Pessoa[] pessoa = new Pessoa[n];
		
		for (int i = 0; i < pessoa.length; i++) {
			System.out.print("Altura da " + (i + 1) + "ª pessoa: ");
			double height = sc.nextDouble();
			System.out.print("Gênero da " + (i + 1) + "ª pessoa: ");
			char gender = sc.next().charAt(0);
			
			pessoa[i] = new Pessoa(height, gender);
		}
		
		double higher = 0.0;
		for (int i = 0; i < pessoa.length; i++) {
			if (pessoa[i].getHeight() > higher) {
				higher = pessoa[i].getHeight();
			}
		}
		
		double lower = pessoa[0].getHeight();
		for (int i = 0; i < pessoa.length; i++) {
			if(pessoa[i].getHeight() < lower) {
				lower = pessoa[i].getHeight();
			}
		}
		
		double femaleHeightSum = 0.0;
		int femaleCount = 0;
		int maleCount = 0;
		for (int i = 0; i < pessoa.length; i++) {
			if (pessoa[i].getGender() == 'F') {
				femaleHeightSum += pessoa[i].getHeight();
				femaleCount++;
			} else {
				maleCount++;
			}
		}
		double femaleHeightAvg = femaleHeightSum / femaleCount;
		
		System.out.printf("Menor altura = %.2f%n", lower);
		System.out.printf("Maior altura = %.2f%n", higher);
		System.out.printf("Média das alturas das mulheres = %.2f%n", femaleHeightAvg);
		System.out.print("Número de homens = " + maleCount);
		
		sc.close();

	}

}
