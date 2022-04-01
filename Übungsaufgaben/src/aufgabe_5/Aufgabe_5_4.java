package aufgabe_5;

public class Aufgabe_5_4 {

	public static void main(String[] args) 
	{
		//Bubblesort
		int[] arr = {5,1,3,7,2,5,20,4,7};
		sort(arr);
		printArr(arr);
	}
	
	
	//Bubble- Sort Algorithmus für ein Int- Array.
	public static void sort(int[] arr)
	{
		for(int i = 1; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length - i; j++)
			{
				int temp;
				if(arr[j] > arr[j+1])
				{
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	//Dient nur zum Ausgeben des Arrays
	public static void printArr(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

}
