package playground31032022;

import java.util.ArrayList;

public class BoxBeispiel {

	public static void main(String[] args) {

		Box b1 = new Box("Hallo");
		Box b2 = new Box("Welt");
		System.out.println(b1.content + " " + b2.content);

		Box b3 = new Box(Integer.valueOf(5));

		System.out.println(b3.content);

		// if(b3.content instanceof Integer) System.out.println(b3.content);

		// Somit haben wir wieder einen String und können jetzt auf die Methoden von
		// String zugreifen.

		// Allerdings prüfen wir garnicht, ob es sich bei b1 um einen String handelt!
		
		String s = (String) b1.content;
		System.out.println(s.charAt(0));
		
		Box<String> b4 = new Box<String>("abc");
		Box<Integer> b5 = new Box<Integer>(5);
		
		// So kennt man das ja schon
		ArrayList<String> list = new ArrayList<String>();
	
	}

}

//Mit einem Platzhalter T müssen wir beim Erstellen sagen, was dort steht
class Box<T> {

	// Somit können wir jetzt alle möglichen Objekte in die Box legen
	T content;

	public Box(T c) {
		content = c;
	}

}
