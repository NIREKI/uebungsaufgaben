package kontobeispiel;

import java.util.ArrayList;

public class Sparkonto extends Konto {
	
	public Sparkonto(int knr, Kunde k) {
		super(knr, k);
	}

	public static void main(String[] args) {
		ArrayList<Konto> list = new ArrayList<Konto>();
		
		Kunde k = new Kunde();
		k.setName("Hans");
		k.setKundennummer(18273);
		k.setGeburtsdatum("01.01.1970");
		k.setAdresse("Musterweg 1, 11111 Musterstadt");
		
		Sparkonto konto1 = new Sparkonto(1, k);
		konto1.setGuthaben(100.23123);
		System.out.println(konto1.getGuthaben());
	}
}
