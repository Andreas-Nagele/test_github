package geometry;

import java.util.ArrayList;

public class Group {
	
	private ArrayList <Shape> shapes;

	public Group(ArrayList<Shape> shapes) {
		this.shapes = new ArrayList<Shape>();
	}

	public ArrayList<Shape> getShapes() {
		return shapes;
	}

	public void setShapes(ArrayList<Shape> shapes) {
		this.shapes = shapes;
	}
	

}
