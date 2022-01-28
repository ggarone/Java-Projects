package model;

import java.time.LocalDate;

public class Movimento {
	private String descrizione;
	private int quantita;
	private Articolo articolo;
	private LocalDate dataMovimento;
	
	public Movimento(String descrizione, int quantita, Articolo articolo) {
		super();
		this.dataMovimento = LocalDate.now();
		this.descrizione = descrizione;
		this.quantita = quantita;
		this.articolo = articolo;
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

	public LocalDate getDataMovimento() {
		return dataMovimento;
	}

	public Articolo getArticolo() {
		return articolo;
	}

	@Override
	public String toString() {
		return "Movimento [descrizione=" + descrizione + ", quantita=" + quantita + ", dataMovimento=" + dataMovimento
				+ "]";
	}
	
}
