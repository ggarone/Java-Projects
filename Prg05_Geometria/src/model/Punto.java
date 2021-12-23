package model;

public class Punto {
	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Punto() {
		this.x = 0;
		this.y = 0;
	}
	
	int x,y;

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	
	
	
}
