package myFirstPackage;

public class UnderstandingExcepationHandling {

	public static void testFinally() {

		try {
			System.out.println("Try block excuted");
			return;
		} finally {
			System.out.println("Finaly block excuted");

		}
	}

	public static void underStadingThrows() throws ArithmeticException {
		int a = 10 / 0;
		System.out.println("Throws");

	}

	public static void setAge(int age) {

		if (age < 30) {
			throw new IllegalArgumentException("Invalid age");
		}
	}

	public static void throwException() {
		throw new ArithmeticException();

	}

	public static void main(String[] args) {

		try {
			int a = 10 / 0;

		} catch (ArithmeticException e) {
			System.out.println("Exception has Occur : " + e);
		}

		System.out.println("Further Execution");

		String str = null;
		try {
			System.out.println(str.length());// run time Exception
		} catch (NullPointerException e) {

			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally is excuted");

		}

		testFinally();
		setAge(23);

		try {
			underStadingThrows();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());

		}

		throwException();

		String str2 = "kishan";

	}

}
