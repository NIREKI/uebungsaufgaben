package aufgabe_8_4;

public class Person {
	
	
	private String vorname, nachname;
	private int alter;

	public Person(String vorname, String nachname, int alter) throws PersonException {
		this.vorname = vorname;
		setNachname(nachname);
		setAlter(alter);
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) throws PersonException {
		if (nachname == null || nachname.length() < 1)
			throw new PersonException();
		else
			this.nachname = nachname;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) throws PersonException {
		if (alter < 0 || alter > 150)
			throw new PersonException(alter);
		else
			this.alter = alter;
	}

}
