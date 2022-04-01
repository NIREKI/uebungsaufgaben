package playground;

public class Quadrat extends Rechteck {

	public Quadrat(int b) {
		super(b, b);
	}

	// @Override ist der Hinweis darauf, dass man eine andere Methode überschrieben
	// hat.

	@Override
	public void setLaenge(int laenge) {
		this.laenge = laenge;
		this.breite = laenge;
	}

	@Override
	public void setBreite(int breite) {
		this.laenge = breite;
		// Super geht eine Stufe nach oben und somit passt das dann halt

		super.setBreite(breite);
	}

	@Override
	public String toString() {
		return "Quadrat";
	}

}
