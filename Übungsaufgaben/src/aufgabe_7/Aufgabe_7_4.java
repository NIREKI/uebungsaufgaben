package aufgabe_7;


abstract class Figur1{
	
	abstract void zeichne();
	
	abstract double getFlaeche();
	
}

class Rechteck1 extends Figur1{

	double breite, hoehe;
	
	@Override
	void zeichne() {
		// TODO Auto-generated method stub
		System.out.println(getFlaeche());
	}

	@Override
	double getFlaeche() {
		
		return breite*hoehe;
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

class Kreis1 extends Figur1{

	double radius;
	@Override
	void zeichne() {
		// TODO Auto-generated method stub
		System.out.println(getFlaeche());
	}

	@Override
	double getFlaeche() {
		// TODO Auto-generated method stub
		return radius * Math.PI;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
}
public class Aufgabe_7_4 {
	public static void main(String[] args) {
		
		Kreis1 kreis = new Kreis1();
		kreis.setRadius(3.5);
		kreis.zeichne();
		
		Rechteck1 recht = new Rechteck1();
		recht.setBreite(2);
		recht.setHoehe(3);
		recht.zeichne();
	}
}
