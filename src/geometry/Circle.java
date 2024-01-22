package geometry;

public class Circle extends Shape{

	private double radius;
	
	public Circle (double x, double y, double radius) {
		this.setX(x);
		this.setY(y);
		this.radius = radius;
	}

	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	/**
	 * Method calculates the circumference of the circle
	 */
	public double calcuateCircumference() {
		return 2 * this.radius * Math.PI;
	}

	@Override
	/**
	 * Method calculates the area of the circle
	 */
	public double calculateArea() {
		return this.radius * this.radius * Math.PI;
	}
}
