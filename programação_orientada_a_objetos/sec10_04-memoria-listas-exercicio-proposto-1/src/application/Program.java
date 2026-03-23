package application;

import java.util.Scanner;

import entities.RentRoom;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		RentRoom[] rentRoom = new RentRoom[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Rent #" + (i + 1) + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();

			rentRoom[room] = new RentRoom(name, email, room);
		}

		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < rentRoom.length; i++) {
			if (rentRoom[i] != null) {
				System.out.println(rentRoom[i].getRoomNumber() + ": " + rentRoom[i].getTenantName() + ", "
						+ rentRoom[i].getTenantEmail());
			}			
		}

		sc.close();
	}

}
