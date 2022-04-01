package aufgabe_5;

public class Aufgabe_5_9 {

	public static void main(String[] args) 
	{
		String kette = "ha4lo578";
		System.out.println(digitSum(kette));
	}
	
	public static int digitSum(String word)
	{
		int sum = 0;
		for(int i = 0; i < word.length(); i++)
		{
			if(Character.isDigit(word.charAt(i)))
			{
				//-48 weil der char '1' den Zahlenwert 49 hat. (Beim cast)
				sum += word.charAt(i) - 48;
			}
		}
		return sum;
	}
 

}
