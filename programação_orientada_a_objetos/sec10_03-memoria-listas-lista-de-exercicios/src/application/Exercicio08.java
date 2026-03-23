package application;

import java.util.Scanner;

public class Exercicio08 {

	// Problema: media_pares
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		
	
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] += sc.nextInt();
		}
		
		double sum = 0.0;
		int count = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				sum += vect[i];
				count++;
			}
		}
		
		double avg = sum / count;
		
		if (count > 0) {
			System.out.printf("MÉDIA DOS PARES = %.1f%n" + avg);
		} else {
			System.out.println("NENHUM NÚMERO PAR");
		}
		
		sc.close();

	}

}
