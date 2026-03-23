package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	// Problema: maior_posição
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] += sc.nextDouble();
		}
		
		double higher = 0.0;
		int higherPosition = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] > higher) {
				higher = vect[i];
				higherPosition = i;
			}
		}
		
		System.out.println();
		System.out.print("MAIOR VALOR = " + higher);
		System.out.println();
		System.out.print("POSIÇÃO DO MAIOR VALOR = " + higherPosition);
		
		sc.close();

	}

}
