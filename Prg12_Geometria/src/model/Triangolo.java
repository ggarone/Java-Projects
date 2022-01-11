package model;

public class Triangolo {
	private Punto a,b,c;
	private Segmento ab,bc,ac;

	public Triangolo(Punto a, Punto b, Punto c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		
		this.ab = new Segmento(a,b);
		this.bc = new Segmento(b,c);
		this.ac = new Segmento(a,c);
		
	}

	public Punto getA() {
		return a;
	}

	public void setA(Punto a) {
		this.a = a;
	}

	public Punto getB() {
		return b;
	}

	public void setB(Punto b) {
		this.b = b;
	}

	public Punto getC() {
		return c;
	}

	public void setC(Punto c) {
		this.c = c;
	}
	
	public double perimetro() {
		return this.ab.lunghezza() + this.ac.lunghezza() + this.bc.lunghezza();
	}
	
	public double area() {
		//formula erone
		return Math.sqrt(this.perimetro()/2 * (this.perimetro()/2 - ab.lunghezza()) * (this.perimetro()/2 - bc.lunghezza()) * (this.perimetro()/2 - ac.lunghezza()));
	}
	
	

}
