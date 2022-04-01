package aufgabe_7_6;

public abstract class Figur implements Comparable<Figur> {

	@Override
	public int compareTo(Figur o) {
		// TODO Auto-generated method stub
		if (this.getFlaeche() < o.getFlaeche()) {
			return -1;
		} else if (this.getFlaeche() == o.getFlaeche()) {
			return 0;
		} else {
			return 1;
		}
	}

	abstract double getFlaeche();

}

class Kreis extends Figur {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void zeichne() {
		System.out.println(getFlaeche());
	}

	public double getFlaeche() {
		return radius * Math.PI;
	}

}

class Rechteck extends Figur {
	private double breite, hoehe;

	public void zeichne() {
		System.out.println(breite + " " + hoehe + " " + getFlaeche());
	}

	public double getFlaeche() {
		return breite * hoehe;
	}

	public double getBreite() {
		return breite;
	}

	public void setBreite(double breite) {
		this.breite = breite;
	}

	public double getHoehe() {
		return hoehe;
	}

	public void setHoehe(double hoehe) {
		this.hoehe = hoehe;
	}

}
