package kontobeispiel;

public class Kunde {
	private int Kundennummer;
	private String name;
	private String geburtsdatum;
	private String adresse;
	
	
	
	public int getKundennusmmer() {
		return Kundennummer;
	}

	public void setKundennummer(int kundennummer) {
		Kundennummer = kundennummer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGeburtsdatum() {
		return geburtsdatum;
	}

	public void setGeburtsdatum(String geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
}
