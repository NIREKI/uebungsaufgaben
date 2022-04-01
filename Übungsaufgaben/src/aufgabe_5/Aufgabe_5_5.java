package aufgabe_5;
//Caesar
import java.util.Scanner;
public class Aufgabe_5_5 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		int anzahl = scan.nextInt();
		System.out.println(encrypt(word, anzahl));
		System.out.println(decrypt(encrypt(word,anzahl),anzahl));
	}
	
	public static String encrypt(String text, int k)
	{
		text = text.toLowerCase();
		String encrypted = "";
		for(int i = 0; i < text.length(); i++)
		{
			
			int charNumber = text.charAt(i);
			//Somit ist "a" die 1 und "z" die 26 wie im richtigen Alphabet.
			charNumber = charNumber - 96;
			//Jetzt muss man nurnoch bei charNumber < 26-k charNumber + k rechnen
			//und ansonsten muss man charNumber + k - 26 rechnen.
			
			if(charNumber < (26-k))
			{
				charNumber = charNumber + k;
			}
			else
			{
				charNumber = charNumber + k -26;
			}
			
			encrypted += String.valueOf((char)(charNumber + 96));
		}
		return encrypted;
	}
	
	public static String decrypt(String text, int k)
	{
		text = text.toLowerCase();
		String decrypted = "";
		for(int i = 0; i < text.length(); i++)
		{
			int charNumber = text.charAt(i);
			charNumber -= 96;
			
			if((charNumber - k) < 1)
			{
				charNumber = (charNumber - k + 26);
			}
			else
			{
				charNumber -= k;
			}
			
			decrypted += String.valueOf((char)(charNumber + 96));
		}
		return decrypted;
	}
}
