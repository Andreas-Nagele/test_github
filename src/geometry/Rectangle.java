package geometry;

public class Rectangle extends Shape{

	private double length;
	private double width;
	
	public Rectangle(double x, double y, double length, double width) {
		super();
		this.setX(x);
		this.setY(y);
		this.length = length;
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	@Override
	/**
	 * Method calculates the circumference of the rectangle
	 */
	public double calcuateCircumference() {
		return 2 * (this.length + this.width);
	}

	@Override
	/**
	 * Method calculates the area of the rectangle
	 */
	public double calculateArea() {
		return this.length * this.width;
	}

}
