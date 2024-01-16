package geometry;

public class Rectangle extends Shape{

	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		super();
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
	public double calcuateCircumfence() {
		return 2 * (this.length + this.width);
	}

	@Override
	public double calculateArea() {
		return this.length * this.width;
	}

}
