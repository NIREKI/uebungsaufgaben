package playground01042022;

public class Main {

	public static void main(String[] args) {
		String s1 = new String("Hallo");
		StringBuffer s2 = new StringBuffer("Welt");
		StringBuilder s3 = new StringBuilder("!");
		
		Box<String> b1 = new Box<String>(s1);
		Box<StringBuffer> b2 = new Box<StringBuffer>(s2);
		Box<StringBuilder> b3 = new Box<StringBuilder>(s3);
	}
	
}

class Box<T> {

	// Somit können wir jetzt alle möglichen Objekte in die Box legen
	private T content;

	public Box(T c) {
		content = c;
	}
	
	public int getLength() {
		return 0;
	}

}
