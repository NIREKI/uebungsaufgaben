package aufgabe_5;

public class Aufgabe_5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] arr = new String[10][10];
		
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = (i + ":" + j + " ");
			}
		}
		print(arr);
	}
	
	public static void print(String[][] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
