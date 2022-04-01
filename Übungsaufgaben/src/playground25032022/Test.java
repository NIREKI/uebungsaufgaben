package playground25032022;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Test {

	public static void main(String[] args) {

		String text = "Na";

		try {
			Files.writeString(Path.of("test.txt"), text, StandardOpenOption.CREATE);
		} catch (IOException e) {
			e.printStackTrace();
		}

		String erg = null;

		try {
			erg = Files.readString(Path.of("test.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Wird immer ausgeführt");
		}

		System.out.println(erg);
	}
}
