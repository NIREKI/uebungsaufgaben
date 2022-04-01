package aufgabe_5;

import java.util.Scanner;

public class Aufgabe_5_1 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int[] eingabe1;
		int[] eingabe2; 
		System.out.println("Bitte geben Sie jetzt 3 Zahlen ein:");
		eingabe1 = eingabe();
		System.out.println("Bitte geben Sie jetzt nochmal 3 Zahlen ein:");
		eingabe2 = eingabe();
		int skalar = 0;
		for(int i = 0; i < eingabe1.length; i++)
		{
			skalar = skalar + (eingabe1[i] * eingabe2[i]);
		}
		System.out.println(skalar);
	}
	
	public static int[] eingabe()
	{
		int[] input = new int[3];
		
		for(int i = 0; i < 3; i++)
		{
			System.out.println("Bitte Zahl " + (i+1) +  " eingeben:");
			input[i] = scan.nextInt();
		}
		
		return input;
	}
}
