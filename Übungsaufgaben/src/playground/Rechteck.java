package playground;

public class Rechteck {
	protected int laenge;
	protected int breite;

	public Rechteck(int l, int b) {
		this.laenge = l;
		this.breite = b;
	}

	public int getLaenge() {
		return laenge;
	}

	public void setLaenge(int laenge) {
		this.laenge = laenge;
	}

	public int getBreite() {
		return breite;
	}

	public void setBreite(int breite) {
		this.breite = breite;
	}

	public int getFlaeche() {
		return this.laenge * this.breite;
	}

	public String toString() {
		return "Rechteck";
	}
}
