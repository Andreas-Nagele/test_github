package exceptions;

public class ProfessorJackson {

	public static double divide(int x, int y) {
		if (y > 0) {
			return x / y;
		} else {
			throw new ArithmeticException();
		}
	}
	
	public static int checkFileExtension (String fileName) {
		if (fileName.endsWith(".java")){
			return 1;
		} 
		try{
			if (fileName.isEmpty() || fileName == null) {
				throw new FileIsEmptyException();
			}
		}
		catch (FileIsEmptyException ex){
			System.out.println("Das abgegebene File ist leer");
			return -1;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		/*
		try {
			System.out.println(divide(2,1));
		} catch (ArithmeticException a) {
			System.out.println("No Divion by zero");
		}
		*/
		System.out.println(checkFileExtension("abc.txt"));
		System.out.println(checkFileExtension("abc.java"));
		System.out.println(checkFileExtension(""));
	}

}
