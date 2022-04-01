package aufgabe_5;

import java.util.Arrays;
import java.util.Random;

public class Aufgabe_5_2 {

	public static void main(String[] args)
	{
		int[][] array = new int[10][10];
		//Array random an 3 Orten befüllen
		int[] random = new int[3];
		
		for(int i = 0; i < 3; i++)
		{
			random[i] = (int) (Math.random() * 100 + 1);				
		}
		int zaehler = 0;
		for(int j = 0; j < array.length; j++)
		{
			for(int k = 0; k<array[j].length; k++)
			{
				if(zaehler == random[0] || zaehler == random[1]|| zaehler == random[2])
				{
					array[j][k] = 1;
				}
				else
				{
					array[j][k] = 0;
				}
				zaehler++;
			}
		}
		print(array);
		
		
	}
	
	public static void print(int[][] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array[i].length; j++)
			{
				if(j == array[i].length - 1) System.out.print("|" + array[i][j] + "|");
				else System.out.print("|" + array[i][j]);
			}
			System.out.println();
		}
	}
}
