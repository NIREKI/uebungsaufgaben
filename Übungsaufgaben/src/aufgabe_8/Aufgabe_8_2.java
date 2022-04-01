package aufgabe_8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.List;

public class Aufgabe_8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "test.txt";
		try {
			List<String> lines = Files.readAllLines(Paths.get(filename));
			String longestWord = "";
			for(String l : lines) {
				if(l.length() > longestWord.length()) {
					longestWord = l;
				}
				System.out.println(l);
				
			}
			System.out.println("Das längste Wort ist: " + longestWord);
		} catch (InvalidPathException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
