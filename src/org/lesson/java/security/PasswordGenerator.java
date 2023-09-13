package org.lesson.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	public static void main(String[] args) {
		Scanner scIn = new Scanner(System.in);
		
		System.out.println("Inserisci il tuo nome");
		String firstName = scIn.nextLine();
		
		System.out.println("Inserisci il tuo cognome");
		String lastName = scIn.nextLine();

		System.out.println("Inserisci il tuo colore preferito");
		String favouriteColor = scIn.nextLine();

		System.out.println("Inserisci il tuo giorno di nascita");
		int dd = scIn.nextInt();

		System.out.println("Inserisci il tuo mese di nascita");
		int mm = scIn.nextInt();
		
		System.out.println("Inserisci il tuo mese di nascita");
		int yy = scIn.nextInt();
		
		scIn.close();
		
		String newPswd = firstName + "-" + lastName + "-" + favouriteColor + '-' + (dd + mm + yy) ;
		System.out.println(newPswd);
	}
}
