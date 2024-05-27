package exceptions;

public class ProfessorJackson {

	public static double divide(int x, int y) {
		if (y > 0) {
			return x / y;
		} else {
			throw new ArithmeticException();
		}
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(divide(2,1));
		} catch (ArithmeticException a) {
			System.out.println("No Divion by zero");
		}
	}

}
