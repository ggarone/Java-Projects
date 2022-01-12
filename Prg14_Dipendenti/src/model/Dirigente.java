package model;

public class Dirigente extends Dipendente {
	
	private double emoluments;

	public Dirigente(String name, String surname) {
		super(name, surname);
		this.emoluments = 1800;
	}

	@Override
	public double calcolaStipendio() {
		
		return this.emoluments;
	}

}
