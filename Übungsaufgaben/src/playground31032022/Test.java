package playground31032022;

import java.util.ArrayList;

/*
 * Wrapper Klassen, Klassen die primitive Datentypen in eine Klasse 
 * umwandeln
 */

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Millisekunden ab dem 1. Januar 1970
		long start = System.currentTimeMillis();
		
		for (int i = 0; i<10000; i++) {
			System.out.println(i);
		}
		
		long ende = System.currentTimeMillis();
		
		System.out.println(ende-start);
		int x = 5;
		doStuff(x);
		// System.out.println(x);
		// Gibt 5 aus, also in der Methode
		// unten wird das kopiert und eine neue Variable wird im Speicher angelegt, bei
		// primitiven Datentypen

		// Wrapper:

		Integer y = Integer.valueOf("5");

		// Sachen die mit primitiven Möglich sind, sind auch mit Wrappern möglich
		y = y + 1;
		int z = y;
		ArrayList<Integer> irgendwas = new ArrayList<Integer>();
	}

	public static void doStuff(int x) {
		x = x + 1;

	}

}
