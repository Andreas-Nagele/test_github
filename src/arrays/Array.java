package arrays;

import java.awt.Point;

public class Array {

	public static int count5PercentJumps(int [] gains) {
		int numOfJumps = 0;
		if (gains.length == 0) {
			System.out.println("Fehler! Arraygr��e ist null");
			return 0;
		}
		for (int i = 1; i < gains.length; i++) {
			if (gains[i] >= gains[i-1] + gains[i-1]/ 20) {
				numOfJumps++;
			}
		}
		return numOfJumps;
	}
	
	public static boolean isProabablyApproaching(String [] signs) {
		if (signs.length == 0) {
			System.out.println("Fehler! Arraygr��e ist null");
			return false;
		}
		for (int i = 3; i < signs.length; i++) {
			if (signs[i].equals(signs[i-1]) && signs[i].equals(signs[i-2]) && signs[i].equals(signs[i-3])) {
				return true;
			}
		}
		return false;
	}
	
	public static double shortestDistanceToPoint (Point [] points, int size) {
		double shortestDistance = -1;
		Point zp = new Point(); // zp ... Zero point (=Nullpunkt)
		for (int i = 0; i < points.length; i++) {
			if ((points[i].distance(zp) < shortestDistance || shortestDistance == -1) && i < size) {
				shortestDistance = points[i].distance(zp);
				size++;
			}
		}
		return shortestDistance;
		// Um den Punkt zur�ckzugeben, muss als R�ckgabedatentyp Point gew�hlt werden und
		// eine entsprechende R�ckgabevariable erstellt werden.
		// Bsp.:
		// public static Point ...
		// Point shortestDistance;
		// ...
		// (in der If-Anweisung): shortestDistance = points[i];
		// return shortestDistance;
	}
	public static void main(String [] args) {
		//Tag:                1      2    3    4     5
		int [] dailyGains = {1000, 2000, 500, 9000, 9010};
		System.out.println(count5PercentJumps(dailyGains));
		
		String [] signs1 = {"F", "DO", "MOS", "MOS", "MOS", "MOS", "WES"};
		String [] signs2 = {"F", "DO", "MOS", "MOS", "WES", "MOS", "MOS"};
		
		System.out.println(isProabablyApproaching(signs1));
		System.out.println(isProabablyApproaching(signs2));
		
		Point [] points = {new Point (10, 20), new Point (12, 2), new Point (44, 4)};
		System.out.println(shortestDistanceToPoint(points, 3));
	}
}
