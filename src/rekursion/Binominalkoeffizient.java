package rekursion;

public class Binominalkoeffizient {

	public static int calculateBinominalkoeffizient(int n, int k) {
		if (k == 0 || k == n) {
			return 1;
		}
		return calculateBinominalkoeffizient(n-1, k-1) + calculateBinominalkoeffizient(n-1, k);
	}
	
	public static void main(String[] args) {
		
		System.out.println(calculateBinominalkoeffizient(4, 2));

	}

}
