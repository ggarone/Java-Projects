package model;

public class Quadrato extends Rettangolo{
	private Segmento lato;

	public Quadrato(Segmento lato) {
		super(lato, lato);
		this.lato = lato;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double perimetro() {
		System.out.println("stai usando il medoto override del quadrato");
		return this.lato.lunghezza()*4;
	}
	
	

}
