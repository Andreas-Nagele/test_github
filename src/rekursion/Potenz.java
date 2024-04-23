package rekursion;

public class Potenz {

	public static int pow(int basis, int exponent) {
		if (exponent == 0) {
			return 1;
		}
		return basis * pow(basis, exponent-1);
	}
	
	public static void main(String[] args) {
		
		System.out.println(pow(2,4));

	}

}
