package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	
	// Problema: soma_vetor
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		String values = "";
		
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i];
			values += vect[i] + " ";
		}
		
		double avg = sum / vect.length;
		
		System.out.println();
		System.out.println("VALORES = " + values);
		System.out.printf("SOMA = %.2f%n", sum);
		System.out.printf("MEDIA = %.2f%n", avg);
		
		sc.close();

	}

}
