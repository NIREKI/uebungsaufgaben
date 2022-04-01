package aufgabe_8_4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			Person p = new Person("niklas", null, -1);
//		} catch(IllegalArgumentException e) {
//			e.printStackTrace();
//		}
//		try {
//			Person p1 = new Person("niklas", "kinze", 18);
//			System.out.println(p1.getNachname());
//		} catch(IllegalArgumentException e) {
//			e.printStackTrace();
//		}
		
		try {
			Person p = new Person("niklas", "", 18);
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Person p1 = new Person("niklas", "kinze", 160);
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Person p2 = new Person("niklas", null, -1);
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
