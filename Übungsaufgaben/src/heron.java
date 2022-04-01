
public class heron {

	public static void main(String[] args) {
		System.out.println("Bitte geben Sie eine Zahl a ein, dessen Quadratwurzel berechnet werden soll: ");
		double a = new java.util.Scanner(System.in).nextDouble();
		double xneu = a;
		double xalt;
		System.out.println(xneu);
		do {
			xalt = xneu;
			xneu = 0.5 * (xalt + (a / xalt));
			System.out.println(xneu);
		} while ((xalt - xneu) > 0.000000000001);

		System.out.println("Quadratwurzel von " + a + " ist: " + xneu);
	}
	
}
