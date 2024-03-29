package geometry;

public class Triangle extends Shape{

	private double a;
	private double b;
	private double c;
	private double height;
	
	
	public Triangle(double x, double y, double a, double b, double c, double height) {
		this.setX(x);
		this.setY(y);
		this.a = a;
		this.b = b;
		this.c = c;
		this.height = height;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getHeight() {
		return height;
	}
	
	public void setHeight (double height) {
		this.height = height;
	}
	
	@Override
	/**
	 * Method calculates the circumference of the triangle
	 */
	public double calcuateCircumference() {
		return this.a + this.b + this.c;
	}

	@Override
	/**
	 * Method calculates the area of the triangle
	 */
	public double calculateArea() {
		return this.c * (height / 2);
	}

	@Override
	public String toString() {
		return "Triangle: \n"
				+ "\t Side a: " + this.a + "\n"
				+ "\t Side b: " + this.b + "\n"
				+ "\t Side c: " + this.c+ "\n"
				+ "\t Height: " + this.height + "\n";
	}
}
