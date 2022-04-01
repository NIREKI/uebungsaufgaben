package aufgabe_3;

import java.util.Scanner;

public class Aufgabe_3_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean will = true;

		while (will) {
			System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 100 ein: ");
			double eingabe = scan.nextDouble();

			if (eingabe >= 1 && eingabe <= 100) {
				while (eingabe > 0.001) {
					System.out.println(eingabe);
					eingabe = eingabe / 2;
				}
				System.out.println(eingabe);
			} else {
				System.out.println("Ihre Zahl ist nicht zwischen 1 und 100.");
			}

			System.out.println("M�chten Sie eine weitere Zahle eingeben? 1 f�r ja, 2 f�r nein.");

			int antwort = scan.nextInt();
			if (antwort == 1)
				will = true;
			else if (antwort == 2)
				will = false;
			else
				System.out.println("Eingabe ung�ltig.");

		}
		System.out.println("Tsch�ss");
	}
}
