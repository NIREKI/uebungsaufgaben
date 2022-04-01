package aufgabe_7;

class NamedPoint extends java.awt.Point {
	private String name;

	public NamedPoint(int x, int y, String name) {
		super(x, y);
		this.name = name;
	}

	public NamedPoint(int x, int y) {
		this(x, y, "Punkt");
	}

	public NamedPoint() {
		super();
		this.name = "Punkt";
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return this.name + ": " + this.getX() + " | " + this.getY();
	}
}

public class Aufgabe_7_1 {
	public static void main(String[] args) {
		NamedPoint n = new NamedPoint(5, 5);
		System.out.println(n);
	}
}
