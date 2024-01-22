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
	
	/**
	 * Method adds a shape to ArrayList
	 * @param s ist he shape you want to add
	 */
	public void addShape(Shape s) {
		if (!this.shapes.contains(s)) {
			this.shapes.add(s);
		}
	}
	
	/**
	 * Method removes a shape from ArrayList
	 * @param s is the shape you want to remove
	 */
	
	public void removeShape (Shape s) {
		this.shapes.remove(s);
	}
	
	/**
	 * Method calculates the sum of all Areas
	 * @return Sum of all areas
	 */
	public double calculateSumArea() {
		double a = 0;
		for (Shape s : this.shapes) {
			a += s.calculateArea();
		}
		return a;
	}
	
	/**
	 * Method calculates the sum of all circumferences
	 * @return Sum of all circumferences
	 */
	public double calculateSumCircumference() {
		double c = 0;
		for (Shape s : this.shapes) {
			c += s.calcuateCircumference();
		}
		return c;
	}
	
	/**
	 * Method returns the greatest shape based on area
	 * @return biggest shape
	 */
	public Shape returnGreatestShape() {
		double max = 0;
		Shape greatestShape = null;
		for (Shape s : this.shapes) {
			if (s.calculateArea() > max) {
				max = s.calculateArea();
				greatestShape = s;
			}
		}
		return greatestShape;
	}
	
	/**
	 * Method prints all shapes grouped by their instance
	 */
	public void returnGroupedShapes() {
		ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
		ArrayList<Triangle> triangles = new ArrayList<Triangle>();
		ArrayList<Circle> circles = new ArrayList<Circle>();
		for (Shape s : this.shapes) {
			if(s instanceof Rectangle) {
				rectangles.add((Rectangle) s);
			} else if (s instanceof Triangle) {
				triangles.add((Triangle) s);
			} else if (s instanceof Circle) {
				circles.add((Circle)s);
			}
		}
		System.out.println("Rectangles: \n" + rectangles);
		System.out.println("Triangles: \n" + triangles);
		System.out.println("Circles: \n" + circles);
	}
}
