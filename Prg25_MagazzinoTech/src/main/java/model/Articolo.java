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
	
	public void incrementa(int q) {
		q = Math.abs(q);
		this.quantita += q;
	}
	
	public boolean decrementa(int q) {
		q = Math.abs(q);
		if(this.quantita >= q) {
			this.quantita -= q;
			return true;
		}else {
			System.out.println("operazione non disponibile per insufficienza di pezzi");
			return false;
		}
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
