package aufgabe_5;
//Palindrom reloaded
public class Aufgabe_5_8 {

	public static void main(String[] args) 
	{
		String word = "lagerregal";
		System.out.println(isPalindrom(word.toLowerCase()));
	}
	
	public static boolean isPalindrom(String word)
	{
		StringBuilder builder = new StringBuilder(word);
		if(builder.reverse().toString().equals(word)) return true;
		else return false;	
	}

}
