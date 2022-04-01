
public class Aufgabe_2_1 {

	public static void main(String[] args) {
		int jahr = new java.util.Scanner(System.in).nextInt();
		
		if(jahr % 4 == 0)
		{
			if(jahr % 100 == 0)
			{
				if(jahr % 400 == 0 )
				{
					//durch 4, 100 und 400 teilbar, also Schaltjahr
					System.out.println("Schaltjahr!");
				}
				//durch 4 und 100 teilbar, aber nicht durch 400 = kein Schaltjahr
				else
				{
					System.out.println("Kein Schaltjahr!");
				}
			}
			//Durch 4 teilbar, aber nicht durch 100, also ein Schaltjahr
			else
			{
				System.out.println("Schaltjahr!");
			}
			
		}
		//Nicht durch 4 teilbar -> Kein Schaltjahr.
		else
		{
			System.out.println("Kein Schaltjahr!");
		}

	}

}
