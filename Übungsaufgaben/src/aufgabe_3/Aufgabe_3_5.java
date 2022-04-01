package aufgabe_3;

public class Aufgabe_3_5 {

	public static void main(String[] args) {
		//Tannenbaum einfach
		
//		for(int i = 1; i<=5; i++)
//		{
//			for(int j = 0; j<i; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		
		//Tannenbaum "schwer" mit Leerzeichen
		//Ansatz: Ich habe 7 Zeichen maximal, wie viele davon müssen Leerzeichen sein?
		
		//Wieviele Zeichen? Am besten ungerade
		int anzahlZeichen = 9;
		for(int i = 1; i<=anzahlZeichen; i+=2)
		{
			//Anzahl der Leerzeichen
			int leer = anzahlZeichen - i;
			//Anzahl der Leerzeichen links von den Sternen
			int div = leer/2;
			for(int j = 1; j<=anzahlZeichen; j++)
			{
				//j im Bereich der Leerzeichen? (links davon oder recht davon)
				//rechts davon -> links davon + anzahl Sterne! j größer als dieser Wert
				if(j <= div || j > (div + i))
				{
					System.out.print(" ");
				}
				//j im Bereich der Sterne?
				else System.out.print("*");
			}
			//Am Ende immer Zeilenumbruch
			System.out.print("\n");
		}
	}

}
