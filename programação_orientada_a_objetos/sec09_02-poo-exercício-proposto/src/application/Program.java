package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int accNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String accHolder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char willDeposit = sc.next().charAt(0);
		
		double deposit = 0;		
		if (willDeposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			deposit = sc.nextDouble();			
		}		
		
		BankAccount account = new BankAccount(accNumber, accHolder, deposit); 
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account.toString());
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		deposit = sc.nextDouble();
		account.deposit(deposit);
		System.out.println("Updated account data:");
		System.out.println(account.toString());
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		System.out.println("Updated account data:");
		System.out.println(account.toString());
		
		sc.close();

	}

}
