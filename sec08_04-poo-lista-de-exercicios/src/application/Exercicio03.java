package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Enter student name: ");
		student.name = sc.nextLine();
		
		System.out.print("Enter first grade: ");
		student.firstGrade = sc.nextDouble();
		
		System.out.print("Enter second grade: ");
		student.secondGrade = sc.nextDouble();
		
		System.out.print("Enter third grade: ");
		student.thirdGrade = sc.nextDouble();
		
		System.out.println();
		if (student.isApproved()) {
			System.out.printf("FINAL GRADE = %.2f%n", student.calcFinalGrade());
			System.out.println("PASS");
		} else {
			System.out.printf("FINAL GRADE = %.2f%n", student.calcFinalGrade());
			System.out.println("FAILED");
			System.out.printf("MISSIN %.2f POINTS", student.calcMissingPoints());
		}	
		
		
		sc.close();

	}

}
