package kontobeispiel;

public class Konto {
	private int kontonummer;
	private String bic;
	private Kunde kunde;
	private double guthaben;

	/*
	 * public Sparkonto(){ super(); } Steht immer automatisch da, sieht man aber
	 * nicht Legt man selbst einen an, dann verschwindet dieser automatisch
	 * generierte.
	 */

	public Konto(int knr, Kunde k) {
		this.kontonummer = 50080 + knr;
		this.kunde = k;
	}

	public int getKontonummer() {
		return kontonummer;
	}

	public void setKontonummer(int kontonummer) {
		this.kontonummer = kontonummer;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public Kunde getKunde() {
		return kunde;
	}

	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}

	public double getGuthaben() {
		return guthaben;
	}

	public void setGuthaben(double guthaben) {
		this.guthaben = guthaben;
	}

}
