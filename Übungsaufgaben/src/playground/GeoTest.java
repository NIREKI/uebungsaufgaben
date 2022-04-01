package playground;

public class GeoTest {

	public static void main(String[] args) {
		Rechteck r = new Rechteck(3, 5);
		Quadrat q = new Quadrat(3);

		System.out.println(r.getFlaeche());
		System.out.println(q.getFlaeche());

		// Sollte natürlich nicht gehen, da Breite = Laenge in einem Quadrat
		// Lösung: Set und Get in Quadrat überschreiben
		q.setBreite(3);
		q.setLaenge(6);

		// Jedes Quadrat ist ein Rechteck
		Rechteck e = new Quadrat(5);

		// Quadrat q = new Rechteck(5,3)
		// Das geht nicht! Nicht jedes Rechteck ist ein Quadrat

		// Das geht wiederrum, damit kann man das sozusagen erzwingen.
		// Stichwort: Explizitie Typumwandlung!
		Rechteck rneu = new Quadrat(5);
		Quadrat qneu = (Quadrat) rneu;

		// Das geht nicht:
		// Rechteck rneu = new Rechteck(5)
		// Quadrat qneu = (Quadrat)rneu
		// Weil rneu nie ein Quadrat war, im richtigen Beispiel wurde ja ein neues
		// Quadrat erstellt. Das wurde ja im Speicher dann als Quadrat erstellt und dann
		// geht das halt.
		// Eine Fehlermeldung kommt dann erstmal aber nicht, weil der Compiler nicht
		// weiß, was man im Speicher erstellt hat. Beim Ausführen kommt dann der Fehler.

		System.out.println(q.getFlaeche());

		Object o = new Quadrat(5);
		Rechteck r1 = new Quadrat(5);
		Quadrat q1 = new Quadrat(5);

		// Alle Drei geben Quadrat aus, weil sie im Speicher ein Quadrat sind, bzw. auf
		// ein Quadrat verweisen!

		System.out.println(o.toString());
		System.out.println(r1.toString());
		System.out.println(q1.toString());

		// Wenn man eine Klasse als final bezeichnet, dann kann man von dieser Klasse
		// nicht mehr ableiten! z.B. die Klasse Math ist eine final Klasse

		// Math.random();
	}

}
