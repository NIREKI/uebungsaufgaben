package aufgabe_7_5;

public interface IntegerList {
	int getLength();
	// liefert die Länge der gesamten Liste
	void insertLast(int value);
	// fügt value am Ende der Liste an
	int getFirst();
	// liefert das erste Element der Liste
	void deleteFirst();
	// löscht das erste Element der Liste
	boolean search(int value);
	// prüft, ob value in der Liste vorkommt.
}
