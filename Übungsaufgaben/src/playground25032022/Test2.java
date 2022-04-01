package playground25032022;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			dummy(-5);
		} catch (DummyException e) {
			e.printStackTrace();
			System.out.println(e.wert);
		}
	}

	public static void dummy(int a) throws DummyException {
		if (a < 0)
			throw new DummyException("Der Wert darf nicht kleiner als 0 sein!", a);
	}
}

class DummyException extends Exception {

	int wert = 0;
	
	public DummyException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DummyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public DummyException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public DummyException(String message, int w) {
		super(message);
		wert = w;
		// TODO Auto-generated constructor stub
	}

	public DummyException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
