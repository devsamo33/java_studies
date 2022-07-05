package application;

import java.util.Scanner;

import entities.Rents;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Rents[] vect = new Rents[10]; 
		
		System.out.println("How many room will be rented? ");
		int n = sc.nextInt();
		
			for (int i=0; i<n; i++) {
				System.out.println();
				System.out.println("Rent #" + i  + ": ");
				System.out.print("name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("Email: ");
				String email = sc.nextLine();
				System.out.println("Room: ");
				int room = sc.nextInt();
					vect[room] = new Rents (name, email);
			
		}
			System.out.println();
			System.out.println("Busy rooms: ");
			for (int i = 0; i<10; i++ ) {
				if(vect[i] != null) {
					System.out.println(i + ": " + vect[i]);
				}
	
			}
	
		sc.close();

	}

}