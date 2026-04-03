package application;

import java.util.Scanner;

public class Exercicio04 {

	// Problema: numeros_pares
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		 
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] += sc.nextInt();
		}
		
		String even = "";
		int count = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				even += vect[i] + " ";
				count++;
			}
		}
		
		System.out.println();
		System.out.println("NÚMEROS PARES:");
		System.out.println(even);
		
		System.out.println();
		System.out.print("QUANTIDADE PARES = " + count);
		
		sc.close();

	}

}
