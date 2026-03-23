package application;

import java.util.Scanner;

import entities.Pessoa;

public class Exercicio09 {

	// Problema mais_velho
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		Pessoa[] vect = new Pessoa[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Dados da " + (i + 1) + "ª pessoa:");
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			vect[i] = new Pessoa(name, age);
		}
		
		String olderPersonName = "";
		int higherAge = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getAge() > higherAge) {
				higherAge = vect[i].getAge();
				olderPersonName = vect[i].getName();
			}
		}
		
		System.out.print("PESSOA MAIS VELHA: " + olderPersonName);
		
		sc.close();

	}

}
