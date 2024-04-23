package rekursion;

public class Faculty {
	
	public static int calculateFaculty(int n) {
		if (n == 0) {
			return 1;
		}
		return n*calculateFaculty(n-1);
	}

	public static void main(String[] args) {
		
		System.out.println(calculateFaculty(4));

	}

}