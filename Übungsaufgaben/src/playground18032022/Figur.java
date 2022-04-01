package playground18032022;

public abstract class Figur {
	void zeichne() {
		System.out.println("Figur: " + getFlaeche());
	}

	// Eine abstrakte Klasse oder Methode kann keine Objekte haben. Außerdem geben
	// abstrakte Methoden nur an, welche Methoden abgeleitete Klassen haben müssen!
	abstract double getFlaeche();
	// Klasse Kreis müsste somit also die Methode getFlaeche() haben damit sie von
	// Figur erben kann.
}
