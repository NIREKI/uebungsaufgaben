package aufgabe_3;
import java.util.Scanner;

public class Aufgabe_3_2 {

	public static void main(String[] args) {
		// Standardprogramm ohne eigene Eingaben
//		for(double i = 50; i>=25; i = i - 2.5)
//		{
//			if(i!=25)System.out.print(i + "; ");
//			else System.out.print(i);
//		}

		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte Startwert eingeben: ");
		double i = scan.nextDouble();
		System.out.println("Bitte Endwert eingeben: ");
		double e = scan.nextDouble();
		System.out.println("Bitte Schrittwert eingeben: ");
		double schritt = scan.nextDouble();
		double summe = 0;
		//berechnet die Anzahl der benötigten Schritte, damit man am Ende kein Semikolon ausgibt
		int anzahlSchritte = (int) ((i - e) / schritt) + 1;
		int schrittZaehler = 0;
		for (double j = i; j >= e; j = j - schritt) {
			schrittZaehler++;
			// prüfen ob Kommazahl
			int temp = (int) j;
			if ((j - temp) == 0) {
				// Dann schauen, ob Semikolon ausgegeben werden muss oder nicht
				if (schrittZaehler == anzahlSchritte)
					System.out.print((int) j + "\n");
				else
					System.out.print((int) j + "; ");
			} 
			else {
				if (schrittZaehler == anzahlSchritte)
					System.out.print(j + "\n");
				else
					System.out.print(j + "; ");
			}
			summe += j;
		}

		double mittelwert = summe / anzahlSchritte;
		System.out.println("Mittelwert: " + mittelwert + "\nSumme: " + summe);
	}

}
