package playground18032022;

public abstract class Figur {
	void zeichne() {
		System.out.println("Figur: " + getFlaeche());
	}

	// Eine abstrakte Klasse oder Methode kann keine Objekte haben. Au�erdem geben
	// abstrakte Methoden nur an, welche Methoden abgeleitete Klassen haben m�ssen!
	abstract double getFlaeche();
	// Klasse Kreis m�sste somit also die Methode getFlaeche() haben damit sie von
	// Figur erben kann.
}
