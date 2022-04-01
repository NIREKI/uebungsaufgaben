package aufgabe_5;

import java.util.Scanner;

public class Aufgabe_5_3 {

	public static void main(String[] args) 
	{
		// Palindrom prüfen
		/*
		 * sinnvolle Folge von Buchstaben, Wörtern oder Versen, 
		 * die vorwärts- wie rückwärtsgelesen [den gleichen] Sinn ergeben 
		 * (z. B. Reliefpfeiler – Reliefpfeiler, Regal – Lager)
		 */
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		word = word.toLowerCase();
		char[] arr = new char[word.length()];
		
		for(int i = 0;i < word.length(); i++)
		{
			arr[i] = word.charAt(i);
		}
		
		//Auf Palindrom prüfen
		boolean isPalindrom = true;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] != arr[arr.length - 1 - i]) isPalindrom = false;
		}
		System.out.println(isPalindrom);
	}

}
