package aufgabe_8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Aufgabe_8_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "numbers.txt";
		try {
			List<String> numbers = Files.readAllLines(Path.of(filename));
			ArrayList<Double> converted = new ArrayList<Double>();
			for(String n : numbers) {
				try {
					converted.add(Double.parseDouble(n));
				} catch(NumberFormatException e) {
					System.out.println(n);
				}
			}
			for(Double d : converted) {
				System.out.println(d);
			}
		} catch (InvalidPathException | IOException e) {
			e.printStackTrace();
		}
	}

}
