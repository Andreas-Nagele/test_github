package arrays;

public class Array {

	public static int count5PercentJumps(int [] gains) {
		int numOfJumps = 0;
		if (gains.length == 0) {
			System.out.println("Fehler! Arraygröße ist null");
			return 0;
		}
		for (int i = 1; i < gains.length; i++) {
			if (gains[i] >= gains[i-1] + gains[i-1]/ 20) {
				numOfJumps++;
			}
		}
		return numOfJumps;
	}
	
	public static void main(String [] args) {
		//Tag:                1      2    3    4     5
		int [] dailyGains = {1000, 2000, 500, 9000, 9010};
		System.out.println(count5PercentJumps(dailyGains));
	}
}
