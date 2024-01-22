package geometry;

public class Test {

	public static void main(String[] args) {
		Shape r1 = new Rectangle(1, 1, 2, 4);
		Shape c1 = new Circle (2, 2, 5);
		Shape t1 = new Triangle(3, 3, 2, 3, 4, 5);
		//Testfunktionen
		System.out.println(r1.calcuateCircumfence());
		System.out.println(r1.calculateArea());
		
		System.out.println(c1.calcuateCircumfence());
		System.out.println(c1.calculateArea());
		
		System.out.println(t1.calcuateCircumfence());
		System.out.println(t1.calculateArea());

	}

}
