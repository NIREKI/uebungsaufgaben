package aufgabe_4;

import java.awt.Point;
import java.util.Random;
import java.util.Scanner;

public class Aufgabe_4_2 {
	
	//Alle notwendigen Objekte/ Variablen
	
	static Point player, player2, geld, door;
	static boolean geld1 = false, geld2 = false, versuche = true;
	
	public static void main (String[] args)
	{
		
		/*
		 * Erzeugung zweier Point-Objekte und Nutzung verschiedener Attribute und Methoden
		 */
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		player = new Point(1, 1);		
		
		do {
			//Geld darf nicht da sein wo was anderes ist.
			player2 = new Point(rand.nextInt(9) + 1, rand.nextInt(9) + 1);
		}while(player2.equals(player));
		
		do {
			//Geld darf nicht da sein wo was anderes ist.
			geld = new Point(rand.nextInt(9) + 1, rand.nextInt(9) + 1);
		}while(geld.equals(player) || geld.equals(player2));
		
		do {
			//Tür darf nicht da sein wo was anderes ist.
			door = new Point(rand.nextInt(9) + 1, rand.nextInt(9) + 1);
		}while(door.equals(player) || door.equals(player2) || door.equals(geld));
		
		//boolean für das Ende


		//Spielbrett einmal zeichnen
		draw();
		//Schleife in der das Spiel 
		while(versuche)
		{
			String input = scan.next();
			char inputClear = input.charAt(0);
			//Movement für Spieler, kann horizontal und vertikal
			player1Move(inputClear);
			//Movement für Gegner, kann horizontal vertikal und diagonal gehen
			player2Move(scan.next());
			
			
			//Hat einer der beiden Spieler das Geld gefunden?
			if(player.equals(geld))
			{
				System.out.println("Spieler 1 hat das Geld gefunden, jetzt fehlt nurnoch die Tür!");
				geld1 = true;
			}
			else if(player2.equals(geld))
			{
				System.out.println("Spieler 2 hat das Geld gefunden, jetzt fehlt nurnoch die Tür!");
				geld2 = true;
			}
			
			//Die 10x10 Matrix zeichnen
			draw();
			
			//Prüfen ob ein Spieler gewonnen hat (Tür und Geld zuerst erreicht)
			if(geld1 && player.equals(door))
			{
				System.out.println("Spieler 1 hat die Tür gefunden. \nSpieler 1 hat gewonnen! Das Spiel ist nun vorbei.");
				versuche = false;
			}
			else if (geld2 && player2.equals(door))
			{
				System.out.println("Spieler 2 hat die Tür gefunden. \nSpieler 2 hat gewonnen! Das Spiel ist nun vorbei.");
				versuche = false;
			}
			
			
			
		}

	}
	
	public static void draw()
	{
		//Diese Funktion zeichnet die 10*10 Matrix nach jedem Spiel erneut.
		
		for(int y = 1; y <= 10; y++)
		{
			for (int x = 1; x <= 10; x++)
			{
				if(player.equals(new Point(x,y))) System.out.print(" P ");
				else if(player2.equals(new Point(x,y))) System.out.print(" G ");
				else if(geld.equals(new Point(x,y))) System.out.print(" $ ");
				else if(door.equals(new Point(x,y))) System.out.print(" D ");
				else System.out.print(" X ");
			}
			System.out.print("\n");
		}
		
	}
	
	public static void player1Move(char dir)
	{
		switch(dir)
		{
		case 'u':
			player.setLocation(player.getX(), player.getY() - 1);
			break;
		case 'd':
			player.setLocation(player.getX(), player.getY() + 1);
			break;
		case 'l':
			player.setLocation(player.getX() - 1, player.getY());
			break;
		case 'r':
			player.setLocation(player.getX() + 1, player.getY());
			break;
		default:
			
		}
	}
	
	public static void player2Move(String dir)
	{
		switch(dir)
		{
		case "u":
			player2.setLocation(player2.getX(), player2.getY() - 1);
			break;
		case "d":
			player2.setLocation(player2.getX(), player2.getY() + 1);
			break;
		case "l":
			player2.setLocation(player2.getX() - 1, player2.getY());
			break;
		case "r":
			player2.setLocation(player2.getX() + 1, player2.getY());
			break;
		case "ur":
			player2.setLocation(player2.getX() + 1, player2.getY() - 1);
			break;
		case "ul":
			player2.setLocation(player2.getX() - 1, player2.getY() - 1);
			break;
		case "dr":
			player2.setLocation(player2.getX() + 1, player2.getY() + 1);
			break;
		case "dl":
			player2.setLocation(player2.getX() - 1, player2.getY() + 1);
			break;
		default:
			
		}
	}
}
