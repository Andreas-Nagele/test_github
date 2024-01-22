package geometry;

import java.util.ArrayList;

public class Group {
	
	private ArrayList <Shape> shapes;

	public Group() {
		this.shapes = new ArrayList<Shape>();
	}

	public ArrayList<Shape> getShapes() {
		return shapes;
	}

	public void setShapes(ArrayList<Shape> shapes) {
		this.shapes = shapes;
	}
	
	public void addShape(Shape s) {
		if (!this.shapes.contains(s)) {
			this.shapes.add(s);
		}
	}
	
	public void removeShape (Shape s) {
		this.shapes.remove(s);
	}
	
	public double calculateSumArea() {
		double a = 0;
		for (Shape s : this.shapes) {
			a += s.calculateArea();
		}
		return a;
	}
	
	public double calculateSumCircumfence() {
		double c = 0;
		for (Shape s : this.shapes) {
			c += s.calcuateCircumference();
		}
		return c;
	}

}
