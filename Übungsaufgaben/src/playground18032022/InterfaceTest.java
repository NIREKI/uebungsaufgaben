package playground18032022;

import java.util.ArrayList;

// Mit einem Interface schafft man gemeinsamkeiten zwischen verschiedenen Objekten, 
// das ermöglicht dass man diese Objekte in eine gemeinsame Liste packen kann, zum 
// Beispiel. 
interface FarbObjekt {
	public String getFarbe();
}

public class InterfaceTest {
	public static void main(String[] args) {
		Stift s = new Stift();
		Obst o = new Obst();

		ArrayList<FarbObjekt> list = new ArrayList<FarbObjekt>();

		list.add(s);
		list.add(o);

		System.out.println(list.toString());
	}
}

class Stift implements FarbObjekt {
	String farbe;

	public String getFarbe() {
		return this.farbe;
	}

}

class Obst implements FarbObjekt {
	String farbe;

	@Override
	public String getFarbe() {
		return farbe;
	}
}