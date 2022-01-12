package model;

public abstract class Dipendente {
	
	private static int counter = 1;
	
	private int matricola;
	private String name;
	private String surname;
	
	public Dipendente(String name, String surname) {
		super();
		this.matricola = counter++;
		this.name = name;
		this.surname = surname;
	}
	
	public int getMatricola() {
		return matricola;
	}
	
	public abstract double calcolaStipendio();

	@Override
	public String toString() {
		return "Dipendente [matricola=" + matricola + ", name=" + name + ", surname=" + surname
				+ ", calcolaStipendio()=" + calcolaStipendio() + "]";
	}

}


