package aufgabe_8_4;

public class PersonException extends Exception {
	public PersonException() {
		super("Deine Eingabe ist ungültig");
	}

	public PersonException(int number) {
		super("Dein Alter ist kleiner als 0 oder größer als 150.");
	}
}
