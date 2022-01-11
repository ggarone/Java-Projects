package model;

public class Segmento {
	private Punto a;
	private Punto b;
	
	public Segmento(Punto a, Punto b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public double lunghezza() {
		double lunghezza=0;
		
		//pitagora
		lunghezza = Math.sqrt(Math.pow(b.getX() - a.getX(),2) + Math.pow(b.getY() - a.getY(), 2));
		
		
	
		
		return lunghezza;
	}
	
	
}
