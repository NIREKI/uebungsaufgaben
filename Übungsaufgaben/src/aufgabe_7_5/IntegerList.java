package aufgabe_7_5;

public interface IntegerList {
	int getLength();
	// liefert die L�nge der gesamten Liste
	void insertLast(int value);
	// f�gt value am Ende der Liste an
	int getFirst();
	// liefert das erste Element der Liste
	void deleteFirst();
	// l�scht das erste Element der Liste
	boolean search(int value);
	// pr�ft, ob value in der Liste vorkommt.
}
