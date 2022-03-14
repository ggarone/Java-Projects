package model;

import java.util.Random;

public abstract class Veicolo implements Comparable<Veicolo> {
	
	private static int counter = 1;
	
	private int id;
	protected TipoVeicolo tipo;
	protected int anno;
	protected double prezzo;
	protected double costoNoleggio;
	protected double prezzoVendita;
	
	public Veicolo() {
		this.id = counter++;
//		this.prezzo = getPrezzoCasuale();
	}
	
	public Veicolo(int anno) {
		super();
		this.anno = anno;
	}
	
	public void setAnno(int anno) {
		this.anno = anno;
	}

	protected double getPrezzoCasuale() {
		double price = 0;
		Random r = new Random();
		
		switch(tipo) {
			case AUTO -> price = r.nextDouble(15000);
			case BARCHE -> price = r.nextDouble(50000);
			case CAMION -> price = r.nextDouble(150000);
			case BICI -> price = r.nextDouble(5000);
			case MONO_PATTINO -> price = r.nextDouble(50000);
			case CAMPER -> price = r.nextDouble(75000);
		}
		return price;
	}

	public abstract double getCostoNoleggio();
	public abstract double getPrezzoVendita();
	
	@Override
	public int compareTo(Veicolo o) {
		return this.id - o.id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Veicolo [id=" + id + ", tipo=" + tipo + ", anno=" + anno + ", prezzo=" + prezzo + ", costoNoleggio="
				+ costoNoleggio + ", prezzoVendita=" + prezzoVendita + "]";
	}


}
