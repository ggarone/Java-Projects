package model;

public class Dono {
	private String descrizione;
	private double peso;
	
	public Dono(String descrizione, double peso) {
		super();
		this.descrizione = descrizione;
		this.peso = peso;
	}

	public String etichetta() {
		return this.descrizione + " " + this.peso;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
}
