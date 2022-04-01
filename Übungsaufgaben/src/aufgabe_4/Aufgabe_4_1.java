package aufgabe_4;

import java.util.Scanner;

public class Aufgabe_4_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean will = true;
		while (will) {
			System.out.println("Bitte geben Sie eine Zahl ein: ");
			int input = scan.nextInt();

			boolean prime = isPrime(input);

			if (prime)
				System.out.println(input + " ist eine Primzahl.");
			else
				System.out.println(input + " ist keine Primzahl");

			System.out.println("\nMöchten Sie noch eine weitere Zahl eingeben?\n1 für Ja, 2 für nein.");

			input = scan.nextInt();

			if (input == 2)
				will = false;
			else if (input == 1)
				;
			else
				System.out.println("Ungültige Eingabe. Programm wird beendet.");
		}
	}

	private static boolean isPrime(int p) {

		return isPrime(p, p - 1);

	}

	private static boolean isPrime(int p, int x) {
		if (x == 1)
			return true;
		else if (x == 0)
			return false;
		else if (p % x == 0) 
			return false;
		else
			return isPrime(p, x - 1);

	}
}
