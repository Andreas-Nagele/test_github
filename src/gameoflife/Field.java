package gameoflife;

public class Field {
	
	private int length;
	private int width;
	private char symbol;
	
	public Field(int length, int width, char symbol) {
		this.setLength(length);
		this.setWidth(width);
		this.symbol = symbol;
	}

	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		if (length > 0) {
			this.length = length;
		}
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		if (length > 0) {
			this.width = width;
		}
	}
	
	

}
