package aufgabe_5;

//Variable Anzahl als Double Array

public class Aufgabe_5_6 {

	public static void main(String[] args) 
	{
		double[] arr = {1.0, 2.0, 3.0, 4.0};
		System.out.println(summe(arr));
		System.out.println(produkt(arr));
		System.out.println(mittelwert(arr));
		System.out.println(varianz(arr));
	}

	public static double summe(double[] arr)
	{
		double summe = 0;
		for(double i: arr)
		{
			summe += i;
		}
		return summe;
	}
	
	public static double produkt(double[] arr)
	{
		int prod = 1;
		for(double i: arr)
		{
			prod *= i;
		}
		return prod;
	}
	
	public static double mittelwert(double[] arr)
	{
		double mittelwert = summe(arr) / arr.length;
		return mittelwert;
	}
	
	public static double varianz(double[] arr)
	{
		double varianz = 0;
		double summe = summe(arr);
		double mittelwert = mittelwert(arr);
		
		for(double i: arr)
		{
			varianz += ((i - mittelwert) * (i - mittelwert));
		}
		
		return varianz/arr.length;
	}
}
