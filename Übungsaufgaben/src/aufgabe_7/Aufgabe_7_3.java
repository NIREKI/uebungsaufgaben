package aufgabe_7;

import java.util.ArrayList;

class Obst {

	private String name, farbe;

	public Obst(String name, String farbe) {
		this.name = name;
		this.farbe = farbe;
	}

	public String getName() {
		return this.name;
	}

	public String getFarbe() {
		return this.farbe;
	}

	public String toString() {
		return this.name + ": " + this.farbe;
	}

}

class Apfel extends Obst {
	public Apfel(String farbe) {
		super("Apfel", farbe);
	}
}

class Birne extends Obst {
	public Birne(String farbe) {
		super("Birne", farbe);
	}
}

class Orange extends Obst {
	public Orange(String farbe) {
		super("Orange", farbe);
	}
}

class Obstlager {
	private ArrayList<Obst> list = new ArrayList<Obst>();

	public void add(Obst o) {
		list.add(o);
	}

	public void remove(Obst o) {
		list.remove(o);
	}

	public void print() {
		for (Obst o : list) {
			System.out.println(o);
		}
	}
}

public class Aufgabe_7_3 {
	public static void main(String[] args) {
		Birne b = new Birne("Grün");
		Apfel a = new Apfel("Grün");
		Orange o = new Orange("Blau");
		Apfel a1 = new Apfel("Rot");
		Obstlager ol = new Obstlager();
		ol.add(b);
		ol.add(a);
		ol.add(o);
		ol.add(a1);
		ol.print();
	}
}
