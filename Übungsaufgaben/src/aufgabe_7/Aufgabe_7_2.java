package aufgabe_7;

class Figur {
	double flaecheninhalt;

	public void zeichne() {
		System.out.println("Fläche: " + getFlaeche());
	}

	private double getFlaeche() {
		return 0.0;
	}
}

class Rechteck {
	double laenge, breite;

	public Rechteck(double l, double b) {
		this.laenge = l;
		this.breite = b;
	}
}

public class Aufgabe_7_2 {
	public static void main(String[] args) {
		Rechteck r = new Rechteck(5, 5);
	}
}
