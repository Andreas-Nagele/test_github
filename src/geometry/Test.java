package geometry;

public class Test {

	public static void main(String[] args) {
		Group g = new Group();
		
		Shape r1 = new Rectangle(1, 1, 2, 4);
		Shape c1 = new Circle (2, 2, 5);
		Shape t1 = new Triangle(3, 3, 2, 3, 4, 5);
		Shape r2 = new Rectangle(5, 5, 3, 6);
		Shape r3 = new Rectangle(4, 3, 6, 9);
		//Testfunktionen
		System.out.println(r1);
		System.out.println(c1);
		System.out.println(t1);
		
		System.out.println(r1.calcuateCircumference());
		System.out.println(r1.calculateArea());
		
		System.out.println(c1.calcuateCircumference());
		System.out.println(c1.calculateArea());
		
		System.out.println(t1.calcuateCircumference());
		System.out.println(t1.calculateArea());
		
		g.addShape(r1);
		g.addShape(r2);
		g.addShape(r3);
		g.addShape(c1);
		g.addShape(t1);

		System.out.println("Gesamtfläche: " + g.calculateSumArea());
		System.out.println("Gesamtumfang: " + g.calculateSumCircumference());
		
		System.out.println("Größte Fläche: " + g.returnGreatestShape());
		
		g.returnGroupedShapes();
		
	}

}
