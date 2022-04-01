package zusatzaufgaben;

import java.util.Scanner;
import java.awt.Point;

public class schwer {
	
	static Scanner scan = new Scanner(System.in);
	public static void main (String[] args)
	{
		
		System.out.println("Wieviele Primzahlen?");
		int n = scan.nextInt();
		int i = 1;
		int zaehler = 1;
		
		Point[] array = new Point[n];
		while(i <= n)
		{
			if(isPrime(zaehler))
			{
				array[i-1] = new Point(zaehler, i);
//				System.out.println("(" + array[i-1].x +" | " + array[i-1].y + ")");
				i++;
			}
			zaehler++;
		}
		for(Point p: array)
		{
			System.out.print("(" + p.x +" | " + p.y + ") ");
		}
		
	}
	
	//Primzahlentest iterativ, aus dem internet kopiert als einer der effizienteren Algorithmen
	private static boolean isPrime(int value) {
		if (value <= 16) {
            return (value == 2 || value == 3 || value == 5 || value == 7 || value == 11 || value == 13);
        }
        if (value % 2 == 0 || value % 3 == 0 || value % 5 == 0 || value % 7 == 0) {
            return false;
        }
        for (long i = 10; i * i <= value; i += 10) {
            if (value % (i+1) == 0) {  // 11, 21, 31, 41, 51, ...
                return false;
            }
            if (value % (i+3) == 0) {  // 13, 23, 33, 43, 53, ...
                return false;
            }
            if (value % (i+7) == 0) {  // 17, 27, 37, 47, 57, ...
                return false;
            }
            if (value % (i+9) == 0) {  // 19, 29, 39, 49, 59, ...
                return false;
            }
        }
        return true;


	}
}	
