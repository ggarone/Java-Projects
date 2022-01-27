package model;

public class Articolo implements Comparable<Articolo>{
	private static int counter=0;
	
	private String descrizione;
	private int quantita;
	private int id;
	
	public Articolo(String descrizione, int quantita) {
		super();
		this.descrizione = descrizione;
		this.quantita = quantita;
		this.id = counter++;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Articolo [descrizione=" + descrizione + ", quantita=" + quantita + ", id=" + id + "]";
	}

	@Override
	public int compareTo(Articolo o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
	}
	
	
	
	
	
}
